package mocks.converters

import javax.inject.Singleton
import models.TradeAgreement.TradeAgreement

@Singleton
class TaxInvoiceConverterMock {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreement): String = {
    "{" +
      "\"number\": \"INV-178324672\"," +
      "\"seller\": {" +
      "    \"tax_number\": \"0105522022883\"," +
      "    \"branch_number\": \"00000\"," +
      "    \"name_en\": \"TOYOTA THONBURI CO, LTD.\"," +
      "    \"name_th\": \"บริษัท โตโยต้า ธนบุรี จำกัด\"," +
      "    \"email\": \"sales@toyotathonburi.com\"," +
      "    \"telephone\": \"02-4799009\", " +
      "    \"fax\": \"02-4799009\",        " +
      "    \"address\": {\n" +
      "        \"line_one\": \"สำนักงานใหญ่ เลขที่ 313/1\",            " +
      "        \"line_two\": \"ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600\"," +
      "        \"city_name\": \"ธนบุรี\"," +
      "        \"city_sub_division_name\": \"บุคคโล\"," +
      "        \"post_code\": \"10600\"," +
      "        \"country_sub_division\": \"กรุงเทพมหานคร\"," +
      "        \"country_name\": \"TH\"" +
      "    }" +
      "}," +
      "\"buyer\": {" +
      "    \"tax_number\": \"0107536000986\"," +
      "    \"branch_number\": \"00000\"," +
      "    \"name_en\": \"Kiatnakin Bank Public Company Limited\"," +
      "    \"name_th\": \"ธนาคารเกียรตินาคิน จำกัด (มหาชน)\"," +
      "    \"email\": \"contact@kiatnakin.co.th\"," +
      "    \"telephone\": \"02-1655555\"," +
      "    \"fax\": \"02-1655555\"," +
      "    \"address\": {" +
      "        \"line_one\": \"500 ถนนเพลินจิต\"," +
      "        \"line_two\": \"แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330\"," +
      "        \"city_name\": \"ปทุมวัน\"," +
      "        \"city_sub_division_name\": \"ลุมพินี\"," +
      "        \"post_code\": \"10330\"," +
      "        \"country_sub_division\": \"กรุงเทพมหานคร\"," +
      "        \"country_name\": \"TH\"" +
      "    }" +
      "}," +
      "\"transaction_date\": \"2017-12-18 12:24:00\"," +
      "\"note\": {" +
      "    \"subject\": \"หมายเหตุ\"," +
      "    \"content\": \"\\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\\n เลขเครื่อง : 1KD-FTV\\n เลขตัวถัง : FN-83741\\n สี : สีเทา\\n\" " +
      "}" +
      "}"
  }
}
