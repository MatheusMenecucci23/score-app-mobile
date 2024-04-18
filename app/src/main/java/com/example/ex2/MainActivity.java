package com.example.ex2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // ------- TEAM 1 -----//
    int pontos1;

    TextView pontost1;

    // ------- TEAM 2 -----//
    int pontos2;

    TextView pontost2;

    // ------- return bid ----//
    int whoScored = 0;
    int howManyPoints = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----- TEAM 1 ---------- //
        pontost1 = (TextView) findViewById(R.id.pontost1);

        Button btnLanceVt1 = (Button) findViewById(R.id.lv1);
        Button btnDpt1 = (Button) findViewById(R.id.Dpt1);
        Button btnTpt1 = (Button) findViewById(R.id.Tpt1);


        btnLanceVt1.setOnClickListener(onClickBt1ListenerT1);
        btnDpt1.setOnClickListener(onClickDp1ListenerT1);
        btnTpt1.setOnClickListener(onClickTp1ListenerT1);


        //----- TEAM 2 ---------- //
        pontost2 = (TextView) findViewById(R.id.pontost2);

        Button btnLanceVt2 = (Button) findViewById(R.id.lv2);
        Button btnDpt2 = (Button) findViewById(R.id.Dpt2);
        Button btnTpt2 = (Button) findViewById(R.id.Tpt2);


        btnLanceVt2.setOnClickListener(onClickBt1ListenerT2);
        btnDpt2.setOnClickListener(onClickDp1ListenerT2);
        btnTpt2.setOnClickListener(onClickTp1ListenerT2);

        // ------- RETURN BID -----//

        Button btnreturnBid = (Button) findViewById(R.id.returnBid);

        btnreturnBid.setOnClickListener(onClickreturnBidListener);

    }
    //------------ TEAM 1 ---------//
    private View.OnClickListener onClickBt1ListenerT1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        //acao do clique aqui
            pontos1++;
            pontost1.setText(String.valueOf(pontos1));
            whoScored = 1;
            howManyPoints = 1;
        }

    };

    private View.OnClickListener onClickDp1ListenerT1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //acao do clique aqui
            pontos1 += 2;
            pontost1.setText(String.valueOf(pontos1));

            whoScored = 1;
            howManyPoints = 2;
        }

    };

    private View.OnClickListener onClickTp1ListenerT1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //acao do clique aqui
            pontos1 += 3;
            pontost1.setText(String.valueOf(pontos1));

            whoScored = 1;
            howManyPoints = 3;
        }

    };

    //----- TEAM 2 ---------- //
    private View.OnClickListener onClickBt1ListenerT2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //acao do clique aqui
            pontos2++;
            pontost2.setText(String.valueOf(pontos2));

            whoScored = 2;
            howManyPoints = 1;
        }

    };

    private View.OnClickListener onClickDp1ListenerT2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //acao do clique aqui
            pontos2 += 2;
            pontost2.setText(String.valueOf(pontos2));

            whoScored = 2;
            howManyPoints = 2;
        }

    };

    private View.OnClickListener onClickTp1ListenerT2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //acao do clique aqui
            pontos2 += 3;
            pontost2.setText(String.valueOf(pontos2));

            whoScored = 2;
            howManyPoints = 3;
        }

    };

    // ------- return bid -------- //
    // ------- como fazer? --------//
    //--- guardar o ultimo ponto e quem fez--//
    private View.OnClickListener onClickreturnBidListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //acao do clique aqui
            if(whoScored == 1) {
                pontos1 -= howManyPoints;
                pontost1.setText(String.valueOf(pontos1));

            }else if(whoScored == 2) {
                pontos2 -= howManyPoints;
                pontost2.setText(String.valueOf(pontos2));

            }
            whoScored = 0;
            howManyPoints = 0;

        }
    };




}