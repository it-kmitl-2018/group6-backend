package converters.messages.Json

import org.scalatest.FunSuite

class AddressTest extends FunSuite {
  val lineOne = "สำนักงานใหญ่ เลขที่ 313/1"
  val lineTwo = "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600"
  val cityName = "ธนบุรี"
  val citySubDivisionName = "บุคคโล"
  val postCode = "10600"
  val countrySubDivision = "กรุงเทพมหานคร"
  val countryName = "TH"
  val address = Address(
      lineOne,
      lineTwo,
      cityName,
      citySubDivisionName,
      postCode,
      countrySubDivision,
      countryName)

  test("lineOne in Address constructed is correctly") {
    assert(address.lineOne === lineOne)
  }

  test("lineTwo in Address constructed is correctly") {
    assert(address.lineTwo === lineTwo)
  }

  test("cityName in Address constructed is correctly") {
    assert(address.cityName === cityName)
  }

  test("citySubDivisionName in Address constructed is correctly") {
    assert(address.citySubDivisionName === citySubDivisionName)
  }

  test("postCode in Address constructed is correctly") {
    assert(address.postCode === postCode)
  }

  test("countrySubDivision in Address constructed is correctly") {
    assert(address.countrySubDivision === countrySubDivision)
  }

  test("countryName in Address constructed is correctly") {
    assert(address.countryName === countryName)
  }

  test("Address constructed is correctly") {
    assert(address.lineOne === lineOne)
    assert(address.lineTwo === lineTwo)
    assert(address.cityName === cityName)
    assert(address.citySubDivisionName === citySubDivisionName)
    assert(address.postCode === postCode)
    assert(address.countrySubDivision === countrySubDivision)
    assert(address.countryName === countryName)
  }
}
