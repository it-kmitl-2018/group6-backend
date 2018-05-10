package converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedTradeProduct

case class SpecifiedCITradeProductXML(
    id: String,
    globalId: String,
    name: String,
    individualCITradeProductInstance: IndividualCITradeProductInstanceXML,
    originCITradeCountry: OriginCITradeCountryXML,
    includedCINote: IncludedCINoteXML)
