package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("NAME", "")

        finishBtn.setOnClickListener {

            val inputEmail = inputEmail.text.toString()

            val intent = Intent(this, ForthActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", inputEmail)
            startActivity(intent)

            finish()

        }

    }

}