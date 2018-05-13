package converters.messages.Json

import org.scalatest.FunSuite

import scala.collection.mutable.ListBuffer

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
  val number = "INV-178324672"
  val transactionDate = 0
  val taxInvoiceNote = Note("หมายเหตุ",
    "\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\n เลขเครื่อง : 1KD-FTV\n เลขตัวถัง : FN-83741\n สี : สีเทา\n")
  val itemOne = Item("Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้", 1, 3990000, "true", 0.07)
  val itemTwo = Item("ประกันภัยรถยนต์ชั้น 1", 1, 12450, "true", 0.07)
  val itemThree = Item("ของแถม", 1, 0, "true", 0.07)
  val items = new ListBuffer[Item]
  val taxInvoice = TaxInvoice(number, seller, buyer, transactionDate, taxInvoiceNote, items)

  test("number in in TaxInvoice constructed is correctly") {
    assert(taxInvoice.number === number)
  }

  test("seller in TaxInvoice constructed is correctly") {
    assert(taxInvoice.seller === seller)
  }

  test("buyer in TaxInvoice constructed is correctly") {
    assert(taxInvoice.buyer === buyer)
  }

  test("transactionDate in TaxInvoice constructed is correctly") {
    assert(taxInvoice.transactionDate === transactionDate)
  }

  test("taxInvoiceNote in TaxInvoice constructed is correctly") {
    assert(taxInvoice.note === taxInvoiceNote)
  }

  test("items in TaxInvoice constructed is correctly") {
    items += itemOne
    items += itemTwo
    items += itemThree
    assert(taxInvoice.items === items)
  }

  test("TaxInvoice constructed is correctly") {
    items += itemOne
    items += itemTwo
    items += itemThree
    assert(taxInvoice.number === number)
    assert(taxInvoice.seller === seller)
    assert(taxInvoice.buyer === buyer)
    assert(taxInvoice.transactionDate === transactionDate)
    assert(taxInvoice.note === taxInvoiceNote)
    assert(taxInvoice.items === items)
  }
}
