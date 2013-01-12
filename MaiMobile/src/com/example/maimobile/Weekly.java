package com.example.maimobile;

import android.webkit.WebView;
import android.app.Activity;
import android.os.Bundle;

public class Weekly extends Activity{
	
	private WebView webview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage);

        String url = "http://docs.google.com/viewer?url=http%3A%2F%2Fwww.uom.gr%2Forologia%2Fmai%2FMEP-orologio-xeimerino-2012-2013.pdf";

        webview = (WebView) findViewById(R.id.myWebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl(url);
       }   
    
}