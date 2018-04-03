package controllers

import definitions.ErrorDefinition.{BAD_JSON_FORMAT, EMPTY_JSON_REQUEST, NOT_JSON_REQUEST}
import facades.TaxInvoiceFacade
import javax.inject._
import models.TradeAgreement.TradeAgreement
import play.api.libs.json.{Json, OFormat}
import play.api.mvc._

@Singleton
class TaxInvoiceController @Inject()(cc: ControllerComponents, taxInvoiceFacade: TaxInvoiceFacade) extends AbstractController(cc) {
  def convertTradeAgreementToJson() = Action { implicit request: Request[AnyContent] =>
    request match {
      case _ if !request.hasBody => BadRequest(EMPTY_JSON_REQUEST)
      case _ if request.body.asJson.isEmpty => BadRequest(NOT_JSON_REQUEST)
      case _ => validate[TradeAgreement](request, { tradeAgreement =>
        Ok(taxInvoiceFacade.getTradeAgreementAsJson(tradeAgreement))
      })
    }
  }

  def validate[T](request: Request[AnyContent], action: T => Result)
                 (implicit genericFormat: OFormat[T]): Result = {
    val objectFromJson = Json.fromJson[T](request.body.asJson.get)

    if (objectFromJson.isSuccess) {
      action(objectFromJson.get)
    } else {
      BadRequest(BAD_JSON_FORMAT)
    }
  }
}
