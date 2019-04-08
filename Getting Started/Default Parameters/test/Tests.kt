import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test fun testParam() {
        val firstName = "Peter"
        val lastName = "Petersen"
        val birthName = "Lustig"
        assertEquals(getFullName(firstName, lastName, birthName), "$firstName $lastName ($birthName)")
    }

    @Test fun testDefault() {
        val firstName = "Peter"
        val lastName = "Petersen"
        assertEquals(getFullName(firstName, lastName), "$firstName $lastName ($lastName)")
    }
}