import org.junit.Assert.*
import org.junit.Test

class Test {
    @Test fun testAddress() {
        val street = "ExampleStreet"
        val houseNumber = "1"
        val postalCode = 12345
        val city = "ExampleCity"

        val address = Address(street, houseNumber, postalCode, city)
        assertEquals(address.street, street)
        assertEquals(address.houseNumber, houseNumber)
        assertEquals(address.postalCode, postalCode)
        assertEquals(address.city, city)

        assertEquals(address.toString(), "Address(street=$street, houseNumber=$houseNumber, postalCode=$postalCode, city=$city)")
    }

    @Test fun testAddressBook() {
        val street = "ExampleStreet"
        val houseNumber = "1"
        val postalCode = 12345
        val city = "ExampleCity"

        val address = Address(street, houseNumber, postalCode, city)
        val address2 = Address(street, houseNumber, postalCode, city)
        val address3 = Address(street.toUpperCase(), houseNumber, postalCode, city)
        val addressBook = AddressBook(mutableListOf(address))

        assertTrue(addressBook.contains(address2))
        assertFalse(addressBook.contains(address3))
    }
}