package models.CommercialTransaction

case class Address(
    postalCode: String,
    buildingName: String,
    lane: String,
    villageName: String,
    villageNumber: String,
    streetName: String,
    districtCode: String,
    subDistrictCode: String,
    countryCode: String,
    countrySubDivisionCode: String,
    buildingNumber: String)
