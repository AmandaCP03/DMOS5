package br.edu.ifsp.arq.ads.dmos5.exercicio4

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.")
        val intent = intent

        val name = intent.getStringExtra("name")
        val email = intent.getIntExtra("email")

        val cliente: Cliente? = intent.getSerializableExtra("cliente") as Cliente?

        Toast.makeText(
            this, "Nome: $name Idade: $age \nNome 2: ${cliente?.getNome()} Idade 2: ${cliente?.getEmail()}",
            Toast.LENGTH_SHORT
        ).show()

    }
}