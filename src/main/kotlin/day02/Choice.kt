package day02

enum class Choice(val points: Int) {
    ROCK(1),
    PAPER(2),
    SCISSORS(3)
}

fun parseChoice(input: String): Choice? {
    return when (input) {
        "A" -> Choice.ROCK
        "X" -> Choice.ROCK
        "B" -> Choice.PAPER
        "Y" -> Choice.PAPER
        "C" -> Choice.SCISSORS
        "Z" -> Choice.SCISSORS
        else -> null
    }
}

fun leftBeatsRight(lhs: Choice, rhs: Choice): Boolean {
    return (lhs == Choice.PAPER && rhs == Choice.ROCK) ||
            (lhs == Choice.ROCK && rhs == Choice.SCISSORS) ||
            (lhs == Choice.SCISSORS && rhs == Choice.PAPER)

}
fun Choice.pointsForBattle(choice: Choice): Int {
    return  this.points + if (this == choice) 3
    else if (leftBeatsRight(this, choice)) 6
    else 0
}
