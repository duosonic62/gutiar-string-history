package controllers

import javax.inject.Inject
import play.api.mvc.ControllerComponents
import play.api.mvc.BaseControllerHelpers
import play.api.mvc.Action
import play.api.mvc.AnyContent
import play.api.mvc.ActionBuilder
import play.api.mvc.Request
import play.api.mvc.AbstractController
import play.api.libs.json.JsValue
import play.api.libs.json.Json

class HelloWorldController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
    val logger = play.api.Logger("hello")

    def hello(): Action[AnyContent] = {
        logger.info("Hi!")
        val actionBuilder: ActionBuilder[Request, AnyContent] = controllerComponents.actionBuilder
        val json: JsValue = Json.obj("Hello" -> "World!")
        
        Action(Ok(json))
    }
}