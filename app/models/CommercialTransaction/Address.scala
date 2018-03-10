package models.CommercialTransaction

case class Address(
    postalCode: String,
    buildingName: String,
    addressLine1: String,
    addressLine2: String,
    lane: String,
    villageName: String,
    villageNumber: String,
    streetName: String,
    districtCode: String,
    subDistrictCode: String,
    countryCode: String,
    countrySubDivisionCode: String,
    buildingNumber: String)
