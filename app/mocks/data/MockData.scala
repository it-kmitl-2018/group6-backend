package mocks.data

import models.CommercialTransaction.AddressForm
import models.TradeAgreement.{DealerForm, ReferenceDocumentForm, TradeAgreementForm}

import scala.xml.Elem

object MockData {
  private val orderReference = ReferenceDocumentForm("id1", 1234567890, "CODE1")
  private val additionalReference = ReferenceDocumentForm("id1", 1234567890, "CODE2")
  private val deliveryTypeCode = "D123"
  private val address = AddressForm("123", "building", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val dealer = DealerForm("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
  private val tradeAgreement = TradeAgreementForm(dealer, dealer, deliveryTypeCode, orderReference, additionalReference)

  def getMockTradeAgreement: TradeAgreementForm = tradeAgreement

  def getMockSimpleXML: Elem = <example>
    <message>
      This is just a simple XML
    </message>
    <author id="0">
      Taweewong
    </author>
  </example>
}
