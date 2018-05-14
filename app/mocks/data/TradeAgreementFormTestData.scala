package mocks.data

import mocks.data.MockData.tradeAgreement
import models.CommercialTransaction.AddressForm
import models.TradeAgreement.{DealerForm, ReferenceDocumentForm, TradeAgreementForm}

object TradeAgreementFormTestData {
  private val orderReference = ReferenceDocumentForm("id1", 1234567890, "CODE1")
  private val additionalReference = ReferenceDocumentForm("id1", 1234567890, "CODE2")
  private val deliveryTypeCode = "D123"
  private val address = AddressForm("123", "building", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val dealer = DealerForm("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
  private val tradeAgreementForm = TradeAgreementForm(dealer, dealer, deliveryTypeCode, orderReference, additionalReference)

  def getMockTradeAgreement: TradeAgreementForm = tradeAgreementForm
}
