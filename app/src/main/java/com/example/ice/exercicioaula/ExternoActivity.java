package com.example.ice.exercicioaula;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExternoActivity extends AppCompatActivity {
    private Button btnExternoCadastrar;
    private EditText edtNomeExterno;
    private EditText edtEmailExterno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);
        btnExternoCadastrar = findViewById(R.id.btn_externo_cadastrar);
        edtNomeExterno = findViewById(R.id.edt_text_externo_nome);
        edtEmailExterno = findViewById(R.id.edt_text_externo_email);
        btnExternoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.EXTERNO_NOME, edtNomeExterno.getText().toString());
                resultado.putExtra(MainActivity.EXTERNO_EMAIL, edtEmailExterno.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });
    }
}
