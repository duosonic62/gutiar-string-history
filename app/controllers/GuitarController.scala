package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json
import api.response.GuitarInformation
import java.util.UUID

class GuitarController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {
    val logger = play.api.Logger("guitar")

    def get = Action { implicit request => 
        val list = Seq(
            GuitarInformation("1", "stratcaster"),
            GuitarInformation("2", "telecaster")
        )
        Ok(Json.toJson(list))
    }
}