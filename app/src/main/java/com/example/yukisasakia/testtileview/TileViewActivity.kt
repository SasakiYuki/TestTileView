package com.example.yukisasakia.testtileview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.qozix.tileview.TileView

abstract class TileViewActivity : AppCompatActivity() {
    lateinit var tileView: TileView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tileView = setupTileView()
    }

    abstract fun setupTileView(): TileView

    override fun onDestroy() {
        super.onDestroy()
        tileView.destroy()
    }

    protected fun frameTo(x: Double, y: Double) {
        tileView.post(Runnable {
        })
    }
}