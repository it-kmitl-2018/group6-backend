package converters.messages.Xml.ApplicableSupplyChainTradeSettlement

case class ApplicableCIIHSupplyChainTradeSettlementXML(
    invoiceCurrencyCode: String,
    applicableCITradeTax: ApplicableCITradeTaxXML,
    specifiedCITradeAllowanceCharge: SpecifiedCITradeAllowanceChargeXML,
    specifiedCITradePaymentTerms: SpecifiedCITradePaymentTermsXML,
    specifiedCIIHTradeSettlementMonetarySummation: SpecifiedCIIHTradeSettlementMonetarySummationXML)