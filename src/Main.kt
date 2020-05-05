// https://www.hackerrank.com/challenges/sparse-arrays/problem

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val strMap = strings.groupingBy { it }.eachCount()
    return queries.map { strMap[it] ?: 0 }.toTypedArray()
}

fun main() {
    println(matchingStrings(listOf("def", "de", "fgh").toTypedArray(), listOf("de", "lmn", "fgh").toTypedArray()).toList())
}