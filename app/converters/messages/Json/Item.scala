package converters.messages.Json

case class Item(
    description: String,
    quantity: Int,
    pricePerItem: Float,
    haveVat: Boolean,
    vatRate: Double)
