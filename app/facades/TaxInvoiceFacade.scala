package facades

import converters.TaxInvoiceJsonConverter
import javax.inject.{Inject, Singleton}
import models.TradeAgreement.TradeAgreementForm
import play.api.libs.json.JsValue

@Singleton
class TaxInvoiceFacade @Inject()(taxInvoiceJsonConverter: TaxInvoiceJsonConverter) {
  def getTradeAgreementAsJson(tradeAgreement: TradeAgreementForm): JsValue = {
    taxInvoiceJsonConverter.convertTradeAgreementToJson(tradeAgreement)
  }
}
