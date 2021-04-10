package api.response

import play.api.libs.json.Json

/**
  * ギター登録情報
  *
  * @param id
  * @param name
  */
case class GuitarInformation(
    id: String,
    name: String
)

object GuitarInformation {
  implicit val writes = Json.writes[GuitarInformation]
}