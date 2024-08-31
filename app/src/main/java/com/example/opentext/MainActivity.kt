package com.example.opentext

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.databinding.DataBindingUtil
import com.example.opentext.R.layout
import com.example.opentext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        with(binding) {
            cardweb.setOnClickListener {
                intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://chromewebstore.google.com/?hl=en")
                startActivity(intent)
            }
            cardcam.setOnClickListener {
                intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE)
                startActivity(intent)
            }
            cardgmail.setOnClickListener {

                intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.youtube.com/watch?v=mt-5ZbKqiDc&list=RDmt-5ZbKqiDc&start_radio=1&rv=OTqQ5E9oA")
                startActivity(intent)
            }
            cardcall.setOnClickListener {
                intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel: 9572110073")
                startActivity(intent)
            }

        }


    }
}