package br.edu.edu.ifsp.arq.ads.dmos5.projeto2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var edtName: TextView
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edt_name)
        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener(View.OnClickListener{
            val nome: String = edtName.text.toString()

            //msg temporária
            android.widget.Toast.makeText(this, getString(R.string.message) + " " + nome + "!", android.widget.Toast.LENGTH_SHORT).show()
        })
    }
}