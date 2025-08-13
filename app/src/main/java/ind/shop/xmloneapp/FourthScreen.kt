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

class FourthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val js=findViewById<CardView>(R.id.js)
        val html=findViewById<CardView>(R.id.htmlcss)
        val vs=findViewById<CardView>(R.id.vscode)
        val firebase=findViewById<CardView>(R.id.firebase)
        val sql=findViewById<CardView>(R.id.sql)


        js.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.mozilla.org/en-US/docs/Web/JavaScript")
            startActivity(intent)
        }
        html.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://htmlandcssguidebook.com/")
            startActivity(intent)
        }
        vs.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse("https://code.visualstudio.com/Docs")
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
            startActivity(intent)}

        val back=findViewById<ImageButton>(R.id.back)
            .setOnClickListener {
                intent= Intent(applicationContext, SecondScreen::class.java)
                startActivity(intent)
            }
    }
}