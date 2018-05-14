package mocks.data

import converters.messages.Xml.SupplyChainTradeTransaction.ApplicableSupplyChainTradeAgreement._

object FormDataToApplicableCIIHSupplyChainTradeAgreementXMLTestData {
  private val tradeAgreementForm = mocks.data.TradeAgreementFormTestData.getMockTradeAgreement
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

  def getMockSupplyChainTradeAgreementXML: ApplicableCIIHSupplyChainTradeAgreementXML = applicableCIIHSupplyChainTradeAgreementXML
}
