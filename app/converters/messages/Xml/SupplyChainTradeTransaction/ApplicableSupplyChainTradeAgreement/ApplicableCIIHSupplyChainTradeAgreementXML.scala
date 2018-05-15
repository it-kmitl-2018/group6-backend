package converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement

case class ApplicableCIIHSupplyChainTradeAgreementXML(
    sellerCITradeParty: SellerCITradePartyXML,
    buyerCITradeParty: BuyerCITradePartyXML,
    applicableCITradeDeliveryTerms: ApplicableCITradeDeliveryTermsXML,
    buyerOrderReferencedCIReferencedDocument: BuyerOrderReferencedCIReferencedDocumentXML,
    additionalReferencedCIReferencedDocument: AdditionalReferencedCIReferencedDocumentXML)
