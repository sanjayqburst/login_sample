package com.example.fisrtsample

import android.content.Context
import android.widget.Toast

class LoginDetails(var context: Context, var userName:String, var passWord:String){
    fun checkEmpty():Boolean{
        if (userName.isEmpty()){
            Toast.makeText(context,"Username is Empty", Toast.LENGTH_SHORT).show()
            return true
        }else if (passWord.isEmpty()){
            Toast.makeText(context,"Password is Empty", Toast.LENGTH_SHORT).show()
            return true
        }else {
            return false
        }
    }
    fun validateData():Boolean{
        var validity:Boolean=false
        validity = userName.toString()=="Sanjaymohan" && passWord.toString()=="password"
        return validity
    }

}