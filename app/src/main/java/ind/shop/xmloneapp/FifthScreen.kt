package ind.shop.xmloneapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FifthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val dart_flutter=findViewById<CardView>(R.id.dartflutter)
        val swift=findViewById<CardView>(R.id.swift)
        val xcode=findViewById<CardView>(R.id.xcode)
        val firebase=findViewById<CardView>(R.id.firebase)
        val sql=findViewById<CardView>(R.id.sql)

        dart_flutter.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://docs.flutter.dev/")
            startActivity(intent)
        }
        swift.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://share.google/Qj9ZsBXGZ6GJOduiK")
            startActivity(intent)
        }
        xcode.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.apple.com/xcode/")
            startActivity(intent)
        }
        firebase.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://firebase.google.com/docs/")
            startActivity(intent)
        }
        sql.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://dev.mysql.com/doc/")
            startActivity(intent)
        }

        val back=findViewById<ImageButton>(R.id.back)
            .setOnClickListener {
                intent= Intent(applicationContext, SecondScreen::class.java)
                startActivity(intent)
            }
    }
}