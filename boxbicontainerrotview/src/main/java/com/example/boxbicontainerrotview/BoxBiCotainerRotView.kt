package com.example.boxbicontainerrotview

import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.RectF
import android.graphics.Color
import android.graphics.Paint
import android.content.Context
import android.app.Activity

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#01579B",
    "#00C853",
    "#FFC107",
    "#2962FF"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 5
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 5.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val rot : Float = 90f
val barHFactor : Float = 15.9f
val deg : Float = 180f

