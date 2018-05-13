package mocks.data

import converters.messages.Json._

import scala.collection.mutable.ListBuffer

object ConverterTestData {
  private val address = Address("building 789", "sukhumvit asjdh district bangkok 123",
    "district", "asjdh", "123", "bangkok", "thailand")
  private val seller = Seller("taxPayerId", "", "", "name", "email", "", "", address)
  private val buyer = Buyer("taxPayerId", "", "", "name", "email", "", "", address)
  private val number = ""
  private val transactionDate = 0
  private val note = Note("หมายเหตุ", "")
  private val items = new ListBuffer[Item]
  val taxInvoice = TaxInvoice(number, seller, buyer, transactionDate, note, items)

  def getMockTaxInvoice: TaxInvoice = taxInvoice
}

