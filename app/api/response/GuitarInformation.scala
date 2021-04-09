package api.response

import play.api.libs.json.Writes
import play.api.libs.json.Json

/**
  * ギター登録情報
  *
  * @param id
  * @param name
  */
case class GuitarInformation(
    val id: String,
    val name: String
)

object GuitarInformationResponse {
  implicit val writes: Writes[GuitarInformation] = Json.writes[GuitarInformation]
}