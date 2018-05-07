package converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement

case class PostalCITradeAddressXML(
    postcodeCode: String,
    buildingName: String,
    lineOne: String,
    lineTwo: String,
    lineThree: String,
    lineFour: String,
    lineFive: String,
    streetName: String,
    cityName: String,
    citySubDivisionName: String,
    countryID:String,
    countrySubDivisionID: String,
    buildingNumber: String)
