package converters.models

import converters.models.Json.{Buyer, Seller}

case class JsonMessage(seller: Seller, buyer: Buyer)
