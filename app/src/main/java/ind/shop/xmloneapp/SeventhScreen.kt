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

class SeventhScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seventh_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val py=findViewById<CardView>(R.id.py)
        val java=findViewById<CardView>(R.id.java)
        val remix=findViewById<CardView>(R.id.remix)
        val bigchain=findViewById<CardView>(R.id.bigchain)
        val mongo=findViewById<CardView>(R.id.mongodb)




        py.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.python.org/doc/")
            startActivity(intent)
        }

        java.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://docs.oracle.com/en/java/")
            startActivity(intent)
        }

        remix.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://dev.guangweiblog.com/remix/")
            startActivity(intent)
        }

        bigchain.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://docs.bigchaindb.com/en/latest/")
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