package com.example.first

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bookBtn: Button = findViewById(R.id.book_button)
        val exploreBtn: Button = findViewById(R.id.explore_button)

        exploreBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Rohit-Singh-07?tab=repositories")
            startActivity(intent)
        }


        bookBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/rohitsingh77/")
            startActivity(intent)
        }

        // Email
        val emailButton: ImageButton = findViewById(R.id.email_button)
        emailButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:rs144506@gmail.com")
            }
            startActivity(emailIntent)
        }

        // GitHub
        val githubButton: ImageButton = findViewById(R.id.github_button)
        githubButton.setOnClickListener {
            val githubIntent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://github.com/Rohit-Singh-07")
            }
            startActivity(githubIntent)
        }

        // Twitter / X
        val xButton: ImageButton = findViewById(R.id.x_button)
        xButton.setOnClickListener {
            val twitterIntent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://x.com/xRohit_Singh")
            }
            startActivity(twitterIntent)
        }
    }
}
