package models.TradeAgreement

import models.CommercialTransaction.Address
import play.api.libs.json.{Json, OFormat}

case class Dealer(
    dealerId: String,
    globalId: String,
    name: String,
    taxPayerId: String,
    uri: String,
    email: String,
    address: Address)

object Dealer {
  implicit val dealerFormat: OFormat[Dealer] = Json.format[Dealer]
}