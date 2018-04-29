package models.TradeParty

case class PaymentDetail(
    currencyCode: String,
    taxTypeCode: String,
    taxRate: Float,
    basisAmount: Float,
    isCharged: Boolean,
    chargeAmount: Float,
    chargeTypeCode: String,
    paymentTermTypeCode: String,
    originalAmount: Float,
    totalAmount: Float,
    differenceSaleAmount: Float,
    totalAllowanceAmount: Float,
    totalTaxAmount: Float,
    grandTotalAmount: Float)
