package models

import models.ExchangedDocument.TaxInvoiceHeader
import models.TradeAgreement.TradeAgreement
import models.TradeItem.Item
import models.TradeParty.DeliveryDetail

case class TaxInvoice(
    guidelineId: String,
    header: TaxInvoiceHeader,
    tradeAgreement: TradeAgreement,
    deliveryDetail: DeliveryDetail,
    items: List[Item])
