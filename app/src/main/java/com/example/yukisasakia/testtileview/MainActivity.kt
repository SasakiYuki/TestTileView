package com.example.yukisasakia.testtileview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.qozix.tileview.TileView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private fun setupTileView(): TileView {
        return TileView.Builder(tileView)
                .setSize(3000, 3000)
                .defineZoomLevel("tiles/tile1/400/%1d-%2d.png")
                .defineZoomLevel(1, "tiles/tile1/200/%col%-%row%.png")
                .defineZoomLevel(2, "tiles/tile1/100/%col%-%row%.png")
                .defineZoomLevel(3, "tiles/tile1/50/%col%_%row%.png")
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupTileView()
    }
}
