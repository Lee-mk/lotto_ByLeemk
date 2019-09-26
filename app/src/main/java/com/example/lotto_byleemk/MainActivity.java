package com.example.lotto_byleemk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView num_1, num_2, num_3, num_4, num_5, num_6;
    Button make_btn;


    int lotto[] = new int[6];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num_1 = (TextView)findViewById(R.id.num_1);
        num_2 = (TextView)findViewById(R.id.num_2);
        num_3 = (TextView)findViewById(R.id.num_3);
        num_4 = (TextView)findViewById(R.id.num_4);
        num_5 = (TextView)findViewById(R.id.num_5);
        num_6 = (TextView)findViewById(R.id.num_6);

        make_btn = (Button)findViewById(R.id.make_btn);


        // 이 밑에가 버튼을 눌렀을때 액션을 넣는곳.
        make_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (int i = 0; i <= 5; i++) {
                    lotto[i] = (int) (Math.random() * 45 + 1);


                }


                for (int j = 0; j <= 5; j++) {
                    for (int k = 0; k <= 5; k++) {

                        if (j != k) {
                            if (lotto[j] == lotto[k]) {
                                lotto[j] = (int) (Math.random() * 45 + 1);
                            }
                        }
                    }

                }
                //랜덤함수


                Arrays.sort(lotto);
                // Arrays.sort는 오름차순


                num_1.setText(lotto[0] + "");
                num_2.setText(lotto[1] + "");
                num_3.setText(lotto[2] + "");
                num_4.setText(lotto[3] + "");
                num_5.setText(lotto[4] + "");
                num_6.setText(lotto[5] + "");




            }
        });





    }
}