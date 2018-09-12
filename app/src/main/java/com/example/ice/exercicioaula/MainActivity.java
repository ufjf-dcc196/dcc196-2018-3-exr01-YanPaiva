package com.example.ice.exercicioaula;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_SIAPE = 1;
    private static final int REQUEST_MATRICULA = 1;
    private static final int REQUEST_EMAIL = -1;

    public static final String EXTERNO_SIAPE = "siape";

    public static final String ALUNO_MATRICULA = "MATRICULA";
    public static final String ALUNO_NOME = "NOME";

    public static final String SERVIDOR_EMAIL = "EMAIL";


    private int contAluno = 0;
    private int contExterno = 0;
    private int contServidor = 0;

    private TextView txtQtdAluno;
    private TextView txtQtdExterno;
    private TextView txtQtdServidor;

    private Button btnAluno;
    private Button btnExterno;
    private Button btnServidor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQtdAluno = findViewById(R.id.txtQtdAluno);
        txtQtdExterno = findViewById(R.id.txtQtdExterno);
        txtQtdServidor = findViewById(R.id.txtQtdServidor);

        btnAluno = findViewById(R.id.btn_Aluno);
        btnExterno = findViewById(R.id.btn_Professor);
        btnServidor = findViewById(R.id.btn_Externo);

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent,  REQUEST_MATRICULA);
             }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MainActivity.REQUEST_MATRICULA && resultCode== Activity.RESULT_OK && data != null){
           Bundle bundleResultado = data.getExtras();
           String matricula = bundleResultado.getString(MainActivity.ALUNO_MATRICULA);
           String nome = bundleResultado.getString(MainActivity.ALUNO_NOME);
           Toast.makeText(getApplicationContext(), "ALUNO: "+nome+ "MATRICULA"+matricula, Toast.LENGTH_SHORT).show();
           contAluno++;
           txtQtdAluno.setText(Integer.toString(contAluno));
        }
    }
}
