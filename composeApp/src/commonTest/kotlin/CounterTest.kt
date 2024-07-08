import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class CounterTest {

    @Test
    fun testCounter() {
        val text = "Hello, World!"
        assertThat(count(text)).isEqualTo(13)
    }

}
