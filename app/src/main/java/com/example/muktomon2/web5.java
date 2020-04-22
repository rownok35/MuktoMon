package com.example.muktomon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web5 extends AppCompatActivity {
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web5);
        webView1=findViewById(R.id.webview5);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl(" https://covid19statebd.weebly.com/?fbclid=IwAR1KlYQBa55KFYTM43AuNFJ6qGeQN7cd6HpqjjizmiRvGlOsk29Xl4Wse_0");
        WebSettings webSettings=webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView1.canGoBack()) {
            webView1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

