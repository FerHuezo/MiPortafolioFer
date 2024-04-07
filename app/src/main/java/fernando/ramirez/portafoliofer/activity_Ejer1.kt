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

class activity_Ejer1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejer1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val anoNaci = findViewById<EditText>(R.id.txtAño)
        val calcu = findViewById<Button>(R.id.btnCalcular)
        val edadU = findViewById<TextView>(R.id.lblEdad)
        val objEdad = calcularEdad()

        calcu.setOnClickListener {
            val resultado = objEdad.calcuEdad(anoNaci.text.toString().toInt())
            edadU.text = "Tienes $resultado años"
        }

        val btnContinuar = findViewById<ImageButton>(R.id.btnNext)
        btnContinuar.setOnClickListener {
            val pantalla2 = Intent(this, activity_Ejer2::class.java)
            startActivity(pantalla2)
        }

    }

}



