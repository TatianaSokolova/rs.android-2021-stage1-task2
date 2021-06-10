package subtask1

import java.text.SimpleDateFormat

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        when (month) {
            "2" -> if (year.toInt() % 4 == 0 && year.toInt() % 100 != 0) {
                if (day.toInt() > 29) return "Такого дня не существует"
            } else if (day.toInt() > 28) return "Такого дня не существует"
            "9", "4", "6", "11" -> if (day.toInt() > 30) return "Такого дня не существует"
            "1", "3", "5", "7", "8", "10", "12" -> if (day.toInt() > 31) return "Такого дня не существует"
        }
        if (month.toInt() > 12) return "Такого дня не существует"

        var date = "$day $month $year"
        val format = SimpleDateFormat("dd MM yyyy").parse(date)
        val format2 = SimpleDateFormat("dd MMMM, EEEE").format(format)

        return format2
    }
}
