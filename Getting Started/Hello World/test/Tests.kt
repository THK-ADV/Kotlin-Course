import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.Test



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

    @Test
    fun testSolution() {
        main()
        assertEquals("Hello World", outStream.toString())
    }
}