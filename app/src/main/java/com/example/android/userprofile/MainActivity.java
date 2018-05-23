package com.example.android.userprofile;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView MyPic = (ImageView) findViewById(R.id.profile_picture);
        MyPic.setImageResource(R.drawable.jason_pic);

        TextView TextViewName = (TextView) findViewById(R.id.name);
        TextViewName.setText("Jason Jointer");
        TextViewName.setText(R.string.my_name);

        // this line assigns string

        TextView TextBirthday = (TextView) findViewById(R.id.birthday);
        TextBirthday.setText("Bday July 8th");
        TextBirthday.setText(R.string.my_birthday);


        TextView TextCountry = (TextView) findViewById(R.id.country);
        TextCountry.setText("America");
        TextCountry.setText(R.string.my_country);

        TextView TextHobby = (TextView) findViewById(R.id.hobby);
        TextHobby.setText("I love to Play Videogames");
        TextHobby.setText(R.string.my_hobby);

        TextView TextFav = (TextView) findViewById(R.id.favorite);
        TextFav.setText("I like Anime, Marvel and DC comics");
        TextFav.setText(R.string.my_favorite);

        TextView TextButton1 = (TextView) findViewById(R.id.main_Button);
        TextButton1.setText("Github Link");
        TextButton1.setText(R.string.my_link1);

        TextView TextButton2 = (TextView) findViewById(R.id.linkedin_Button);
        TextButton2.setText("Linkedin Link");
        TextButton2.setText(R.string.my_link2);

        TextView TextContactBar = (TextView) findViewById(R.id.contact_me);
        TextContactBar.setText("Contact me!");
        TextContactBar.setText(R.string.contact_bar);

        TextView TextEmail = (TextView) findViewById(R.id.email_button);
        TextEmail.setText("E-mail me");
        TextEmail.setText(R.string.email_me);


    }

    public void gitHubLink(View view) {
        findViewById(R.id.main_Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/Ramesusxd";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

    public void linkedInLink(View view) {
        findViewById(R.id.linkedin_Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/in/jasonjointer/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }

    public void emailLink(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "J.Jointer@me.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hey I had a question?");
        intent.putExtra(Intent.EXTRA_TEXT, "hey talk to me about anything!");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));

    }


}
