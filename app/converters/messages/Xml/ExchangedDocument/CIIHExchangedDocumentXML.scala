package converters.messages.Xml.ExchangedDocument

case class CIIHExchangedDocumentXML(
    id: String,
    name: String,
    typeCode: String,
    issueDateTime: Long,
    purpose: String,
    purposeCode: String,
    globalId: String,
    creationDateTime: Long,
    includedCINote: IncludedCINoteXML)