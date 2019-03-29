package com.example.cortodelabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView Producto1;
    private TextView Producto2;
    private TextView Producto3;
    private TextView Producto4;
    private TextView Producto5;
    private TextView Producto6;
    private TextView Producto7;
    private TextView Producto8;
    private TextView Producto9;
    private TextView Correo_1;
    private TextView Usuario1;
    private TextView mostrar1;
    private TextView mostrar12;
    private Button Enviar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Producto1 = findViewById(R.id.tv_prod1);
        Producto2 = findViewById(R.id.tv_prod2);
        Producto3 = findViewById(R.id.tv_prod3);
        Producto4 = findViewById(R.id.tv_prod4);
        Producto5 = findViewById(R.id.tv_prod5);
        Producto6 = findViewById(R.id.tv_prod6);
        Producto7 = findViewById(R.id.tv_prod7);
        Producto8 = findViewById(R.id.tv_prod8);
        Producto9 = findViewById(R.id.tv_prod9);
        mostrar1 = findViewById(R.id.mostrar);
        mostrar12 = findViewById(R.id.tv_detalle);
        Usuario1 = findViewById(R.id.usuario1);
        Correo_1 = findViewById(R.id.correo1);
        Enviar1 = findViewById(R.id.enviar);


        Producto1.setOnClickListener(v ->{
            contar(Producto1);
        });
        Producto2.setOnClickListener(v ->{
            contar(Producto2);
        });
        Producto3.setOnClickListener(v ->{
            contar(Producto3);
        });
        Producto4.setOnClickListener(v ->{
            contar(Producto4);
        });
        Producto5.setOnClickListener(v ->{
            contar(Producto5);
        });
        Producto6.setOnClickListener(v ->{
            contar(Producto6);
        });
        Producto7.setOnClickListener(v ->{
            contar(Producto7);
        });
        Producto8.setOnClickListener(v ->{
            contar(Producto8);
        });
        Producto9.setOnClickListener(v ->{
            contar(Producto9);
        });



        Enviar1.setOnClickListener(v -> {
            String produ1 = Producto1.getText().toString();
            String produ2 = Producto2.getText().toString();
            String produ3 = Producto3.getText().toString();
            String produ4 = Producto4.getText().toString();
            String produ5 = Producto5.getText().toString();
            String produ6 = Producto6.getText().toString();
            String produ7 = Producto7.getText().toString();
            String produ8 = Producto8.getText().toString();
            String produ9 = Producto9.getText().toString();
            String correo3 = Correo_1.getText().toString();

            String usu = Usuario1.getText().toString();
            Intent mIntent= new Intent(this, Main2Activity.class);
            mIntent.putExtra(AppConstant.CORREOR_KEY, correo3);
            mIntent.putExtra(AppConstant.USUARIO_KEY, usu);

            mIntent.putExtra(AppConstant.PRODCUTO1_KEY, produ1);
            mIntent.putExtra(AppConstant.PRODCUTO1_KEY, produ1);
            mIntent.putExtra(AppConstant.PRODCUTO2_KEY, produ2);
            mIntent.putExtra(AppConstant.PRODCUTO3_KEY, produ3);
            mIntent.putExtra(AppConstant.PRODCUTO4_KEY, produ4);
            mIntent.putExtra(AppConstant.PRODCUTO5_KEY, produ5);
            mIntent.putExtra(AppConstant.PRODCUTO6_KEY, produ6);
            mIntent.putExtra(AppConstant.PRODCUTO7_KEY, produ7);
            mIntent.putExtra(AppConstant.PRODCUTO8_KEY, produ8);
            mIntent.putExtra(AppConstant.PRODCUTO9_KEY, produ9);
            startActivity(mIntent);
        });

    }



    public void contar(TextView textView) {
        int contadora;
        contadora = Integer.parseInt(textView.getText().toString());
        contadora++;
        mostrar1.setText((Integer.parseInt(mostrar1.getText().toString())+contadora)+"");
        textView.setText(Integer.toString(contadora));

    }

}
