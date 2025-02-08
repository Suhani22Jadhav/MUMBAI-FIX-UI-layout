package com.example.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Railways extends AppCompatActivity implements View.OnClickListener {

    CardView c1, c2, c3;
    private final int CAMERA_REQ_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_railways);


        c1 = (CardView) findViewById((R.id.pictureCard));
        c2 = (CardView) findViewById((R.id.chatBoxCard));
        c3 = (CardView) findViewById((R.id.authoritiesCard));


    }


//    c1.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//            startActivityForResult(iCamera, CAMERA_REQ_CODE );
//
//        }
//    }


    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (resultCode == RESULT_OK) {

            if(requestCode == CAMERA_REQ_CODE){

                //for camera
            }
        }


    }

    @Override
    public void onClick(View view) {

    }
}


// Use if-else to handle clicks for specific cards
//        if (view.getId() == R.id.firstCard) {
//            Intent intent = new Intent(Railways.this,Railways.class);
//        } else if (view.getId() == R.id.secondCard) {
//            Intent intent = new Intent(HomeActivity.this,BusStops.class);
//        } else if (view.getId() == R.id.thirdCard) {
//            Intent intent = new Intent(HomeActivity.this,Hotspots.class);
//        }
//c1.setOnClickListener(this);
//        c2.setOnClickListener(this);
//        c3.setOnClickListener(this);


