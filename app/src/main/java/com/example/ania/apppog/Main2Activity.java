package com.example.ania.apppog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView city_TV = findViewById (R.id.city_TV );

        Bundle bundle = getIntent().getExtras();

        String city = bundle.getString("city_TV");

        city_TV.setText(city);

    }
}
