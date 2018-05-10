package facades

import converters.TaxInvoiceJsonConverter
import javax.inject.{Inject, Singleton}
import mocks.converters.TaxInvoiceConverterMock
import models.TradeAgreement.TradeAgreementForm
import play.api.libs.json.JsValue

import scala.xml.Elem

@Singleton
class TaxInvoiceFacade @Inject()(taxInvoiceJsonConverter: TaxInvoiceJsonConverter,
                                 taxInvoiceConverterMock: TaxInvoiceConverterMock) {
  def getTradeAgreementAsJson(tradeAgreement: TradeAgreementForm): JsValue = {
    taxInvoiceJsonConverter.convertTradeAgreementToJson(tradeAgreement)
  }

  def getTradeAgreementAsXML(tradeAgreement: TradeAgreementForm): Elem = {
    taxInvoiceConverterMock.convertTradeAgreementToXML(tradeAgreement)
  }
}
