package com.bersyte.fabintobottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bersyte.fabintobottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavView.background = null

        //aqui desabilitamos o terceiro item do menu nav bottom
        // pra dar mais espaco nos outros item (pra nao ficarem muito colado ao fab)
        binding.bottomNavView.menu.getItem(2).isEnabled = false

    }
}