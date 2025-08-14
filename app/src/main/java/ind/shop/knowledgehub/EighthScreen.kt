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

class EighthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eighth_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val py=findViewById<CardView>(R.id.py)
        val js=findViewById<CardView>(R.id.js)
        val pychrm=findViewById<CardView>(R.id.pycharm)
        val postrage=findViewById<CardView>(R.id.postrage)
        val mongo=findViewById<CardView>(R.id.mongodb)



        py.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.python.org/doc/")
            startActivity(intent)
        }

        js.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.mozilla.org/en-US/docs/Web/JavaScript")
            startActivity(intent)
        }


        pychrm.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.jetbrains.com/help/pycharm/quick-start-guide.html")
            startActivity(intent)
        }

        postrage.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.postgresql.org/docs/")
            startActivity(intent)
        }
        mongo.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.mongodb.com/docs/?msockid=1e65dff9ba0e6acb3675cb00bbfc6b5a")
            startActivity(intent)
        }

        val back=findViewById<ImageButton>(R.id.back)
            .setOnClickListener {
                intent= Intent(applicationContext, SecondScreen::class.java)
                startActivity(intent)
            }



    }
}