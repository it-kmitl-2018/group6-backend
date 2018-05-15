package converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeDelivery

case class ApplicableCIIHSupplyChainTradeDeliveryXML(
    shipToCITradeParty: ShipToCITradePartyXML,
    shipFromCITradeParty: ShipFromCITradePartyXML,
    actualDeliveryCISupplyChainEvent: ActualDeliveryCISupplyChainEventXML)
