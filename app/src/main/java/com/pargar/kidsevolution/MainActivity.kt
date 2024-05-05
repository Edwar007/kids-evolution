package com.pargar.kidsevolution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //aqui un comentario de prueba
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}