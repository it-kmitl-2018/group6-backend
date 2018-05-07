package converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement

case class BuyerCITradePartyXML(
    id: String,
    globalId: String,
    name: String,
    specifiedCILegalOrganization: SpecifiedCILegalOrganizationXML,
    definedCITradeContact: DefinedCITradeContactXML,
    postalCITradeAddressXML: PostalCITradeAddressXML)
