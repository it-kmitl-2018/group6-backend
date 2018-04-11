package facades

import javax.inject.{Inject, Singleton}
import mocks.converters.TaxInvoiceConverterMock
import models.TradeAgreement.TradeAgreement
import play.api.libs.json.JsValue

@Singleton
class TaxInvoiceFacade @Inject()(taxInvoiceConverterMock: TaxInvoiceConverterMock) {
  def getTradeAgreementAsJson(tradeAgreement: TradeAgreement): JsValue = {
    taxInvoiceConverterMock.convertTradeAgreementToJson(tradeAgreement)
  }
}
