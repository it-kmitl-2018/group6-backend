package models.CommercialTransaction

import play.api.libs.json.{Json, OFormat}

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

object Address {
  implicit val addressFormat: OFormat[Address] = Json.format[Address]
}
