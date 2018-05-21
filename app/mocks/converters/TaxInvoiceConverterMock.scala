package mocks.converters

import javax.inject.Singleton
import mocks.data.TaxInvoiceMock
import models.TradeAgreement.TradeAgreementForm
import play.api.libs.json.JsValue
import utilities.Json

import scala.xml.Elem

@Singleton
class TaxInvoiceConverterMock {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreementForm): JsValue = {
    Json.toJson(TaxInvoiceMock.getMockTradeAgreement)
  }

  def convertTradeAgreementToXML(tradeAgreement: TradeAgreementForm): Elem = {
    TaxInvoiceMock.getMockSimpleXML
  }
}
