package converters.models.Json

import org.scalatest.FunSuite

class SellerTest extends FunSuite {

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
  val seller = Seller(
      taxNumber,
      branchNumber,
      nameEn,
      nameTh,
      email,
      telephone,
      fax,
      address)

  test("taxNumber in Buyer constructed is correctly") {
    assert(seller.taxNumber === taxNumber)
  }

  test("branchNumber in Buyer constructed is correctly") {
    assert(seller.branchNumber === branchNumber)
  }

  test("nameEn in Buyer constructed is correctly") {
    assert(seller.nameEn === nameEn)
  }

  test("nameTh in Buyer constructed is correctly") {
    assert(seller.nameTh === nameTh)
  }

  test("email in Buyer constructed is correctly") {
    assert(seller.email === email)
  }

  test("telephone in Buyer constructed is correctly") {
    assert(seller.telephone === telephone)
  }

  test("fax in Buyer constructed is correctly") {
    assert(seller.fax === fax)
  }

  test("address in Buyer constructed is correctly") {
    assert(seller.address === address)
  }

  test("Buyer constructed is correctly") {
    assert(seller.taxNumber === taxNumber)
    assert(seller.branchNumber === branchNumber)
    assert(seller.nameEn === nameEn)
    assert(seller.nameTh === nameTh)
    assert(seller.email === email)
    assert(seller.telephone === telephone)
    assert(seller.fax === fax)
    assert(seller.address === address)
  }
}
