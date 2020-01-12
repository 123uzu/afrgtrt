package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_forth.*

class ForthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)

           genderbtn.setOnClickListener(){
               val gender = inputgender.text.toString()
               val name = intent.extras?.getString("NAME","")
               val email = intent.extras?.getString("EMAIL","")

               val intent = Intent(this,ThirdActivity::class.java)
               intent.putExtra("NAME", name)

               intent.putExtra("EMAIL", email)

               intent.putExtra("GENDER", gender)

               startActivity(intent)
               finish()


           }

    }
}
