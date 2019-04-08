import org.junit.Assert.*
import org.junit.Test

class Test {
    @Test fun testList() {
        assertEquals(createStringList(), listOf("A", "B", "C"))
    }

    @Test fun testArray() {
        assertEquals(createStringArray(), arrayOf("A", "B", "C"))
    }
}