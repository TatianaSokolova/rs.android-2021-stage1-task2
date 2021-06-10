package subtask2


class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var count = 0
        var order = mutableListOf<Int>()
        for (i in a.toUpperCase()) {
            for (j in b) {
                if (i == j) {
                    order.add(b.indexOf(j))
                    count++
                    if (count == b.length && order.size > 1 && order.last() > order[order.size - 2]) {
                        return "YES"
                    }
                }
            }
        }
        return "NO"
    }
}
