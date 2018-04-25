package models.TradeParty

import com.sun.jndi.cosnaming.IiopUrl.Address

case class Receiver(
    receiverId: String,
    globalId: String,
    name: String,
    department: String,
    uri: String,
    phoneNumber: String,
    address: Address)
