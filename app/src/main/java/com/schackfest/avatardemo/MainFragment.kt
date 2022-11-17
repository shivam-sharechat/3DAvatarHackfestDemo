package com.schackfest.avatardemo

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.fragment_main) {

    lateinit var sceneView: WebView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sceneView = view.findViewById(R.id.webview)
        loadModel()

    }

    @SuppressLint("SetJavaScriptEnabled")
    fun loadModel(){
        sceneView.setBackgroundColor(Color.TRANSPARENT)
        sceneView.settings.javaScriptEnabled = true
        sceneView.settings.loadWithOverviewMode = true
        sceneView.loadUrl("file:///android_asset/modelViewer.html")
    }
}