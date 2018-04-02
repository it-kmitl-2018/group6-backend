package facades

import javax.inject.{Inject, Singleton}
import mocks.converters.TaxInvoiceConverterMock
import models.TradeAgreement.TradeAgreement

@Singleton
class TaxInvoiceFacade @Inject()(taxInvoiceConverterMock: TaxInvoiceConverterMock) {
  def getTradeAgreementAsJson(tradeAgreement: TradeAgreement): String = {
    taxInvoiceConverterMock.convertTradeAgreementToJson(tradeAgreement)
  }
}
