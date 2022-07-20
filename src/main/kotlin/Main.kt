import kotlin.math.ceil
import kotlin.math.round

fun Int.check(predicate: (Int) -> Boolean) = predicate(this)

typealias IntPredicate = (Int) -> Boolean
fun Int.readableCheck(predicate: IntPredicate) = predicate(this)

fun main() {
    val n1 = intArrayOf(4,2,1)
    val n2 = intArrayOf(3,6,5,7)

    println(findMedianSortedArrays(n1, n2))

    /*
    val number = 42
    val concisePredicate: IntPredicate = { it == number }
    println(number.check(concisePredicate)) //true
    println(number.readableCheck(concisePredicate)) //true

    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7)
    val (even, odd) = numbers.partition { it % 2 == 0 }
    println(even) // [0, 2, 4, 6]
    println(odd) // [1, 3, 5, 7]

    val word = "Hello World! My name is Metehan."
    val freqTable = word.groupingBy { it }.eachCount()
    println(freqTable) // {H=1, e=4, l=3, o=2,  =5, W=1, r=1, d=1, !=1, M=2, y=1, n=2, a=2, m=1, i=1, s=1, t=1, h=1, .=1}
    freqTable.forEach {
        if (it.key == ' ') {
            println("There are ${it.value} spaces in this sentence..")
        }
    }

    // Swapping without third variable.
    var x = 816
    var y = 42
    println("Before swapping: x = $x - y = $y")
    x = y.also { y = x }
    println("After swapping: x = $x - y = $y")

     */
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val news = (nums1 + nums2).sorted()
    val med = ((nums1.size + nums2.size) + 1) / 2f
    return ((news[round(med).toInt()-1] + news[ceil(med).toInt()] -1) / 2f).toDouble()
}
