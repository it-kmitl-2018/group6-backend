package models.TradeAgreement

import models.CommercialTransaction.Address

case class Dealer(
    dealerId: String,
    globalId: String,
    name: String,
    taxPayerId: String,
    uri: String,
    email: String,
    address: Address)
