import kotlin.test.Test
import kotlin.test.assertEquals

class CounterTest {

    @Test
    fun testCounter() {
        val text = "Hello, World!"
        val result = count(text)
        assertEquals(13, result)
    }

}
