package com.koreait.a1101test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.filament.View;



public class MainActivity extends AppCompatActivity {


    private EditText Edit1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edit1 = findViewById(R.id.Edit1);

        }


    //clear버틍
    public void clkClear(android.view.View view) {
        Edit1.setText("");
    }
    //clear버튼 제외
    public void clkBtn(android.view.View view) {
        String str = Edit1.getText().toString();

        TextView tv = (TextView) view;
        String val = tv.getText().toString();

        str += val;
        Edit1.setText(str);
    }
}
