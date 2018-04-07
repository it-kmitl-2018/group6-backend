package convertermodels

import convertermodels.Json.{Buyer, Seller}

case class JsonMessage(seller: Seller, buyer: Buyer)
