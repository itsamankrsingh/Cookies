package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.


        ImageView img_cookie = new ImageView(this);
        img_cookie = findViewById(R.id.android_cookie_image_view);
        Drawable img_draw=getResources().getDrawable(R.drawable.after_cookie);
        img_cookie.setImageDrawable(img_draw);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView text_cookie=new TextView(this);
        text_cookie =findViewById(R.id.status_text_view);
        String new_text="I'm so full";
        text_cookie.setText(new_text);


    }

}
