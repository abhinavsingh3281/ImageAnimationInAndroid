package com.example.imageanimationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView1;
    private ImageView imageView2;
    private boolean IsClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(IsClicked) {
                    imageView1.animate().alpha(0).setDuration(3000);
                    imageView2.animate().alpha(1).setDuration(3000);

                    IsClicked = false;
                }
                else if(!IsClicked){
                    imageView1.animate().alpha(1).setDuration(3000);
                    imageView2.animate().alpha(0).setDuration(3000);
                    //alpha 0 hides
                    //alpha 1 shows the content
                    IsClicked=true;

                }


             // imageView1.animate().rotationX(400).translationX(200).setDuration(2000);


            }

        });
    }
}
