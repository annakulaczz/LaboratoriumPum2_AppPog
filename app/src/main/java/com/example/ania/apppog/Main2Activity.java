package com.example.ania.apppog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.city_TV2)
    TextView city_TV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

         Bundle bundle = getIntent().getExtras();
        String city = bundle.getString("KEY");
        city_TV2.setText(city);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Miasteczko Śląskie", "Będzie padać."));
        places.add(new Place("Świerklaniec","Słońce!"));
        places.add(new Place("Zawiercie","Duże zachmurzenie."));
        places.add(new Place("Tarnowskie Góry","Silny wiatr."));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

    }
}
