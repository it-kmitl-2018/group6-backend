package facades

import javax.inject.{Inject, Singleton}
import mocks.converters.TaxInvoiceConverterMock
import models.TradeAgreement.TradeAgreementForm
import play.api.libs.json.JsValue

@Singleton
class TaxInvoiceFacade @Inject()(taxInvoiceConverterMock: TaxInvoiceConverterMock) {
  def getTradeAgreementAsJson(tradeAgreement: TradeAgreementForm): JsValue = {
    taxInvoiceConverterMock.convertTradeAgreementToJson(tradeAgreement)
  }
}
