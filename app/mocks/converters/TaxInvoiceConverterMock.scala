package mocks.converters

import javax.inject.Singleton
import models.TradeAgreement.TradeAgreement

@Singleton
class TaxInvoiceConverterMock {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreement): String = {
    "{\n" +
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
  }
}
