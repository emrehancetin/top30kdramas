package com.emrehancetin.top30kdramas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.emrehancetin.top30kdramas.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val choosenDrama = MySingleton.choosenDrama

        choosenDrama?.let{
            binding.imageView.setImageResource(choosenDrama.image)
            //binding.rank.text = choosenDrama.rank.toString()
            binding.name.text = "#" + choosenDrama.rank.toString()+ " "  +choosenDrama.name
            binding.summary.text=choosenDrama.summary
            binding.imdb.text ="⭐ " + choosenDrama.imdb.toString()
            binding.year.text="Year: " + choosenDrama.year.toString()
            binding.episode.text = "Episode: "  + choosenDrama.episode.toString()

        }
    }
}