import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class Test {

    @Test fun testSum() {
        val v1 = 1
        val v2 = 6
        assertEquals(sum(v1, v2), v1 + v2)
    }

    @Test fun testOperateOnEach() {
        val list = listOf(1, 2, 3, 4, 5)
        val v2 = 2
        assertEquals(operateOnEach(list, v2) { val1, val2 -> val1 + val2 }, list.map { it + v2 })
    }

    @Test fun testSumOnEach() {
        val list = listOf(1, 2, 3, 4, 5)
        val v2 = 2
        assertEquals(sumOnEach(list, v2), list.map { it + v2 })
    }
}