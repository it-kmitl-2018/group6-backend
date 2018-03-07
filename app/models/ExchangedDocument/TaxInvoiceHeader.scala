package models.ExchangedDocument

case class TaxInvoiceHeader(
    id: String,
    documentName: String,
    documentTypeCode: String,
    issueDateTime: Long,
    purpose: String,
    purposeCode: String,
    creationDateTime: Long,
    remark: String)
