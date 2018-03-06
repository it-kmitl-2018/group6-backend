package models.ExchangedDocument

case class ExchangedDocument(
    id: String,
    documentName: String,
    documentTypeCode: String,
    issueDateTime: Long,
    purpose: String,
    purposeCode: String,
    creationDateTime: Long,
    includedNote: IncludedNote
)
