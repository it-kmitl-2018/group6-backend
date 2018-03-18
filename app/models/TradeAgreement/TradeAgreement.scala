package models.TradeAgreement

case class TradeAgreement(
    buyer: Dealer,
    seller: Dealer,
    deliveryTypeCode: String,
    buyerOrderReference: ReferenceDocument,
    additionalReference: ReferenceDocument)
