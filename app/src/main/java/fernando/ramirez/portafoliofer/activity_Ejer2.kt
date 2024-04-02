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

class activity_Ejer2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejer2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val baseA = findViewById<EditText>(R.id.txtBase)
        val alturaA = findViewById<EditText>(R.id.txtAltura)
        val areaT = findViewById<Button>(R.id.btnCalcularA)
        val areaL = findViewById<TextView>(R.id.lblArea)
        val objArea = calcularArea()

        areaT.setOnClickListener {
            val resultado = objArea.areaTriangulo(baseA.text.toString().toDouble(), alturaA.text.toString().toDouble())
            areaL.text = "Área del triangulo: $resultado"
            println(resultado)
        }

        val btnContinuar = findViewById<ImageButton>(R.id.btnNext)
        btnContinuar.setOnClickListener {
            val pantalla3 = Intent(this, activity_Ejer3::class.java)
            startActivity(pantalla3)
        }
        val btnRegresar = findViewById<ImageButton>(R.id.btnBack)
        btnRegresar.setOnClickListener {
            val pantalla1 = Intent(this, activity_Ejer1::class.java)
            startActivity(pantalla1)
        }
    }
}