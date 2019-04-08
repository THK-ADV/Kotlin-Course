import org.junit.Assert.assertEquals
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val student = Student(1, "Hans", 12)
        assertEquals(student.id, 1)
        assertEquals(student.name, "Hans")
        assertEquals(student.age, 12)


        student.age = 13
        assertEquals(student.age, 13)
    }
}