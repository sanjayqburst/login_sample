package com.example.fisrtsample


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var msg :String="Function :"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(msg,"onCreate Called")


        val userLoginButton: Button =findViewById(R.id.login_button)
        userLoginButton.setOnClickListener{
            val username:EditText=findViewById(R.id.username)
            val passWord:EditText=findViewById(R.id.password)
            val userDetail=LoginDetails(context = applicationContext,userName = username.text.toString(),passWord = passWord.text.toString())
            Log.d(msg,userDetail.checkEmpty().toString())
            if (!userDetail.checkEmpty()){
                Log.d(msg,userDetail.validateData().toString())
                if (userDetail.validateData()){
                    val intent=Intent(this,HomeScreen::class.java)
                    intent.putExtra("username",userDetail.userName)
                    startActivity(intent)
                    passWord.setText("")
                    username.setText("")
                }else{
                    Toast.makeText(applicationContext,"Please check your credentials",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

//onStart callback method
    override fun onStart() {
        super.onStart()
        Log.d(msg,"onStart called")
    }

//    onResume callback method
    override fun onResume() {
        super.onResume()
        Log.d(msg,"onResume called")
    }

//    onRestart callback method
    override fun onRestart() {
        super.onRestart()
        Log.d(msg,"onRestart called")
    }

//    onPause callback method
    override fun onPause() {
        super.onPause()
        Log.d(msg,"onPause called")
    }

//  onStop callback method
    override fun onStop() {
        super.onStop()
        Log.d(msg,"onStop Called")
    }

//    onDestroy callback method
    override fun onDestroy() {
        super.onDestroy()
        Log.d(msg,"onDestroy called")
    }
}

