package com.example.maimobile;

import android.webkit.WebView;
import android.app.Activity;
import android.os.Bundle;

public class New extends Activity{
	
	private WebView webview;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webpage);

        String url = "http://www.uom.gr/modules.php?op=modload&name=News&file=index&tmima=104&catid=1&topic=104&allstories=1&categorymenu=3";

        webview = (WebView) findViewById(R.id.myWebView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl(url);
       }   
    
}
    
