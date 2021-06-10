package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        var resultS = ""
        var resultI = 0
        var resultD = LocalDate.of(1970, 1,1)
        if (blockB.toString().contains("String")) {
            for (i in blockA) {
                if (i is String) {
                    resultS += i
                }
            }
        } else if (blockB.toString().contains("int")) {
            for (i in blockA) {
                if (i is Int) {
                    resultI += i
                }
            }
        } else if (blockB.toString().contains("Date")) {
            for (i in blockA) {
                if (i is LocalDate) {
                    if (i.year > resultD.year) {
                        resultD = i
                    } else if (i.year == resultD.year) {
                        if (i.month > resultD.month) {
                            resultD = i
                        } else if (i.month == resultD.month) {
                            if (i.dayOfMonth > resultD.dayOfMonth) {
                                resultD = i
                            }
                        }
                    }
                }
            }
        }
        val format = DateTimeFormatter.ofPattern("dd.MM.yyyy")

        if (blockB.toString().contains("int")) return resultI
        else if (blockB.toString().contains("Date")) return resultD.format(format)
        else return resultS
    }
}
