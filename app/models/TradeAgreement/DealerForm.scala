package models.TradeAgreement

import models.CommercialTransaction.AddressForm

case class DealerForm(
    dealerId: String,
    globalId: String,
    name: String,
    taxPayerId: String,
    uri: String,
    email: String,
    address: AddressForm)
