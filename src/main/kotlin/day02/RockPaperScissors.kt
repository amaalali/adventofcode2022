package day02

object RockPaperScissors {

    fun calculatePair(theirMove: String, myMove: String): Int? {
        val myChoice = parseChoice(myMove)
        val theirChoice = parseChoice(theirMove)

        return if (theirChoice == null) {
           null
        } else {
            myChoice?.pointsForBattle(theirChoice)
        }
    }

    fun calculateScore(input: String): Int {
        val lines = input.split("\n")

        val sum = lines.map { line ->
            val line = line.split(" ")
            val theirMove = line[0]
            val myMove = line[1]
            calculatePair(theirMove, myMove)!!
        }

        return sum.sum()
    }

}