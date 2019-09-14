package com.coldegarage.rswitch

import android.os.Bundle

class LightActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_light)

        initializeToolbar()
    }
}