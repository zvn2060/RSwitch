package com.coldegarage.rswitch

import android.os.Bundle

class FanActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fan)
        initializeToolbar()
    }
}