package api.request

import play.api.libs.json.Writes
import play.api.libs.json.Json

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
}