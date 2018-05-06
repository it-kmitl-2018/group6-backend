package models.TradeItem

case class ItemForm(
    lineId: String,
    itemAmountPerUnit: Float,
    itemQuantity: Int,
    taxTypeCode: String,
    taxRate: Float,
    totalTaxAmount: Float,
    totalBasisAmount: Float,
    grandTotalAmount: Float,
    itemId: String,
    itemName: String)
