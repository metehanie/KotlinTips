fun Int.check(predicate: (Int) -> Boolean) = predicate(this)

typealias IntPredicate = (Int) -> Boolean
fun Int.readableCheck(predicate: IntPredicate) = predicate(this)

fun main() {
    val number = 42
    val concisePredicate: IntPredicate = { it == number }
    println(number.check(concisePredicate)) //true
    println(number.readableCheck(concisePredicate)) //true

    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7)
    val (even, odd) = numbers.partition { it % 2 == 0 }
    println(odd) // [1, 3, 5, 7]
    println(even) // [0, 2, 4, 6]

    val word = "Hello World! My name is Metehan."
    val freqTable = word.groupingBy { it }.eachCount()
    freqTable.forEach {
        if (it.key == ' ') {
            println(" ${it.value} adet boşluk var.")
        }
    }
    println(freqTable) // {H=1, e=4, l=3, o=2,  =5, W=1, r=1, d=1, !=1, M=2, y=1, n=2, a=2, m=1, i=1, s=1, t=1, h=1, .=1}
}
