package day02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class ChoiceKtTest {

    @Test
    @DisplayName("pointsForBattle returns 0 if you lost")
    fun t1() {
        val rockVsPaper: Int = Choice.ROCK.pointsForBattle(Choice.PAPER)
        assertEquals(1 + 0, rockVsPaper)

        val paperVsScissors: Int = Choice.PAPER.pointsForBattle(Choice.SCISSORS)
        assertEquals(2 + 0, paperVsScissors)

        val scissorsVsRock: Int = Choice.SCISSORS.pointsForBattle(Choice.ROCK)
        assertEquals(3 + 0, scissorsVsRock)
    }

    @Test
    @DisplayName("pointsForBattle returns 3 there is a draw")
    fun t2() {
        val rock: Int = Choice.ROCK.pointsForBattle(Choice.ROCK)
        assertEquals(1 + 3, rock)

        val paper: Int = Choice.PAPER.pointsForBattle(Choice.PAPER)
        assertEquals(2 + 3, paper)

        val scissors: Int = Choice.SCISSORS.pointsForBattle(Choice.SCISSORS)
        assertEquals(3 + 3, scissors)
    }

    @Test
    @DisplayName("pointsForBattle returns 6 if you win")
    fun t3() {
        val rockVsScissors: Int = Choice.ROCK.pointsForBattle(Choice.SCISSORS)
        assertEquals(1 + 6, rockVsScissors)

        val paperVsRock: Int = Choice.PAPER.pointsForBattle(Choice.ROCK)
        assertEquals(2 + 6, paperVsRock)

        val scissorsVsPaper: Int = Choice.SCISSORS.pointsForBattle(Choice.PAPER)
        assertEquals(3 + 6, scissorsVsPaper)

    }
}