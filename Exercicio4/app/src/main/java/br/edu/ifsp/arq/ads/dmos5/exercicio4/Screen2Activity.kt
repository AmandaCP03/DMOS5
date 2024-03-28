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

        val cliente: Cliente? = intent.getSerializableExtra("cliente") as Cliente?

        Toast.makeText(this, "Nome: ${cliente?.getNome()}\n " +
                "Email: ${cliente?.getEmail()}\n" +
                "Telefone: ${cliente?.getTelefone()}\n " +
                "CPF: ${cliente?.getCpf()}\n " +
                "Endereço: ${cliente?.getEndereco()}\n " +
                "Cidade: ${cliente?.getCidade()}",
            Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo", getClassName() + ".onStart() foi chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ciclo", getClassName() + ".onResume() foi chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ciclo", getClassName() + ".onPause() foi chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ciclo", getClassName() + ".onStop() foi chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ciclo", getClassName() + ".onRestart() foi chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ciclo", getClassName() + ".onDestroy() foi chamado.")
    }

    private fun getClassName(): String {
        val nomeClasse = javaClass.name
        return nomeClasse.substring(nomeClasse.lastIndexOf("."))
    }

}