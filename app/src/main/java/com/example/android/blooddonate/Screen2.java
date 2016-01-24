package com.example.android.blooddonate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

/**
 * Created by aditya on 13/1/16.
 */
public class Screen2 extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        disp(findViewById(R.id.screen2_text1), screen2_text1());
    }

    private String screen2_text1()
    {
        String screen2Text1 = getString(R.string.screen2_txt1);
        return screen2Text1;

    }

    public void disp(View view, String string){

        TextView text_view = (TextView) view;
        text_view.setText(Html.fromHtml(string));

    }
}
