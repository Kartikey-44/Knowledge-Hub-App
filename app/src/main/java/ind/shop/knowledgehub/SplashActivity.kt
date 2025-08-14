package ind.shop.knowledgehub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Start the main activity after a short delay or immediately
        startActivity(Intent(this, FirstScreen::class.java))
        finish() // Close splash activity so user can't go back to it,
    }
}
