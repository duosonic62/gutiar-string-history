package api.response

import play.api.libs.json.Writes
import play.api.libs.json.Json
import java.time.LocalDate

/**
  * 弦交換履歴情報
  *
  * @param id
  * @param date
  */
case class ChangeHistory(
    val id: String,
    val date: LocalDate
)

object ChangeHistory {
  implicit val writes: Writes[ChangeHistory] = Json.writes[ChangeHistory]
}