package models

import org.scalatest.FunSuite

class CIExchangedDocumentContextTest extends FunSuite {
  val id = "ER3-2558"
  val guidelineSpecifiedCIDocumentContextParameter =
    GuidelineSpecifiedCIDocumentContextParameter(id)

  test("CIExchangedDocumentContext") {
    val cIExchangedDocumentContext =
      CIExchangedDocumentContext(guidelineSpecifiedCIDocumentContextParameter)

    assert(cIExchangedDocumentContext.guidelineSpecifiedCIDocumentContextParameter ===
      guidelineSpecifiedCIDocumentContextParameter)
  }

}
