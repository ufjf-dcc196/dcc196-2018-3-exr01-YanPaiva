package com.example.ice.exercicioaula;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ServidorActivity extends AppCompatActivity {
    private Button btnServidorCadastrar;
    private EditText edtNomeServidor;
    private EditText edtSiapeServidor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);
        btnServidorCadastrar = findViewById(R.id.btn_Servidor_cadastrar);
        edtNomeServidor = findViewById(R.id.edt_text_servidor_nome);
        edtSiapeServidor = findViewById(R.id.edt_text_servidor_Siape);
        btnServidorCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.SERVIDOR_NOME, edtNomeServidor.getText().toString());
                resultado.putExtra(MainActivity.SERVIDOR_SIAPE, edtSiapeServidor.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();

            }
        });
    }
}
