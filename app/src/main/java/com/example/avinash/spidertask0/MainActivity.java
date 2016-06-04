package com.example.avinash.spidertask0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public TextView tv;
    public int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView);
        tv.setText("" + 0);
    }
    public void press(View v){
        num++;
        tv.setText(""+num);
    }

}
