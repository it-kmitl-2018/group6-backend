package converters.messages.Json

case class Item(
    description: String,
    quantity: Int,
    pricePerItem: Int,
    haveVat: Boolean,
    vatRate: Double)
