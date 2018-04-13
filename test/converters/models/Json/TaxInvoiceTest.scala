package converters.models.Json

import org.scalatest.FunSuite

class TaxInvoiceTest extends FunSuite {
  val buyerAddress = Address(
      "500 ถนนเพลินจิต",
      "แขวงลุมพินี เขตปทุมวัน กรุงเทพมหานคร 10330",
      "ปทุมวัน",
      "ลุมพินี",
      "10330",
      "กรุงเทพมหานคร",
      "TH")
  val sellerAddress = Address(
      "สำนักงานใหญ่ เลขที่ 313/1",
      "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600",
      "ธนบุรี",
      "บุคคโล",
      "10600",
      "กรุงเทพมหานคร",
      "TH")
  val buyer = Buyer(
      "0107536000986",
      "00000",
      "Kiatnakin Bank Public Company Limited",
      "ธนาคารเกียรตินาคิน จำกัด (มหาชน)",
      "contact@kiatnakin.co.th",
      "02-1655555",
      "02-1655555",
      buyerAddress)
  val seller = Seller(
      "0105522022883",
      "00000",
      "TOYOTA THONBURI CO, LTD.",
      "บริษัท โตโยต้า ธนบุรี จำกัด",
      "sales@toyotathonburi.com",
      "02-4799009",
      "02-4799009",
      sellerAddress)
  val taxInvoice = TaxInvoice(seller, buyer)

  test("seller in TaxInvoice constructed is correctly") {
    assert(taxInvoice.seller === seller)
  }

  test("buyer in TaxInvoice constructed is correctly") {
    assert(taxInvoice.buyer === buyer)
  }

  test("TaxInvoice constructed is correctly") {
    assert(taxInvoice.seller === seller)
    assert(taxInvoice.buyer === buyer)
  }
}
