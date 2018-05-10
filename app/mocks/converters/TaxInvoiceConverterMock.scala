package mocks.converters

import javax.inject.Singleton
import mocks.data.MockData
import models.TradeAgreement.TradeAgreementForm
import play.api.libs.json.JsValue
import utilities.Json

import scala.xml.Elem

@Singleton
class TaxInvoiceConverterMock {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreementForm): JsValue = {
    Json.toJson(MockData.getMockTradeAgreement)
  }

  def convertTradeAgreementToXML(tradeAgreement: TradeAgreementForm): Elem = {
    MockData.getMockSimpleXML
  }
}
