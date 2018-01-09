package com.example.ania.apppog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.change_place_ET)
    EditText change_place_ET;

    @BindView(R.id.change_place_BTT)
    Button change_place_BTT;

    @BindView(R.id.city_TV)
    TextView city_TV;

    @BindView(R.id.places_BTT)
    Button places_BTT;

    @BindView(R.id.sun_image)
    ImageView sun_image;

    @OnClick(R.id.change_place_BTT)
    void onClick_change_places_BTT(View view)
    {
        String new_place = change_place_ET.getText().toString();
        city_TV.setText(new_place);
    }

    @OnClick(R.id.places_BTT)
    void onClick_places_BTT(View view)
    {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Bundle bundle = new Bundle();
        String city = change_place_ET.getText().toString();
        bundle.putString("KEY",city);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }
}
