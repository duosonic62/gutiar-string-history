package api.request

import play.api.libs.json.Writes
import play.api.libs.json.Json
import play.api.data.Form
import play.api.data.Forms._

/**
  * ギター登録用パラメータ
  *
  * @param name
  */
case class GuitarRegisterParameter(
    val name: String
)

object GuitarRegisterParameter {
  implicit val writes: Writes[GuitarRegisterParameter] = Json.writes[GuitarRegisterParameter]

  val guitarRegisterParameterForm = Form(
      mapping(
          "name" -> text(minLength = 1, maxLength = 64)
      )(GuitarRegisterParameter.apply)(GuitarRegisterParameter.unapply)
  )
}