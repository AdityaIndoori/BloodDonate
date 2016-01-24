package com.example.android.blooddonate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp(findViewById(R.id.intro_text), intro());
        disp(findViewById(R.id.us_text),us());

    }

    public void donate(View view)
    {
        Intent intent = new Intent(this ,Screen2.class );
        startActivity(intent);
    }

    private String intro()
    {
        String intro_text = "<b>Thank You guys</b><br>For joining this Noble Cause:<br>";

        intro_text += "<b><i>Scarlet Life</b></i><br>";
        intro_text += "Its because of people like you,<br>Millions of lives are being Saved By:<br> <b><i>Blood Donation Awareness</b></i>";
        return intro_text;
    }

    private String us()
    {
        String us_text = "<h1>Who Are We</h1>";
        us_text += "We are the<br><b>Scarlet Life Org.</b><br>";
        us_text += "A group, that helps spread awareness of how blood donation can save lives of Recipient<br>";
        us_text += "and create a sense of happiness and contentment for a Donor.<br>We strongly support people to go and donate blood<br>";
        return us_text;
    }

    public void disp(View view, String string){

        TextView text_view = (TextView) view;
        text_view.setText(Html.fromHtml(string));

    }

}
