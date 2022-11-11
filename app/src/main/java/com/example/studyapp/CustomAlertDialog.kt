package com.example.studyapp

import android.app.Activity
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

class CustomAlertDialog (activity : Activity, title : String, text : String){
    init {
        val dialogBuilder = AlertDialog.Builder(activity)

        dialogBuilder.setMessage(text)
            .setPositiveButton("okay",DialogInterface.OnClickListener{
                    dialog, _ -> dialog.cancel()
            })

        val alert = dialogBuilder.create()

        alert.setTitle(title)

        alert.show()
    }

}