package converters.messages.Xml

import converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement._
import models.CommercialTransaction.AddressForm
import models.TradeAgreement.{DealerForm, ReferenceDocumentForm, TradeAgreementForm}
import org.scalatest.FunSuite

class ApplicableCIIHSupplyChainTradeAgreementXMLTest extends FunSuite{
  private val orderReference = ReferenceDocumentForm("id1", 1234567890, "CODE1")
  private val additionalReference = ReferenceDocumentForm("id1", 1234567890, "CODE2")
  private val deliveryTypeCode = "D123"
  private val address = AddressForm("123", "building", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val dealer = DealerForm("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
  private val tradeAgreementForm = TradeAgreementForm(dealer, dealer, deliveryTypeCode, orderReference, additionalReference)
  private val sellerSpecifiedCILegalOrganization = SpecifiedCILegalOrganizationXML(tradeAgreementForm.seller.taxPayerId)
  private val sellerEmailURICIUniversalCommunication = EmailURICIUniversalCommunicationXML(
    tradeAgreementForm.seller.uri, tradeAgreementForm.seller.email)
  private val sellerDefinedCITradeContact = DefinedCITradeContactXML(sellerEmailURICIUniversalCommunication)
  private val sellerAddress = PostalCITradeAddressXML(tradeAgreementForm.seller.address.postalCode,
    tradeAgreementForm.seller.address.buildingName, "", "", tradeAgreementForm.seller.address.lane,
    tradeAgreementForm.seller.address.villageName, tradeAgreementForm.seller.address.villageNumber,
    tradeAgreementForm.seller.address.streetName, tradeAgreementForm.seller.address.districtCode,
    tradeAgreementForm.seller.address.subDistrictCode, tradeAgreementForm.seller.address.countryCode,
    tradeAgreementForm.seller.address.countrySubDivisionCode, tradeAgreementForm.seller.address.buildingNumber)
  private val sellerCITradeParty = SellerCITradePartyXML(tradeAgreementForm.seller.dealerId,
    tradeAgreementForm.seller.globalId, tradeAgreementForm.seller.name, sellerSpecifiedCILegalOrganization,
    sellerDefinedCITradeContact, sellerAddress)
  private val buyerSpecifiedCILegalOrganization = SpecifiedCILegalOrganizationXML(tradeAgreementForm.buyer.taxPayerId)
  private val buyerEmailURICIUniversalCommunication = EmailURICIUniversalCommunicationXML(
    tradeAgreementForm.buyer.uri, tradeAgreementForm.buyer.email)
  private val buyerDefinedCITradeContact = DefinedCITradeContactXML(buyerEmailURICIUniversalCommunication)
  private val buyerAddress = PostalCITradeAddressXML(tradeAgreementForm.buyer.address.postalCode,
    tradeAgreementForm.seller.address.buildingName, "", "", tradeAgreementForm.seller.address.lane,
    tradeAgreementForm.seller.address.villageName, tradeAgreementForm.seller.address.villageNumber,
    tradeAgreementForm.seller.address.streetName, tradeAgreementForm.seller.address.districtCode,
    tradeAgreementForm.seller.address.subDistrictCode, tradeAgreementForm.seller.address.countryCode,
    tradeAgreementForm.seller.address.countrySubDivisionCode, tradeAgreementForm.seller.address.buildingNumber)
  private val buyerCITradeParty = BuyerCITradePartyXML(tradeAgreementForm.seller.dealerId,
    tradeAgreementForm.seller.globalId, tradeAgreementForm.seller.name, buyerSpecifiedCILegalOrganization,
    buyerDefinedCITradeContact, buyerAddress)
  private val applicableCITradeDeliveryTerms = ApplicableCITradeDeliveryTermsXML(tradeAgreementForm.deliveryTypeCode)
  private val buyerOrderReferencedCIReferencedDocument = BuyerOrderReferencedCIReferencedDocumentXML(
    tradeAgreementForm.orderReference.id, tradeAgreementForm.orderReference.createdDate,
    tradeAgreementForm.orderReference.referenceTypeCode)
  private val additionalReferencedCIReferencedDocument = AdditionalReferencedCIReferencedDocumentXML(
    tradeAgreementForm.additionalReference.id, tradeAgreementForm.additionalReference.createdDate,
    tradeAgreementForm.additionalReference.referenceTypeCode)
  private val applicableCIIHSupplyChainTradeAgreementXML = ApplicableCIIHSupplyChainTradeAgreementXML(
    sellerCITradeParty, buyerCITradeParty, applicableCITradeDeliveryTerms,
    buyerOrderReferencedCIReferencedDocument, additionalReferencedCIReferencedDocument)
  private val sellerSpecifiedCILegalOrganizationTestData = SpecifiedCILegalOrganizationXML("taxPayerId")
  private val sellerEmailURICIUniversalCommunicationTestData = EmailURICIUniversalCommunicationXML(
    "uri", "email")
  private val sellerDefinedCITradeContactTestData = DefinedCITradeContactXML(sellerEmailURICIUniversalCommunication)
  private val sellerAddressTestData = PostalCITradeAddressXML("123", "building", "", "", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val sellerCITradePartyTestData = SellerCITradePartyXML("dealerId", "globalId", "name", sellerSpecifiedCILegalOrganization,
    sellerDefinedCITradeContact, sellerAddress)
  private val buyerSpecifiedCILegalOrganizationTestData = SpecifiedCILegalOrganizationXML("taxPayerId")
  private val buyerEmailURICIUniversalCommunicationTestData = EmailURICIUniversalCommunicationXML(
    "uri", "email")
  private val buyerDefinedCITradeContactTestData = DefinedCITradeContactXML(buyerEmailURICIUniversalCommunication)
  private val buyerAddressTestData = PostalCITradeAddressXML("123", "building", "", "", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val buyerCITradePartyTestData = BuyerCITradePartyXML("dealerId", "globalId", "name", buyerSpecifiedCILegalOrganization,
    buyerDefinedCITradeContact, buyerAddress)
  private val applicableCITradeDeliveryTermsTestData = ApplicableCITradeDeliveryTermsXML("D123")
  private val buyerOrderReferencedCIReferencedDocumentTestData = BuyerOrderReferencedCIReferencedDocumentXML(
    "id1", 1234567890, "CODE1")
  private val additionalReferencedCIReferencedDocumentTestData = AdditionalReferencedCIReferencedDocumentXML(
    "id1", 1234567890, "CODE2")
  private val applicableCIIHSupplyChainTradeAgreementXMLTestData = ApplicableCIIHSupplyChainTradeAgreementXML(
    sellerCITradePartyTestData, buyerCITradePartyTestData, applicableCITradeDeliveryTermsTestData,
    buyerOrderReferencedCIReferencedDocumentTestData, additionalReferencedCIReferencedDocumentTestData)

  test("ApplicableCIIHSupplyChainTradeAgreementXML should get data from tradeAgreementForm correctly"){
    assert(applicableCIIHSupplyChainTradeAgreementXML === applicableCIIHSupplyChainTradeAgreementXMLTestData)
  }
}
