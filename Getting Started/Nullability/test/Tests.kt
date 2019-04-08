import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class Test {
    @Test fun testFirstOrNull() {
        assertNull("".firstCharacterOrNull())
        assertNull(" ".firstCharacterOrNull())
        assertEquals("Hallo".firstCharacterOrNull(), 'H')
        assertEquals("hallo".firstCharacterOrNull(), 'h')
    }

    @Test fun testToUpperCase() {
        assertNull(toUpperCaseIfNotNull(null))
        assertEquals(toUpperCaseIfNotNull("hello"), "HELLO")
    }
}