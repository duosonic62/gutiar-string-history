package api.response

import play.api.libs.json.Writes
import play.api.libs.json.Json
import java.time.LocalDateTime

/**
  * 弦交換履歴情報
  *
  * @param id
  * @param date
  */
case class ChangeHistory(
    val id: String,
    val date: LocalDateTime
)

object ChangeHistoryResponse {
  implicit val writes: Writes[ChangeHistory] = Json.writes[ChangeHistory]
}