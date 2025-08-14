package ind.shop.knowledgehub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Start the main activity after a short delay or immediately
        startActivity(Intent(this, FirstScreen::class.java))
        finish() // Close splash activity so user can't go back to it
    }
}
