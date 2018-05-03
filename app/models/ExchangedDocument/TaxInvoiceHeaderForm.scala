package models.ExchangedDocument

case class TaxInvoiceHeaderForm(
    id: String,
    documentName: String,
    documentTypeCode: String,
    issueDateTime: Long,
    purpose: String,
    purposeCode: String,
    creationDateTime: Long,
    remark: String)
