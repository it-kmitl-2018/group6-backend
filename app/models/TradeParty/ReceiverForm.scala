package models.TradeParty

import models.CommercialTransaction.AddressForm

case class ReceiverForm(
    receiverId: String,
    globalId: String,
    name: String,
    department: String,
    uri: String,
    phoneNumber: String,
    address: AddressForm)
