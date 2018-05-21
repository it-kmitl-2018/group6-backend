package controllers

import definitions.ErrorDefinition.{BAD_JSON_FORMAT, EMPTY_JSON_REQUEST, NOT_JSON_REQUEST}
import facades.TaxInvoiceFacade
import javax.inject._
import models.TradeAgreement.TradeAgreementForm
import play.api.mvc._
import utilities.Json

@Singleton
class TaxInvoiceController @Inject()(cc: ControllerComponents, taxInvoiceFacade: TaxInvoiceFacade)
  extends AbstractController(cc) {
  def convertToJson() = Action { implicit request: Request[AnyContent] =>
    validate[TradeAgreementForm](request, { tradeAgreement =>
      Ok(taxInvoiceFacade.getTradeAgreementAsJson(tradeAgreement))
    })
  }

  def convertToXML() = Action { implicit request: Request[AnyContent] =>
    validate[TradeAgreementForm](request, { tradeAgreement =>
      Ok(taxInvoiceFacade.getTradeAgreementAsXML(tradeAgreement))
    })
  }

  private def validate[T: Manifest](request: Request[AnyContent], action: T => Result): Result = {
    request match {
      case _ if !request.hasBody => BadRequest(EMPTY_JSON_REQUEST)
      case _ if request.body.asJson.isEmpty => BadRequest(NOT_JSON_REQUEST)
      case _ if as[T](request).isEmpty => BadRequest(BAD_JSON_FORMAT)
      case _ => action(as[T](request).get)
    }
  }

  private def as[T: Manifest](request: Request[AnyContent]): Option[T] =
    Json.toObject[T](request.body.asJson.get.toString)
}
