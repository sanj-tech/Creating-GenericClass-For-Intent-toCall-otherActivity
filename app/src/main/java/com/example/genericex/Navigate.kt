package com.example.genericex

import android.content.Context
import android.content.Intent

object Navigate{
  fun navigateToNextPage(context: Context,targetClassName:Class<*>){
      val intent=Intent(context,targetClassName)
      context.startActivity(intent)
  }
}