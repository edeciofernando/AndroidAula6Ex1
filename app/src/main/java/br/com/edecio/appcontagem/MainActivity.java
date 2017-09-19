package br.com.edecio.appcontagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnIniciar;
    private TextView txtNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        txtNumero = (TextView) findViewById(R.id.txtNumero);

        btnIniciar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ContagemRegressiva cr = new ContagemRegressiva(btnIniciar, txtNumero);
        cr.execute(10);
    }
}
