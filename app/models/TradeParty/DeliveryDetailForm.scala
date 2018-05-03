package models.TradeParty

case class DeliveryDetailForm(
    sender: SenderForm,
    receiver: ReceiverForm,
    paymentDetail: PaymentDetailForm)
