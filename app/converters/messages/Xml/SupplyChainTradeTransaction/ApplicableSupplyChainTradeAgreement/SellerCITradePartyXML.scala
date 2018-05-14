package converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement

case class SellerCITradePartyXML(
    id: String,
    globalId: String,
    name: String,
    specifiedCILegalOrganization: SpecifiedCILegalOrganizationXML,
    definedCITradeContact: DefinedCITradeContactXML,
    postalCITradeAddressXML: PostalCITradeAddressXML)
