package models

import org.scalatest.FunSuite

class GuidelineSpecifiedDocumentTest extends FunSuite {
  val guidelineId = "ER3-2558"

  test("GuidelineSpecifiedDocument") {
    val guidelineSpecifiedDocument = GuidelineSpecifiedDocument(guidelineId)

    assert(guidelineSpecifiedDocument.GuidelineId === guidelineId)
  }
}
