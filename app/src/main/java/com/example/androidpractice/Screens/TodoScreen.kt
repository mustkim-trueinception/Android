import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Todo UI CREATED HERE

@Composable
fun Todo() {
    // States are Defined here
    val Task = remember {
        mutableStateListOf("Task 1",) }

    val EnterdText = remember {
        mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            // Heading Text
            Text(
                text = "My Todo App",
                color = Color.DarkGray,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
            // input Box
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                value = EnterdText.value,
                onValueChange = { EnterdText.value = it },
                label = { Text(text = "Tasks") })

            // Add task Button
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 10.dp),
                onClick = {
                    Task.add(EnterdText.value)
                    EnterdText.value = ""
                }
            )
            {
                // Add Task Button
                Text(text = "Add Task")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Tasks List",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(16.dp)
                )

                FilledTonalButton(
                    onClick = {
                        Task.clear()
                    }) {
                    Text(text = "Clear All")
                }
            }

           // Lazy Column for Task List

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                itemsIndexed(Task) { index, task ->

                    // State for Checked Box
                    val checked = remember { mutableStateOf(false) }
                    ListItem(
                        {
                            Text(
                                text = task,
                                textDecoration = if (checked.value) TextDecoration.LineThrough else TextDecoration.None
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        leadingContent = {
                            Checkbox(
                                checked = checked.value,
                                onCheckedChange = { checked.value = it }
                            )
                        },
                        trailingContent = {
                            IconButton(
                                onClick = {
                                Task.removeAt(index)
                            }) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Delete Task",
                                    tint = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    )

                    Divider()
                }


            }
        }
    }
}
