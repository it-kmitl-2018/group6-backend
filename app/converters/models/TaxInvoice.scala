package converters.models

import converters.models.Json.{Buyer, Seller}

case class TaxInvoice(seller: Seller, buyer: Buyer)
