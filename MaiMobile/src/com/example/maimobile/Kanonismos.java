package com.example.maimobile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Kanonismos extends Activity{
	
	private WebView webview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage);

        String url = "https://docs.google.com/open?id=0Bzf0S71yVIJkRkRIZ0w2RTFYX2s";

        webview = (WebView) findViewById(R.id.myWebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl(url);
       }   
    
}