package dev.tajik.rnd1

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testButton: Button = findViewById(R.id.button)
        testButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Вы нажали кнопку!", Toast.LENGTH_SHORT)
//            toast.show()
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = "7"
            showTest()
        }
        val sumButton: Button = findViewById(R.id.button2)
        sumButton.setOnClickListener {
            showSUM()
        }
    }

    private fun showTest() {
        val test = Test(100)
        val showTest = test.show()
        val showTest2 = test.show()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = showTest.toString()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = showTest2.toString()
    }

    private fun showSUM() {
        val s1 : EditText = findViewById(R.id.X1)
        val s2 : EditText = findViewById(R.id.X2)
        val sum = mySUM(s1.text.toString().toInt(),s2.text.toString().toInt())
        val mySUM = sum.SUM()
        val resultTextView3: TextView = findViewById(R.id.textView3)
        resultTextView3.text = mySUM.toString()
    }

}

class Test(private val numSides: Int) {

    fun show(): Int {
        return (1..numSides).random()
    }
}

class mySUM(private val x1: Int, private val x2: Int) {

    fun SUM(): Int {
        return x1 + x2
    }
}