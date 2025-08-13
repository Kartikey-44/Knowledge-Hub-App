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

class SixthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixth_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val py=findViewById<CardView>(R.id.py)
        val java=findViewById<CardView>(R.id.java)
        val vs=findViewById<CardView>(R.id.vscode)
        val firebase=findViewById<CardView>(R.id.firebase)
        val sql=findViewById<CardView>(R.id.sql)



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
            startActivity(intent)
        }

        val back=findViewById<ImageButton>(R.id.back)
            .setOnClickListener {
                intent= Intent(applicationContext, SecondScreen::class.java)
                startActivity(intent)
            }
    }
}