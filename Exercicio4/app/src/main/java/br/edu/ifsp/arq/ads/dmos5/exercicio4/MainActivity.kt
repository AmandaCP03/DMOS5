package br.edu.ifsp.arq.ads.dmos5.exercicio4

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.util.Log
import android.view.View
import android.webkit.WebChromeClient.FileChooserParams
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var edtNome: TextView
    lateinit var edtEmail: TextView
    lateinit var edtTelefone: TextView
    lateinit var edtCpf: TextView
    lateinit var edtEndereco: TextView
    lateinit var edtCidade: TextView
    lateinit var btnEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNome = findViewById(R.id.edt_nome)
        edtEmail = findViewById(R.id.edt_email)
        edtTelefone = findViewById(R.id.edt_telefone)
        edtCpf = findViewById(R.id.edt_cpf)
        edtEndereco = findViewById(R.id.edt_cpf)
        edtCidade = findViewById(R.id.edt_cidade)

        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.")
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

    fun onClickBtnSend(view: View?) {
        val intent = Intent(this, Screen2Activity::class.java)

        val nome: String = edtNome.text.toString()
        val email: String = edtEmail.text.toString()
        val telefone: String = edtTelefone.text.toString()
        val cpf: String = edtCpf.text.toString()
        val endereco: String = edtEndereco.text.toString()
        val cidade: String = edtCidade.text.toString()


        // enviar um objeto da classe Cliente
        val cliente = Cliente(nome, email, telefone, cpf, endereco, cidade)
        intent.putExtra("cliente",cliente)
        startActivity(intent)
    }
}