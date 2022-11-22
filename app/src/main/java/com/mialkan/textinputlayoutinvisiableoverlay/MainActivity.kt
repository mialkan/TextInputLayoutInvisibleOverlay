package com.mialkan.textinputlayoutinvisiableoverlay

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.core.FlipperClient
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.soloader.SoLoader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SoLoader.init(application, false)
        val client: FlipperClient = AndroidFlipperClient.getInstance(application)
        client.addPlugin(InspectorFlipperPlugin(application, DescriptorMapping.withDefaults()))
        client.start()
    }
}
