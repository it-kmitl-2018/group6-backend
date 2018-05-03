package models.TradeAgreement

case class TradeAgreementForm(
    buyer: DealerForm,
    seller: DealerForm,
    deliveryTypeCode: String,
    orderReference: ReferenceDocumentForm,
    additionalReference: ReferenceDocumentForm)
