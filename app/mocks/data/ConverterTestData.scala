package mocks.data

import converters.messages.Json.{Address, Buyer, Seller, TaxInvoice}

object ConverterTestData {
  private val address = Address("building 789", "sukhumvit asjdh district bangkok 123",
    "district", "asjdh", "123", "bangkok", "thailand")
  private val seller = Seller("taxPayerId", "", "", "name", "email", "", "", address)
  private val buyer = Buyer("taxPayerId", "", "", "name", "email", "", "", address)
  private val taxInvoice = TaxInvoice(seller, buyer)

  def getMockTaxInvoice: TaxInvoice = taxInvoice
}

