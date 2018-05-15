package converters.messages.Xml

import converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement.PostalCITradeAddressXML
import converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeDelivery._
import models.CommercialTransaction.AddressForm
import models.TradeParty.{DeliveryDetailForm, PaymentDetailForm, ReceiverForm, SenderForm}
import org.scalatest.FunSuite

class ApplicableCIIHSupplyChainTradeDeliveryXMLTest extends FunSuite{
  private val address = AddressForm("123", "building", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val sender = SenderForm("1234", "4321", "sendername", 1546246809)
  private val paymentDetail = PaymentDetailForm("THB", "FEET", 7, 1000.25f, isCharged = true, 2, "ABC", "hello", 1, 2000.20f, 20, 30, 2000, 5000)
  private val receiver = ReceiverForm("id1", "id2", "hello", "aaaa", "abcd", "0818645549", address)
  private val deliveryDetail = DeliveryDetailForm(sender, receiver, paymentDetail)
  private val definedCITradeContact = DefinedCITradeContactXML("", deliveryDetail.receiver.department)
  private val telephoneCIUniversalCommunication = TelephoneCIUniversalCommunicationXML(deliveryDetail.receiver.uri,
    deliveryDetail.receiver.phoneNumber)
  private val postalCITradeAddress = PostalCITradeAddressXML(deliveryDetail.receiver.address.postalCode,
    deliveryDetail.receiver.address.buildingName, "", "", deliveryDetail.receiver.address.lane,
    deliveryDetail.receiver.address.villageName, deliveryDetail.receiver.address.villageNumber,
    deliveryDetail.receiver.address.streetName, deliveryDetail.receiver.address.districtCode,
    deliveryDetail.receiver.address.subDistrictCode, deliveryDetail.receiver.address.countryCode,
    deliveryDetail.receiver.address.countrySubDivisionCode, deliveryDetail.receiver.address.buildingNumber)
  private val shipToCITradeParty = ShipToCITradePartyXML(deliveryDetail.receiver.receiverId,
    deliveryDetail.receiver.globalId, deliveryDetail.receiver.name, definedCITradeContact,
    telephoneCIUniversalCommunication, postalCITradeAddress)
  private val shipFromCITradeParty = ShipFromCITradePartyXML(deliveryDetail.sender.senderId,
    deliveryDetail.sender.globalId, deliveryDetail.sender.name)
  private val actualDeliveryCISupplyChainEvent = ActualDeliveryCISupplyChainEventXML(deliveryDetail.sender.deliveryDate)
  private val applicableCIIHSupplyChainTradeDeliveryXML = ApplicableCIIHSupplyChainTradeDeliveryXML(
    shipToCITradeParty, shipFromCITradeParty, actualDeliveryCISupplyChainEvent)
  private val definedCITradeContactTestData = DefinedCITradeContactXML("", "aaaa")
  private val telephoneCIUniversalCommunicationTestData = TelephoneCIUniversalCommunicationXML("abcd", "0818645549")
  private val postalCITradeAddressTestData = PostalCITradeAddressXML("123", "building", "", "", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val shipToCITradePartyTestData = ShipToCITradePartyXML("id1", "id2", "hello", definedCITradeContactTestData,
    telephoneCIUniversalCommunicationTestData, postalCITradeAddressTestData)
  private val shipFromCITradePartyTestData = ShipFromCITradePartyXML("1234", "4321", "sendername")
  private val actualDeliveryCISupplyChainEventTestData = ActualDeliveryCISupplyChainEventXML(1546246809)
  private val applicableCIIHSupplyChainTradeDeliveryXMLTestData = ApplicableCIIHSupplyChainTradeDeliveryXML(
    shipToCITradePartyTestData, shipFromCITradePartyTestData, actualDeliveryCISupplyChainEventTestData)

  test("applicableCIIHSupplyChainTradeDeliveryXML should get data from TaxInvoiceForm correctly"){
    assert(applicableCIIHSupplyChainTradeDeliveryXML === applicableCIIHSupplyChainTradeDeliveryXMLTestData)
  }
}
