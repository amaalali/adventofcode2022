package day01

object ListChunker {
    fun chunk(list: List<Int?>): List<List<Int>>  {
//        val numberOfElves: Int = if (list.isEmpty()) 0 else (list.size - list.filterNotNull().size + 1)

        val init = ArrayList<ArrayList<Int>>()

        var start = 0

        println("init size " + list.size)
        while (start != list.size) {
            println("curr count " + start)
            val sublist = list.subList(start, list.size)
            val nextSlice = sublist.takeWhile { x -> x != null }

            println("nextSlice " + nextSlice)

            init.add(nextSlice as ArrayList<Int>)

            start += nextSlice.size

            println("next count " + start)

        }

        return listOf(list.filterNotNull())
    }
}