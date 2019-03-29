package com.example.cortodelabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView correor, usuarior, pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        correor = findViewById(R.id.usuario_r);
        usuarior = findViewById(R.id.correo_r);
        pro1 = findViewById(R.id.tv_prod1r);
        pro2 = findViewById(R.id.tv_prod2r);
        pro3 = findViewById(R.id.tv_prod3r);
        pro4 = findViewById(R.id.tv_prod4r);
        pro5 = findViewById(R.id.tv_prod5r);
        pro6 = findViewById(R.id.tv_prod6r);
        pro7 = findViewById(R.id.tv_prod7r);
        pro8 = findViewById(R.id.tv_prod8r);
        pro9 = findViewById(R.id.tv_prod9r);
        Intent mIntent = getIntent();
        correor.setText(mIntent.getStringExtra(AppConstant.CORREOR_KEY));
        usuarior.setText(mIntent.getStringExtra(AppConstant.USUARIO_KEY));
        pro1.setText(mIntent.getStringExtra(AppConstant.PRODCUTO1_KEY));
        pro2.setText(mIntent.getStringExtra(AppConstant.PRODCUTO2_KEY));
        pro3.setText(mIntent.getStringExtra(AppConstant.PRODCUTO3_KEY));
        pro4.setText(mIntent.getStringExtra(AppConstant.PRODCUTO4_KEY));
        pro5.setText(mIntent.getStringExtra(AppConstant.PRODCUTO5_KEY));
        pro6.setText(mIntent.getStringExtra(AppConstant.PRODCUTO6_KEY));
        pro7.setText(mIntent.getStringExtra(AppConstant.PRODCUTO7_KEY));
        pro8.setText(mIntent.getStringExtra(AppConstant.PRODCUTO8_KEY));
        pro9.setText(mIntent.getStringExtra(AppConstant.PRODCUTO9_KEY));

    }
}
