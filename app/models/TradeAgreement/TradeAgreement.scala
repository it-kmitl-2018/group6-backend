package models.TradeAgreement

import play.api.libs.json.{Json, OFormat}

case class TradeAgreement(
    buyer: Dealer,
    seller: Dealer,
    deliveryTypeCode: String,
    orderReference: ReferenceDocument,
    additionalReference: ReferenceDocument)

object TradeAgreement {
  implicit val tradeAgreementFormat: OFormat[TradeAgreement] = Json.format[TradeAgreement]
}
