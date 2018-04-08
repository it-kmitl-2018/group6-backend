package models.TradeAgreement

case class TradeAgreement(
    buyer: Dealer,
    seller: Dealer,
    deliveryTypeCode: String,
    orderReference: ReferenceDocument,
    additionalReference: ReferenceDocument)
