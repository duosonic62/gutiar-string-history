package api.request

import play.api.libs.json.Writes
import play.api.libs.json.Json

/**
  * 弦交換履歴登録パラメータ
  *
  * @param id
  */
case class ChangeHistoryRegisterParameter(
    val id: String
)

object ChangeHistoryRegisterParameter {
  implicit val writes: Writes[ChangeHistoryRegisterParameter] = Json.writes[ChangeHistoryRegisterParameter]
}