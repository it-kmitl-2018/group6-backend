package converters

import mocks.data.{ConverterTestData, MockData}
import org.scalatest.FunSuite
import utilities.Json

class TaxInvoiceConverterTest extends FunSuite {
  private val taxInvoiceConverter = new TaxInvoiceConverter
  private val tradeAgreement = MockData.getMockTradeAgreement
  private val taxInvoice = Json.toJson(ConverterTestData.getMockTaxInvoice)

  test("TaxInvoiceConverter should return taxInvoice Json") {
    assert(taxInvoiceConverter.convertTradeAgreementToJson(tradeAgreement) === taxInvoice)
  }
}
