package models

import models.ExchangedDocument.TaxInvoiceHeaderForm
import models.TradeAgreement.TradeAgreementForm
import models.TradeItem.ItemForm
import models.TradeParty.DeliveryDetailForm

case class TaxInvoiceForm(
    guidelineId: String,
    header: TaxInvoiceHeaderForm,
    tradeAgreement: TradeAgreementForm,
    deliveryDetail: DeliveryDetailForm,
    items: List[ItemForm])
