package day01

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ListChunkerTest {
    @Test
    @DisplayName("When there are no separating lines")
    fun t1() {
        val input: List<Int?> = listOf(1000, 2000)

        val result = ListChunker.chunk(input)

        assertEquals(listOf(input), result)
    }

    @Test
    @DisplayName("When there are separating lines")
    fun t2() {
        val input: List<Int?> = listOf(1000, 2000, null, 3000)

        val result = ListChunker.chunk(input)

        val expected = listOf(listOf(1000, 2000),  listOf(3000))

        assertEquals(expected, result)
    }
}