package com.example.ice.exercicioaula;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlunoActivity extends AppCompatActivity {
    private Button btnAlunoCadastrar;
    private EditText edtNomeAluno;
    private EditText edtMatriculaAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
        btnAlunoCadastrar = findViewById(R.id.btn_Aluno_Cadastrar);
        edtNomeAluno = findViewById(R.id.edt_Text_Aluno_Nome);
        edtMatriculaAluno = findViewById(R.id.edt_Text_Aluno_Matricula);

        btnAlunoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.ALUNO_MATRICULA, edtMatriculaAluno.getText().toString());
                resultado.putExtra(MainActivity.ALUNO_NOME, edtNomeAluno.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });

    }
}
