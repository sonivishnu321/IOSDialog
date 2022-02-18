package com.vks.iosdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.vks.iosdialogsdk.iOSDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.oneBtnDialog).setOnClickListener {
            openOneButtonDialog()
        }
        findViewById<Button>(R.id.twoBtnDialog).setOnClickListener {
            openTwoButtonDialog()
        }
    }

    private fun openOneButtonDialog() = iOSDialogBuilder(this@MainActivity)
        .setTitle(getString(R.string.example_title))
        .setSubtitle(getString(R.string.example_subtitle))
        .setBoldPositiveLabel(true)
        .setNegativeButtonExist(false)
        .setCancelable(false)
        .setPositiveListener(
            getString(R.string.ok)
        ) { dialog ->
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        .build().show()


    private fun openTwoButtonDialog() = iOSDialogBuilder(this@MainActivity)
        .setTitle(getString(R.string.example_title))
        .setSubtitle(getString(R.string.example_subtitle))
        .setBoldPositiveLabel(true)
        .setCancelable(false)
        .setPositiveListener(
            getString(R.string.ok)
        ) { dialog ->
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        .setNegativeListener(
            getString(R.string.dismiss)
        ) { dialog -> dialog.dismiss() }
        .build().show()
}