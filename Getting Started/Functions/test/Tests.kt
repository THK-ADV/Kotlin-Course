import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Test {


    private val outStream = ByteArrayOutputStream()
    private val originalOut = System.out

    @Before
    fun setUpStreams() {
        System.setOut(PrintStream(outStream))
    }

    @After
    fun restoreStreams() {
        System.setOut(originalOut)
    }

    @Test fun testPrintSum() {
        val v1 = 1
        val v2 = 5
        printSum(v1, v2)
        assertEquals("${v1 + v2}", outStream.toString())
    }

    @Test fun testSum() {
        val v1 = 1
        val v2 = 5
        assertEquals(sum(v1, v2), v1 + v2)
    }
}