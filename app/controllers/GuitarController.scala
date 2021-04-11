package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json
import api.response.GuitarInformation
import java.util.UUID
import play.api.data.Form
import play.api.data.Forms._
import api.request.GuitarRegisterParameter
import views.html.defaultpages.error

class GuitarController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {
    val logger = play.api.Logger("guitar")

    /**
      * ギターの一覧表示
      *
      * @return ギターの一覧
      */
    def get = Action { implicit request => 
        val list = Seq(
            GuitarInformation("1", "stratcaster"),
            GuitarInformation("2", "telecaster")
        )
        Ok(Json.toJson(list))
    }

    /**
      * ギター新規登録
      *
      * @return 成功 / 失敗
      */
    def post = Action { implicit request => 
        GuitarRegisterParameter.guitarRegisterParameterForm.bindFromRequest().fold(
            error => {
                logger.info(s"${error}")
                BadRequest("400")
            },
            request => {
                logger.info(s"${request.name}")
                Ok("200")
            }
        )
    }
}