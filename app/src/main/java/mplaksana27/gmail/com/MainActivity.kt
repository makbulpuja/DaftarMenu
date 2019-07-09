package mplaksana27.gmail.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radio.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)


            })
        val pesanan:TextView=findViewById(R.id.pesanan)
        val pesanan1:TextView=findViewById(R.id.pesanan1)
        button3.setOnClickListener{
            var id: Int = radio.checkedRadioButtonId
            if (id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(id)
                pesanan.setText(radio.text)
                pesanan1.setText("TERIMA KASIH TELAH MELAKUKAN PEMESANAN")
                //Toast.makeText(applicationContext,"pesanan anda : ${radio.text}",
                  //  Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext," anda belum memilih menu",
                    Toast.LENGTH_SHORT).show()
            }

        }
    }
}
