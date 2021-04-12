package controllers

import javax.inject._
import play.api.mvc._
import api.response.ChangeHistory
import java.time.LocalDate
import play.api.libs.json.Json
import api.request.ChangeHistoryRegisterParameter
import views.html.defaultpages.error

class GutiarStringHistoryController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {
    val logger = play.api.Logger("history")
    def get(guitarId: String) = Action { implicit request =>
        val list = Seq(
            ChangeHistory("1", LocalDate.of(2021, 1, 4)),
            ChangeHistory("1", LocalDate.of(2021, 2, 2))
        )

        Ok(Json.toJson(list))
    }

    def post = Action { implicit request =>
        ChangeHistoryRegisterParameter.form.bindFromRequest().fold(
            error => {
                logger.info(s"${error}")
                BadRequest("400")
            },
            request => {
                Ok("200")
            }
        )
    }
}