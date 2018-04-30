package converters

import javax.inject.Singleton

import converters.messages.Json.{Address, Buyer, Seller, TaxInvoice}
import models.CommercialTransaction
import models.TradeAgreement.{Dealer, TradeAgreement}
import play.api.libs.json.JsValue
import utilities.Json

@Singleton
class TaxInvoiceConverter {
  def convertTradeAgreementToJson(tradeAgreement: TradeAgreement): JsValue = {
    val buyerAddress = convertAddressToJson(tradeAgreement.buyer.address)
    val sellerAddress = convertAddressToJson(tradeAgreement.seller.address)
    val buyer = convertBuyerToJson(tradeAgreement.buyer, buyerAddress)
    val seller = convertSellerToJson(tradeAgreement.seller, sellerAddress)
    val taxInvoice = TaxInvoice(seller, buyer)

    Json.toJson(taxInvoice)
  }

  private def convertAddressToJson(tradeAgreementAddress: CommercialTransaction.Address): Address = {
    val address = Address(
      tradeAgreementAddress.buildingName+" "
        +tradeAgreementAddress.buildingNumber,
      tradeAgreementAddress.streetName+" "
        +tradeAgreementAddress.subDistrictCode+" "
        +tradeAgreementAddress.districtCode+" "
        +tradeAgreementAddress.countrySubDivisionCode+" "
        +tradeAgreementAddress.postalCode,
      tradeAgreementAddress.districtCode,
      tradeAgreementAddress.subDistrictCode,
      tradeAgreementAddress.postalCode,
      tradeAgreementAddress.countrySubDivisionCode,
      tradeAgreementAddress.countryCode)

    address
  }

  private def convertBuyerToJson(dealer: Dealer, buyerAddress: Address): Buyer = {
    val buyer = Buyer(
      dealer.taxPayerId,
      "",
      "",
      dealer.name,
      dealer.email,
      "",
      "",
      buyerAddress)

    buyer
  }

  private def convertSellerToJson(dealer: Dealer, sellerAddress: Address): Seller = {
    val seller = Seller(
      dealer.taxPayerId,
      "",
      "",
      dealer.name,
      dealer.email,
      "",
      "",
      sellerAddress)

    seller
  }
}
