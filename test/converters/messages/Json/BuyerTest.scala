package converters.messages.Json

import org.scalatest.FunSuite

class BuyerTest extends FunSuite {

  val taxNumber = "0107536000986"
  val branchNumber = "00000"
  val nameEn = "Kiatnakin Bank Public Company Limited"
  val nameTh = "ธนาคารเกียรตินาคิน จำกัด (มหาชน)"
  val email = "contact@kiatnakin.co.th"
  val telephone = "02-1655555"
  val fax = "02-1655555"
  val address = Address(
      "สำนักงานใหญ่ เลขที่ 313/1",
      "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600",
      "ธนบุรี",
      "บุคคโล",
      "10600",
      "กรุงเทพมหานคร",
      "TH")
  val buyer =Buyer(
      taxNumber,
      branchNumber,
      nameEn,
      nameTh,
      email,
      telephone,
      fax,
      address)

  test("taxNumber in Buyer constructed is correctly") {
    assert(buyer.taxNumber === taxNumber)
  }

  test("branchNumber in Buyer constructed is correctly") {
    assert(buyer.branchNumber === branchNumber)
  }

  test("nameEn in Buyer constructed is correctly") {
    assert(buyer.nameEn === nameEn)
  }

  test("nameTh in Buyer constructed is correctly") {
    assert(buyer.nameTh === nameTh)
  }

  test("email in Buyer constructed is correctly") {
    assert(buyer.email === email)
  }

  test("telephone in Buyer constructed is correctly") {
    assert(buyer.telephone === telephone)
  }

  test("fax in Buyer constructed is correctly") {
    assert(buyer.fax === fax)
  }

  test("address in Buyer constructed is correctly") {
    assert(buyer.address === address)
  }

  test("Buyer constructed is correctly") {
    assert(buyer.taxNumber === taxNumber)
    assert(buyer.branchNumber === branchNumber)
    assert(buyer.nameEn === nameEn)
    assert(buyer.nameTh === nameTh)
    assert(buyer.email === email)
    assert(buyer.telephone === telephone)
    assert(buyer.fax === fax)
    assert(buyer.address === address)
  }
}
