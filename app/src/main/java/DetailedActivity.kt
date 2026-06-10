import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ComponentActivity
import com.example.campsitecommander.R


private val DetailedActivity.Quantities: String
    get() {
        TODO()
    }

@SuppressLint("RestrictedApi")
class DetailedActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val txtDetails =
            findViewById<TextView>(R.id.txtDetails)

        val btnBack =
            findViewById<Button>(R.id.btnBack)

        val items =
            intent.getStringExtra("items")

        val category =

            intent.getStringArrayListExtra("quantity")

        val comment =

            intent.getStringArrayListExtra("comments")

        var output = ""

        if(items !=null) {

            for (i in items.indices) {

                output +=
                    "Item: ${items[i]}\n"
                "Category: ${category!![i]}\n"

                " Quantity: ${Quantities!![i]}\n"

                "Comment: ${comment!![i]}\n"
            }
        }

        txtDetails.text = output

        btnBack.setOnClickListener {
            finish()
        }
    }
}