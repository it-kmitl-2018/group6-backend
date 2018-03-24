package controllers

import javax.inject._
import models.CommercialTransaction.Address
import models.TradeAgreement.Dealer
import play.api.libs.json.{JsResultException, Json, OFormat}
import play.api.mvc._

@Singleton
class TestingController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  implicit val addressFormat: OFormat[Address] = Json.format[Address]
  implicit val dealerFormat: OFormat[Dealer] = Json.format[Dealer]

  def testGet() = Action { implicit request: Request[AnyContent] =>
    val address = Address("123", "building", "lane", "village", "456", "sukhumvit", "district", "asjdh",
      "thailand", "bangkok", "789")
    val dealer = Dealer("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
    val json = Json.toJson(dealer)
    if (true) {
      Ok(json)
    } else {
      BadRequest("Bad Request")
    }
  }

  def testPost() = Action { implicit request: Request[AnyContent] =>
    val json = request.body.asJson.get
    try {
      val dealer = json.as[Dealer]
      Ok(Json.toJson(dealer))
    } catch {
      case _: JsResultException => BadRequest("Wrong Json Format")
    }
  }
}
