package src.problems

fun main() {
    val (e, f, c) = readln().split(" ").map { it.toInt() }
    val empty = e + f
    val drank = drinkAndBuyBottles(empty, c)
    println(drank)
}

private fun drinkAndBuyBottles(empty: Int, cost: Int): Int {
    var e = empty
    if (e < cost) {
        return 0
    }
    e = empty - cost + 1

    return 1 + drinkAndBuyBottles(e, cost)
}