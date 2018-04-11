package mocks.converters

import javax.inject.Singleton
import mocks.data.MockData
import models.TradeAgreement.TradeAgreement
import play.api.libs.json.JsValue
import utilities.Json

@Singleton
class TaxInvoiceConverterMock {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreement): JsValue = {
    Json.toJson(MockData.getMockTradeAgreement)
  }
}
