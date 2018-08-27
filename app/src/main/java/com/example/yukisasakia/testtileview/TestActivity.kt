package com.example.yukisasakia.testtileview

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.qozix.tileview.TileView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        setupTileView()
    }

    private fun setupTileView() {
        TileView.Builder(findViewById<TileView>(R.id.tileView))
                .setSize(5120,5120)
                .setMemoryCacheSize(0)
                .defineZoomLevel("tiles/tile1/400/%2\$d-%1\$d.png")
                .defineZoomLevel(1, "tiles/tile1/200/%2\$d-%1\$d.png")
                .defineZoomLevel(2, "tiles/tile1/100/%2\$d-%1\$d.png")
                .defineZoomLevel(3,"tiles/tile1/50/%2\$d_%1\$d.png")
                .build()
    }
}
