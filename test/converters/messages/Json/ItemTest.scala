package converters.messages.Json

import org.scalatest.FunSuite

class ItemTest extends FunSuite {
  val description = "ประกันภัยรถยนต์ชั้น 1"
  val quantity = 1
  val pricePerItem = 12450
  val haveVat = "true"
  val vatRate = 0.07
  val item = Item(description, quantity, pricePerItem, haveVat, vatRate)

  test("description in Item constructed is correctly") {
    assert(item.description === description)
  }

  test("quantity in Item constructed is correctly") {
    assert(item.quantity === quantity)
  }

  test("pricePerItem in Item constructed is correctly") {
    assert(item.pricePerItem === pricePerItem)
  }

  test("haveVat in Item constructed is correctly") {
    assert(item.haveVat === haveVat)
  }

  test("vatRate in Item constructed is correctly") {
    assert(item.vatRate === vatRate)
  }

  test("Item constructed is correctly"){
    assert(item.description === description)
    assert(item.quantity === quantity)
    assert(item.pricePerItem === pricePerItem)
    assert(item.haveVat === haveVat)
    assert(item.vatRate === vatRate)
  }
}
