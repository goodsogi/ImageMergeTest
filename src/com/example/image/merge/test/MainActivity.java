package com.example.image.merge.test;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
     // Get your images from their files
        Bitmap bmp1 = BitmapFactory.decodeResource(getResources(),
                R.drawable.play_img_s);
        Bitmap bmp2 = BitmapFactory.decodeResource(getResources(),
                R.drawable.p152);

        // As described by Steve Pomeroy in a previous comment, 
        // use the canvas to combine them.
        // Start with the first in the constructor..
        
        Canvas comboImage = new Canvas(bmp1);
        // Then draw the second on top of that
        comboImage.drawBitmap(bmp2, 0f, 0f, null);
        
        //imageview에는 bmp1을 리소스로 설정하면 merge된 이미지가 들어감 
        ImageView imageview = (ImageView) findViewById(R.id.imageview);
        imageview.setImageBitmap(bmp1);
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
