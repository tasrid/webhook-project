package com.example.finallwebview

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {
    private lateinit var webView :WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        webView = findViewById(R.id.webView)


        val topsbdcom: TextView = findViewById(R.id.tosbdcom)
        val bdshop: TextView = findViewById(R.id.bdshop)
        val topsbdco: TextView = findViewById(R.id.tosbdco)
        val smartlife: TextView = findViewById(R.id.smartlife)

        // Enable JavaScript if needed
        webView.settings.javaScriptEnabled = true

        // Load the website
        webView.loadUrl("https://www.topsbd.co")

        // Ensure links open within the WebView instead of a browser
        // Ensure links open within the WebView instead of a browser
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                view?.loadUrl(request?.url.toString())
                return true
            }


        }


        topsbdco.setTextColor(resources.getColor(R.color.black, null))
        topsbdco.setTypeface(null, Typeface.BOLD)
        topsbdcom.setOnClickListener {


            // Start the MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        bdshop.setOnClickListener {

            // Start the MainActivity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

        topsbdco.setOnClickListener {

            // Start the MainActivity
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        smartlife.setOnClickListener {

            // Start the MainActivity
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)

        }
    }
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}