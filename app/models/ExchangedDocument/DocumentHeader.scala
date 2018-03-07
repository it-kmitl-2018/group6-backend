package models.ExchangedDocument

case class DocumentHeader(
    id: String,
    documentName: String,
    documentTypeCode: String,
    issueDateTime: Long,
    purpose: String,
    purposeCode: String,
    creationDateTime: Long,
    includedNote: DocumentIncludedNote)
