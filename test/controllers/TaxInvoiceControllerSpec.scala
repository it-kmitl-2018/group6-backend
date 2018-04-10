package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.libs.json.Json
import play.api.test.Helpers._
import play.api.test._

class TaxInvoiceControllerSpec extends PlaySpec with GuiceOneAppPerTest {
  "POST /tax_invoice/json" should {
    "return tax invoice json" in {
      val responseString = "{\n" +
        "    \"buyer\": {\n" +
        "        \"dealerId\": \"dealerId\",\n" +
        "        \"globalId\": \"globalId\",\n" +
        "        \"name\": \"name\",\n" +
        "        \"taxPayerId\": \"taxPayerId\",\n" +
        "        \"uri\": \"uri\",\n" +
        "        \"email\": \"email\",\n" +
        "        \"address\": {\n" +
        "            \"postalCode\": \"123\",\n" +
        "            \"buildingName\": \"building\",\n" +
        "            \"lane\": \"lane\",\n" +
        "            \"villageName\": \"village\",\n" +
        "            \"villageNumber\": \"456\",\n" +
        "            \"streetName\": \"sukhumvit\",\n" +
        "            \"districtCode\": \"district\",\n" +
        "            \"subDistrictCode\": \"asjdh\",\n" +
        "            \"countryCode\": \"thailand\",\n" +
        "            \"countrySubDivisionCode\": \"bangkok\",\n" +
        "            \"buildingNumber\": \"789\"\n" +
        "        }\n" +
        "    },\n" +
        "    \"seller\": {\n" +
        "        \"dealer_id\": \"dealerId\",\n" +
        "        \"global_id\": \"globalId\",\n" +
        "        \"name\": \"name\",\n" +
        "        \"tax_payer_id\": \"taxPayerId\",\n" +
        "        \"uri\": \"uri\",\n" +
        "        \"email\": \"email\",\n" +
        "        \"address\": {\n" +
        "            \"postal_code\": \"123\",\n" +
        "            \"building_name\": \"building\",\n" +
        "            \"lane\": \"lane\",\n" +
        "            \"village_name\": \"village\",\n" +
        "            \"village_number\": \"456\",\n" +
        "            \"street_name\": \"sukhumvit\",\n" +
        "            \"district_code\": \"district\",\n" +
        "            \"subDistrict_code\": \"asjdh\",\n" +
        "            \"country_code\": \"thailand\",\n" +
        "            \"country_sub_division_code\": \"bangkok\",\n" +
        "            \"building_number\": \"789\"\n" +
        "        }\n" +
        "    },\n" +
        "    \"delivery_type_code\": \"D123\",\n" +
        "    \"order_reference\": {\n" +
        "        \"id\": \"id1\",\n" +
        "        \"created_date\": 1234567890,\n" +
        "        \"reference_type_code\": \"CODE1\"\n" +
        "    },\n" +
        "    \"additional_reference\": {\n" +
        "        \"id\": \"id1\",\n" +
        "        \"created_date\": 1234567890, \n" +
        "        \"reference_type_code\": \"CODE2\"\n" +
        "    }\n" +
        "}"
      val request = FakeRequest(POST, "/tax_invoice/json").withJsonBody(Json.parse(responseString))
      val result = route(app, request).get

      status(result) mustBe OK
      contentType(result) mustBe Some("text/plain")
      contentAsString(result) must include(responseString)
      //TODO: contentType and contentAsString will be updated after converter is done
    }
  }
}
