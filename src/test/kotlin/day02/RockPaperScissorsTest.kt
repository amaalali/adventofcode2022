package day02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class RockPaperScissorsTest {

    @Test
    @DisplayName("Acceptance test")
    fun t1() {
        val input: String = """
            #A Y
            #B X
            #C Z            
        """.trimMargin("#")

        val result: Int = RockPaperScissors.calculateScore(input)

        assertEquals(15, result)
    }

    @Test
    @DisplayName("Rock Vs Paper will always be 8")
    fun t2() {
        val input: String = """
            #A Y
        """.trimMargin("#")

        val result: Int = RockPaperScissors.calculateScore(input)

        assertEquals(8,result)
    }

    @Test
    @DisplayName("Paper Vs Rock will always be 1")
    fun t3() {
        val input: String = """
            #B X
        """.trimMargin("#")

        val result: Int = RockPaperScissors.calculateScore(input)

       assertEquals(1, result)
    }

    @Test
    @DisplayName("Calculate pair will return the sum of the points for winning and for the thing you win with")
    fun t4() {
        val result = RockPaperScissors.calculatePair("A", "Y")

        // 6 points for winning, plus 2 points for using paper
        assertEquals(8, result)
    }

    @Test
    @DisplayName("Calculate pair will return the sum of the points for winning and for the thing you win with")
    fun t4_2() {
        val result = RockPaperScissors.calculatePair("B", "X")

        assertEquals(1, result)
    }

    @Test
    @DisplayName("When I have A then I should get ROCK")
    fun t5(){
        val result: Choice? = parseChoice("A")

        assertEquals(Choice.ROCK, result)
    }

    @Test
    @DisplayName("When I have B then I should get PAPER")
    fun t6(){
        val result: Choice? = parseChoice("B")

        assertEquals(Choice.PAPER, result)
    }

    @Test
    @DisplayName("When I have C then I should get SCISSORS")
    fun t7(){
        val result: Choice? = parseChoice("C")

        assertEquals(Choice.SCISSORS, result)
    }
}
