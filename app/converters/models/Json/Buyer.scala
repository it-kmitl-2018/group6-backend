package converters.models.Json

case class Buyer(
    taxNumber: String,
    branchNumber: String,
    nameEn: String,
    nameTh: String,
    email: String,
    telephone: String,
    fax: String,
    address: Address)
