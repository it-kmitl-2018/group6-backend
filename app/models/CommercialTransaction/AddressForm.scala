package models.CommercialTransaction

case class AddressForm(
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
