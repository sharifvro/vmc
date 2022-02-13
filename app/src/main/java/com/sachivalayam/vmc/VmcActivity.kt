package com.sachivalayam.vmc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class VmcActivity : AppCompatActivity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vmc)

        window.setFlags(
           WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        webView = findViewById(R.id.webview)
        webView!!.webViewClient = WebViewClient()
        webView!!.loadUrl("https://sachivalayam.com/vmc/")
        var webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true
    }
    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView!!.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
