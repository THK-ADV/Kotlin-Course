val sum: (Int, Int) -> Int = { v1, v2 ->
    v1 + v2
}

fun operateOnEach(values: List<Int>, v2: Int, operation: (Int, Int) -> Int) = values.map{ operation(it, v2) }

fun sumOnEach(values: List<Int>, v2: Int) = operateOnEach(values, v2, sum)