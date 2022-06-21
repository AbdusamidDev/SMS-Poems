package developer.abdusamid.sherlar

import Models.loadData
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    var like: Boolean = true
    var likeSanoq: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        smsDialog(this)
        loadData()
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_navigation_host).navigateUp()
    }

    companion object dialogShow {
        lateinit var dialog: AlertDialog
        fun smsDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)
            dialog = alertDialog.create()

            val dialogView =
                LayoutInflater.from(context).inflate(R.layout.item_dialog_sms_logo, null, false)
            dialog.setView(dialogView)

            dialog.show()
            SmsDialog().start()
        }

        fun dialogCancel() {
            dialog.cancel()
        }
    }
}

class SmsDialog() : Thread() {
    override fun run() {
        super.run()
        sleep(2000)
        MainActivity.dialogCancel()
    }
}