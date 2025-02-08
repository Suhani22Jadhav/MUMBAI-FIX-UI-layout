package com.example.appproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
//import androidx.drawerlayout.widget.DrawerLayout;

//import com.google.android.material.navigation.NavigationView;

//public class HomeActivity {
//    import android.os.Bundle;
//import androidx.appcompat.app.AppCompatActivity;

    public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

        CardView card1, card2, card3, card4;

//        DrawerLayout drawerLayout;
//        NavigationView navigationView;
//        Toolbar toolbar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);

            // Make sure layout file exists

            card1 = (CardView) findViewById((R.id.firstCard));
            card2 = (CardView) findViewById((R.id.secondCard));
            card3 = (CardView) findViewById((R.id.thirdCard));
            card4 = (CardView) findViewById((R.id.fourthCard));


            card1.setOnClickListener(this);
            card2.setOnClickListener(this);
            card3.setOnClickListener(this);
            card4.setOnClickListener(this);

        }

        @Override

        public void onClick(View view) {
                // Use if-else to handle clicks for specific cards
                if (view.getId() == R.id.firstCard) {
                    Intent intent = new Intent(HomeActivity.this,Railways.class);
                } else if (view.getId() == R.id.secondCard) {
                    Intent intent = new Intent(HomeActivity.this,BusStops.class);
                } else if (view.getId() == R.id.thirdCard) {
                    Intent intent = new Intent(HomeActivity.this,Hotspots.class);
                } else if (view.getId() == R.id.fourthCard) {
                    Intent intent = new Intent(HomeActivity.this,Slums.class);
                }
            }
        }




//            FirstCard = findViewById(R.id.firstCard);
//            FirstCard.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
//                    startActivity(intent);
//                }
//            });

