package api.request

import play.api.libs.json.Writes
import play.api.libs.json.Json
import play.api.data.Form
import play.api.data.Forms._

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

  val form = Form(
    mapping(
      "id" -> text(minLength = 1, maxLength = 64)
    )(ChangeHistoryRegisterParameter.apply)(ChangeHistoryRegisterParameter.unapply)
  )
}