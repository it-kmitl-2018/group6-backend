package mocks.data

import models.CommercialTransaction.Address
import models.TradeAgreement.{Dealer, ReferenceDocument, TradeAgreement}

object MockData {
  private val orderReference = ReferenceDocument("id1", 1234567890, "CODE1")
  private val additionalReference = ReferenceDocument("id1", 1234567890, "CODE2")
  private val deliveryTypeCode = "D123"
  private val address = Address("123", "building", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val dealer = Dealer("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
  private val tradeAgreement = TradeAgreement(dealer, dealer, deliveryTypeCode, orderReference, additionalReference)

  def getMockTradeAgreement: TradeAgreement = tradeAgreement
}
