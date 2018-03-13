package controllers

import javax.inject.{Inject, Singleton}

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

@Singleton
class TaxInvoiceController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def convertTaxInvoice() = Action { implicit request: Request[AnyContent] =>
    //TODO: implement post api and route
    //convert json to object and handle error
  }
}
