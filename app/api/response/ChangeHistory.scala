package api.response

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