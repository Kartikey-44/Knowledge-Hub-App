package ind.shop.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val kotlinview=findViewById<CardView>(R.id.kt)
        val javaview=findViewById<CardView>(R.id.java)
        val androidstudioview=findViewById<CardView>(R.id.androidstudio)
        val firebase=findViewById<CardView>(R.id.firebase)
        val sqlview=findViewById<CardView>(R.id.sql)

//kotlin documentaion will open

        kotlinview.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://kotlinlang.org/docs/home.html")
            startActivity(intent)
        }

        //java documentation will open

        javaview.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://docs.oracle.com/en/java/")
            startActivity(intent)
        }


        androidstudioview.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/develop")
            startActivity(intent)
        }

        firebase.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://firebase.google.com/docs/")
            startActivity(intent)

        }

        sqlview.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://dev.mysql.com/doc/")
            startActivity(intent)}

        val back=findViewById<ImageButton>(R.id.back)
            .setOnClickListener {
                intent= Intent(applicationContext, SecondScreen::class.java)
                startActivity(intent)
            }

    }
}