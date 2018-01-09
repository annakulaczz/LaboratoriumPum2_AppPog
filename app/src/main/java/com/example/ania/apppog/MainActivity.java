package com.example.ania.apppog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText place_ET = findViewById (R.id.place_ET ) ;
        final Button change_place_BTT = findViewById (R.id.change_place_BTT ) ;
        Button places_BTT = findViewById (R.id.places_BTT ) ;
        final TextView city_TV = findViewById (R.id.city_TV ) ;
        change_place_BTT.setOnClickListener
                (new View.OnClickListener() {
            @Override public void onClick(View view) {
                String nowe = place_ET.getText().toString();
                city_TV.setText(nowe);
            }
        } ) ;
        places_BTT.setOnClickListener
                (new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent
                        (MainActivity.this, Main2Activity.class);
                startActivity(intent);
                Bundle bundle = new Bundle ( ) ;
                bundle.putString("zmien","miasto") ;
                intent.putExtras(bundle);
            }
        } ) ;
    }
}
