package com.example.campsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {

    private val itemName =

        arrayListOf("Tent", "Meat", "Flashlight")

    private val category =

        arrayListOf("Shelter", "Food", "Safety")

    private val quantity: kotlin.collections.ArrayList<Int> =

        arrayListOf(1,3,2)

    private val comments =
        arrayListOf(
            "4-person waterproof",
            "Wors and Beef Meat (1,5KG for Each)",
            "Get batteries (Energiser)"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val txtTotal =
            findViewById<TextView>(R.id.txtTotal)

        val btnAdd =
            findViewById<Button>(R.id.btnAdd)

        val btnView =
            findViewById<Button>(R.id.btnView)

        var total = 0

        for (quantity in quantity!!) {
            total += quantity

        }

        txtTotal.text =
            "Total Items Packed: $total"

        btnAdd.setOnClickListener {

            itemName.add("First Aid Kit")
            category.add("Safety")
            quantity.add(2)
            comments.add("For Emergency Usage")

            Toast.makeText(this, "Item Added" , Toast.LENGTH_SHORT).show()
        }

        btnView.setOnClickListener {

            val intent =

                Intent(this, DetailedActivity::class.java)

            intent.putStringArrayListExtra("items" , itemName)

            intent.putStringArrayListExtra("category" , category )

            intent.putStringArrayListExtra("quantity")

            intent.putStringArrayListExtra("comments" , comments)

            startActivity(intent)



        }


    }
}

private fun Intent.putStringArrayListExtra(
    quantity: String
) {
}


