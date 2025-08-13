package ind.shop.xmloneapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val number=9793139213
        val callbutton=findViewById<Button>(R.id.call)
            .setOnClickListener {
                val intent= Intent(Intent.ACTION_DIAL)
                intent.data= Uri.parse("tel:$number")
                startActivity(intent)
            }
        val android_dev=findViewById<CardView>(R.id.ad_dev)
        val web_dev=findViewById<CardView>(R.id.web_dev)
        val ios_dev=findViewById<CardView>(R.id.ios_dev)
        val ml=findViewById<CardView>(R.id.ml_dev)
        val block=findViewById<CardView>(R.id.chain_dev)
        val cyber=findViewById<CardView>(R.id.cs)

        android_dev.setOnClickListener {
            intent= Intent(applicationContext, ThirdScreen::class.java)
            startActivity(intent)
        }
        web_dev.setOnClickListener {
            intent= Intent(applicationContext, FourthScreen::class.java)
            startActivity(intent)
        }
        ios_dev.setOnClickListener {
            intent= Intent(applicationContext, FifthScreen::class.java)
            startActivity(intent)
        }
        ml.setOnClickListener {
            intent= Intent(applicationContext, SixthScreen::class.java)
            startActivity(intent)
        }
        block.setOnClickListener {
            intent= Intent(applicationContext, SeventhScreen::class.java)
            startActivity(intent)
        }
        cyber.setOnClickListener {
            intent= Intent(applicationContext, EighthScreen::class.java)
            startActivity(intent)
        }

        val back=findViewById<ImageButton>(R.id.back)
            .setOnClickListener {
                intent= Intent(applicationContext, FirstScreen::class.java)
                startActivity(intent)
            }



    }
}