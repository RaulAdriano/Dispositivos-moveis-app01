package ramos.adriano.raul.meuprimeiroapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MENSAGEM = "MENSAGEM_TEXTO";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view : View?){
        Toast.makeText(this, "clicou", Toast.LENGTH_LONG).show();

        val mensagem = editText.text.toString();

        val intent = Intent(this,exibirMensagemActivity::class.java);

        intent.putExtra(EXTRA_MENSAGEM, mensagem);
        startActivity(intent);
    }

}
