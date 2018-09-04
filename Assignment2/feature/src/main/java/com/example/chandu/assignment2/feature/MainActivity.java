package com.example.chandu.assignment2.feature;

import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    EditText e1,e2;
    TextView t1;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = (TextView) findViewById(R.id.msg);
        e1 = (EditText) findViewById(R.id.username);
        e2 = (EditText) findViewById(R.id.password);


        final String txt1 = "<font color=#ff0000>Login unsuccesfull!! Invalid Credentials</font>";
        final String txt2 = "<font color = #008000>Login Successfull. Proceed..</font>";

        btn = (Button) findViewById(R.id.login);





        btn.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {

                    btn.setEnabled(true);
                    if (e1.getText().toString().equals("chandrakiran") && e2.getText().toString().equals("kamal")) {

                        t1.setText(Html.fromHtml(txt2));
                    } else {
                        t1.setText(Html.fromHtml(txt1));

                    }

                }
            });



    }




}
