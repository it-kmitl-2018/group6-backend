package converters.messages.Json

import org.scalatest.FunSuite

class NoteTest extends FunSuite{
  val subject = "หมายเหตุ"
  val content = "\n แบบรถ : Toyota Fortuner 3.0V AT 2014 TRD\n เลขเครื่อง : 1KD-FTV\n เลขตัวถัง : FN-83741\n สี : สีเทา\n"
  val taxInvoiceNote = Note(subject, content)

  test("subject in Note constructed is correctly"){
    assert(taxInvoiceNote.subject === subject)
  }

  test("content in Note constructed is correctly"){
    assert(taxInvoiceNote.content === content)
  }

  test("Note constructed is correctly"){
    assert(taxInvoiceNote.subject === subject)
    assert(taxInvoiceNote.content === content)
  }
}
