package models.TradeParty

case class DeliveryDetail(
    sender: Sender,
    receiver: Receiver,
    paymentDetail: PaymentDetail)
