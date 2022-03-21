package com.example.calendarapp


import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.Button)

        button.setOnClickListener {
            showDatePicker()
        }
    }

    private fun showDatePicker() {
        val textView = findViewById<TextView>(R.id.TextView)
        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener() {view, year, month, dayOfMonth->
                textView.text = "選択した日付は「${year}/${month + 1}/${dayOfMonth}」です"
            },
            2020,
            3,
            1)
        datePickerDialog.show()
    }
}