package converters.messages.Xml.ExchangedDocument

case class CIIHExchangedDocument(
    id: String,
    name: String,
    typeCode: String,
    issueDateTime: Long,
    purpose: String,
    purposeCode: String,
    globalId: String,
    creationDateTime: Long,
    includedCINote: IncludedCINote)