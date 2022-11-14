package com.viona.hiltlesson1.util

import java.text.SimpleDateFormat
import java.util.*

/**
 * String formatter for log dates.
 */
class DateFormatter {

    private val formatter = SimpleDateFormat("d MMM yyy HH:mm:ss")

    fun formatDate(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}
