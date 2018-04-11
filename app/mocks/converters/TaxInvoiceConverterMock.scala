package mocks.converters

import javax.inject.Singleton
import models.CommercialTransaction.Address
import models.TradeAgreement.{Dealer, ReferenceDocument, TradeAgreement}
import play.api.libs.json.JsValue
import utilities.Json

@Singleton
class TaxInvoiceConverterMock {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreement): JsValue = {
    val orderReference = ReferenceDocument("id1", 1234567890, "CODE1")
    val additionalReference = ReferenceDocument("id1", 1234567890, "CODE2")
    val deliveryTypeCode = "D123"
    val address = Address("123", "building", "lane", "village", "456",
      "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
    val dealer = Dealer("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
    val tradeAgreement = TradeAgreement(dealer, dealer, deliveryTypeCode, orderReference, additionalReference)

    Json.toJson(tradeAgreement)
  }
}
