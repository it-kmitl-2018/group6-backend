package models.TradeAgreement

import play.api.libs.json.{Json, OFormat}

case class ReferenceDocument(
    id: String,
    createdDate: Long,
    referenceTypeCode: String)

object ReferenceDocument {
  implicit val referenceFormat: OFormat[ReferenceDocument] = Json.format[ReferenceDocument]
}
