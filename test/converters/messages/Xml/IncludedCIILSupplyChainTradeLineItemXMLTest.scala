package converters.messages.Xml

import converters.messages.Xml.IncludedSupplyChainTradeLineItem.AssociatedDocumentLineDocument.AssociatedCIILDocumentLineDocumentXML
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.IncludedCIILSupplyChainTradeLineItemXML
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedSupplyChainTradeAgreement.{AppliedCITradeAllowanceChargeXML, GrossPriceProductCITradePriceXML, SpecifiedCIILSupplyChainTradeAgreementXML}
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedSupplyChainTradeDelivery.SpecifiedCIILSupplyChainTradeDeliveryXML
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedSupplyChainTradeSettlement.{ApplicableCITradeTaxXML, SpecifiedCIILSupplyChainTradeSettlementXML, SpecifiedCIILTradeSettlementMonetarySummationXML, SpecifiedCITradeAllowanceChargeXML}
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedTradeProduct.{IncludedCINoteXML, IndividualCITradeProductInstanceXML, OriginCITradeCountryXML, SpecifiedCITradeProductXML}
import models.TradeItem.ItemForm
import org.scalatest.FunSuite

class IncludedCIILSupplyChainTradeLineItemXMLTest extends FunSuite {
  private val item = ItemForm("id", 5, 10, "yes", 7, 1000, 2000, 3000, "123", "hello")
  private val associatedCIILDocumentLineDocument = AssociatedCIILDocumentLineDocumentXML(item.lineId)
  private val appliedCITradeAllowanceCharge = AppliedCITradeAllowanceChargeXML(chargeIndicator = false, 0, "")
  private val grossPriceProductCITradePrice = GrossPriceProductCITradePriceXML(item.itemAmountPerUnit, appliedCITradeAllowanceCharge)
  private val specifiedCIILSupplyChainTradeAgreement = SpecifiedCIILSupplyChainTradeAgreementXML(grossPriceProductCITradePrice)
  private val specifiedCIILSupplyChainTradeDelivery = SpecifiedCIILSupplyChainTradeDeliveryXML(item.itemQuantity, 0)
  private val applicableCITradeTax = ApplicableCITradeTaxXML(item.taxTypeCode, item.taxRate, 0)
  private val specifiedCITradeAllowanceCharge = SpecifiedCITradeAllowanceChargeXML(chargeIndicator = false, 0, "")
  private val specifiedCIILTradeSettlementMonetarySummation = SpecifiedCIILTradeSettlementMonetarySummationXML(
    item.totalTaxAmount, item.totalBasisAmount, item.grandTotalAmount)
  private val specifiedCIILSupplyChainTradeSettlement = SpecifiedCIILSupplyChainTradeSettlementXML(
    applicableCITradeTax, specifiedCITradeAllowanceCharge, specifiedCIILTradeSettlementMonetarySummation)
  private val individualCITradeProductInstance = IndividualCITradeProductInstanceXML("", 0)
  private val originCITradeCountry = OriginCITradeCountryXML("")
  private val includedCINote = IncludedCINoteXML("", "")
  private val specifiedCITradeProduct = SpecifiedCITradeProductXML(
    item.itemId, "", item.itemName, individualCITradeProductInstance, originCITradeCountry, includedCINote)
  private val includedCIILSupplyChainTradeLineItem = IncludedCIILSupplyChainTradeLineItemXML(
    associatedCIILDocumentLineDocument, specifiedCIILSupplyChainTradeAgreement, specifiedCIILSupplyChainTradeDelivery,
    specifiedCIILSupplyChainTradeSettlement, specifiedCITradeProduct
  )
  private val associatedCIILDocumentLineDocumentTestData = AssociatedCIILDocumentLineDocumentXML("id")
  private val appliedCITradeAllowanceChargeTestData = AppliedCITradeAllowanceChargeXML(chargeIndicator = false, 0, "")
  private val grossPriceProductCITradePriceTestData = GrossPriceProductCITradePriceXML(5, appliedCITradeAllowanceChargeTestData)
  private val specifiedCIILSupplyChainTradeAgreementTestData = SpecifiedCIILSupplyChainTradeAgreementXML(grossPriceProductCITradePriceTestData)
  private val specifiedCIILSupplyChainTradeDeliveryTestData = SpecifiedCIILSupplyChainTradeDeliveryXML(10, 0)
  private val applicableCITradeTaxTestData = ApplicableCITradeTaxXML("yes", 7, 0)
  private val specifiedCITradeAllowanceChargeTestData = SpecifiedCITradeAllowanceChargeXML(chargeIndicator = false, 0, "")
  private val specifiedCIILTradeSettlementMonetarySummationTestData = SpecifiedCIILTradeSettlementMonetarySummationXML(
    1000, 2000, 3000)
  private val specifiedCIILSupplyChainTradeSettlementTestData = SpecifiedCIILSupplyChainTradeSettlementXML(
    applicableCITradeTaxTestData, specifiedCITradeAllowanceChargeTestData, specifiedCIILTradeSettlementMonetarySummationTestData)
  private val individualCITradeProductInstanceTestData = IndividualCITradeProductInstanceXML("", 0)
  private val originCITradeCountryTestData = OriginCITradeCountryXML("")
  private val includedCINoteTestData = IncludedCINoteXML("", "")
  private val specifiedCITradeProductTestData = SpecifiedCITradeProductXML(
    "123", "", "hello", individualCITradeProductInstanceTestData, originCITradeCountryTestData, includedCINoteTestData)
  private val includedCIILSupplyChainTradeLineItemTestData = IncludedCIILSupplyChainTradeLineItemXML(
    associatedCIILDocumentLineDocumentTestData, specifiedCIILSupplyChainTradeAgreementTestData, specifiedCIILSupplyChainTradeDeliveryTestData,
    specifiedCIILSupplyChainTradeSettlementTestData, specifiedCITradeProductTestData
  )

  test("IncludedCIILSupplyChainTradeLineItemXML should get data from TaxInvoiceForm correctly") {
    assert(includedCIILSupplyChainTradeLineItem === includedCIILSupplyChainTradeLineItemTestData)
  }
}
