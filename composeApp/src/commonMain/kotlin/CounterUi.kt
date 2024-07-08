import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun CounterUi() {

    var text by remember { mutableStateOf("") }
    var length by remember { mutableStateOf(0) }

    Column {
        TextField(
            modifier = Modifier.semantics { contentDescription = "Name of the user" },
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter text") }
        )
        Button(onClick = { length = count(text) }) {
            Text("Count")
        }

        if (length > 0) {
            Text(text = "The length of '$text' is $length")
        }
    }
}
