package mocks.data

import converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement._

object ApplicableCIIHSupplyChainTradeAgreementXMLTestData {
  private val sellerSpecifiedCILegalOrganizationTestData = SpecifiedCILegalOrganizationXML("taxPayerId")
  private val sellerEmailURICIUniversalCommunicationTestData = EmailURICIUniversalCommunicationXML(
    "uri", "email")
  private val sellerDefinedCITradeContactTestData = DefinedCITradeContactXML(sellerEmailURICIUniversalCommunicationTestData)
  private val sellerAddressTestData = PostalCITradeAddressXML("123", "building", "", "", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val sellerCITradePartyTestData = SellerCITradePartyXML("dealerId", "globalId", "name", sellerSpecifiedCILegalOrganizationTestData,
    sellerDefinedCITradeContactTestData, sellerAddressTestData)
  private val buyerSpecifiedCILegalOrganizationTestData = SpecifiedCILegalOrganizationXML("taxPayerId")
  private val buyerEmailURICIUniversalCommunicationTestData = EmailURICIUniversalCommunicationXML(
    "uri", "email")
  private val buyerDefinedCITradeContactTestData = DefinedCITradeContactXML(buyerEmailURICIUniversalCommunicationTestData)
  private val buyerAddressTestData = PostalCITradeAddressXML("123", "building", "", "", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val buyerCITradePartyTestData = BuyerCITradePartyXML("dealerId", "globalId", "name", buyerSpecifiedCILegalOrganizationTestData,
    buyerDefinedCITradeContactTestData, buyerAddressTestData)
  private val applicableCITradeDeliveryTermsTestData = ApplicableCITradeDeliveryTermsXML("D123")
  private val buyerOrderReferencedCIReferencedDocumentTestData = BuyerOrderReferencedCIReferencedDocumentXML(
    "id1", 1234567890, "CODE1")
  private val additionalReferencedCIReferencedDocumentTestData = AdditionalReferencedCIReferencedDocumentXML(
    "id1", 1234567890, "CODE2")
  private val applicableCIIHSupplyChainTradeAgreementXMLTestData = ApplicableCIIHSupplyChainTradeAgreementXML(
    sellerCITradePartyTestData, buyerCITradePartyTestData, applicableCITradeDeliveryTermsTestData,
    buyerOrderReferencedCIReferencedDocumentTestData, additionalReferencedCIReferencedDocumentTestData)

  def getMockSupplyChainTradeAgreementXMLTestData: ApplicableCIIHSupplyChainTradeAgreementXML = applicableCIIHSupplyChainTradeAgreementXMLTestData
}
