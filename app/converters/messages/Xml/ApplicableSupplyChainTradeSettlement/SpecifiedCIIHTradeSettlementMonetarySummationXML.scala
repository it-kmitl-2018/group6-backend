package converters.messages.Xml.ApplicableSupplyChainTradeSettlement

case class SpecifiedCIIHTradeSettlementMonetarySummationXML(
    originalInformationAmount: Double,
    lineTotalAmount: Double,
    differenceInformationAmount: Double,
    allowanceTotalAmount: Double,
    taxTotalAmount: Double,
    grandTotalAmount: Double)
