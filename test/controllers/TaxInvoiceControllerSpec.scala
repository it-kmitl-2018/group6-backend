package controllers

import converters.TaxInvoiceJsonConverter
import mocks.data.MockData
import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test.Helpers._
import play.api.test._
import utilities.Json

class TaxInvoiceControllerSpec extends PlaySpec with GuiceOneAppPerTest {
  private val taxInvoiceJsonConverter = new TaxInvoiceJsonConverter()

  "POST /tax_invoice/json" should {
    "return tax invoice json" in {
      val json = Json.toJson(MockData.getMockTradeAgreement)
      val jsonResponse = taxInvoiceJsonConverter
        .convertTradeAgreementToJson(MockData.getMockTradeAgreement)
      val request = FakeRequest(POST, "/tax_invoice/json").withJsonBody(json)
      val result = route(app, request).get

      status(result) mustBe OK
      contentType(result) mustBe Some("application/json")
      contentAsString(result) must include(jsonResponse.toString())
    }
  }
}
