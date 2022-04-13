fun Int.check(predicate: (Int) -> Boolean) = predicate(this)

typealias IntPredicate = (Int) -> Boolean
fun Int.readableCheck(predicate: IntPredicate) = predicate(this)

fun main() {
    val number = 42
    val concisePredicate: IntPredicate = { it == number }
    println(number.check(concisePredicate)) //true
    println(number.readableCheck(concisePredicate)) //true
}




