package models.TradeAgreement

case class TradeAgreement(
    buyer: Dealer,
    seller: Dealer,
    deliveryTypeCode: String,
    buyOrderReference: ReferenceDocument,
    additionalReference: ReferenceDocument)
