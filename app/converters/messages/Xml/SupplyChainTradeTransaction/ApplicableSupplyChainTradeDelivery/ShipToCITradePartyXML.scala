package converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeDelivery

import converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement.PostalCITradeAddressXML

case class ShipToCITradePartyXML(
    id: String,
    globalID: String,
    name: String,
    definedCITradeContact: DefinedCITradeContactXML,
    telephoneCIUniversalCommunication: TelephoneCIUniversalCommunicationXML,
    postalCITradeAddressXML: PostalCITradeAddressXML)
