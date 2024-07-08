import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class CounterUiTest {

    @OptIn(ExperimentalTestApi::class, ExperimentalTestApi::class)
    @Test
    fun testCounterUi() = runComposeUiTest {
        setContent {
            CounterUi()
        }

        onNodeWithText("The length").assertDoesNotExist()

        onNodeWithContentDescription("Name of the user").performTextInput("Daniel Passos")
        onNodeWithText("Count").performClick()
        onNodeWithText("The length of 'Daniel Passos' is 13").assertExists()
    }

}
