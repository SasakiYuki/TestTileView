package com.example.yukisasakia.testtileview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qozix.tileview.TileView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        setupTileView();
    }

    private void setupTileView() {
        new TileView.Builder(findViewById(R.id.tileView))
                .setSize(10240,10240)
                .defineZoomLevel("tiles/tile1/400/%2$d-%1$d.png")
                .defineZoomLevel(1, "tiles/tile1/200/%2$d-%1$d.png")
                .defineZoomLevel(2, "tiles/tile1/100/%2$d-%1$d.png")
                .defineZoomLevel(3, "tiles/tile1/50/%2$d_%1$d.png")
                .build();
    }
}
