package converters.messages.Json

import scala.collection.mutable.ListBuffer

case class TaxInvoice(
    number: String,
    seller: Seller,
    buyer: Buyer,
    transactionDate: String,
    note: Note,
    items: ListBuffer[Item])
