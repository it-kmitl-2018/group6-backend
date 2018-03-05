package models

import org.scalatest.FunSuite

class GuidelineSpecifiedCIDocumentContextParameterTest extends FunSuite {
  val id = "ER3-2558"

  test("GuidelineSpecifiedCIDocumentContextParameter") {
    val guidelineSpecifiedCIDocumentContextParameter = GuidelineSpecifiedCIDocumentContextParameter(id)

    assert(guidelineSpecifiedCIDocumentContextParameter.id === id)
  }
}
