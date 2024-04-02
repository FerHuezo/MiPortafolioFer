package fernando.ramirez.portafoliofer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_Ejer3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejer3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val num = findViewById<EditText>(R.id.txtNum)
        val comp = findViewById<Button>(R.id.btnCom)
        val result = findViewById<TextView>(R.id.lblResult)
        val parImpar = parImpar()

        comp.setOnClickListener {
            val inputText = num.text.toString()
            try {
                val number = inputText.toInt()
                val resultado = parImpar.vefParImpar(number)
                result.text = resultado
            } catch (e: NumberFormatException) {
                result.text = "Por favor, ingresa un número entero válido."
            }
        }


        val btnRegresar = findViewById<ImageButton>(R.id.btnBack)
        btnRegresar.setOnClickListener {
            val pantalla2 = Intent(this, activity_Ejer2::class.java)
            startActivity(pantalla2)
        }
    }
}