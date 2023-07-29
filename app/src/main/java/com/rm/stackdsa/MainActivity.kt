package com.rm.stackdsa

import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var st1: TextView
    lateinit var st2: TextView
    lateinit var st3: TextView
    lateinit var st4: TextView
    lateinit var st5: TextView

    lateinit var ar1: ImageView
    lateinit var ar2: ImageView
    lateinit var ar3: ImageView
    lateinit var ar4: ImageView

    lateinit var img1:ImageView
    lateinit var img2:ImageView
    lateinit var img3:ImageView
    lateinit var img4:ImageView
    lateinit var img5:ImageView

    lateinit var img11:ImageView
    lateinit var img22:ImageView
    lateinit var img33:ImageView
    lateinit var img44:ImageView

    lateinit var t1:TextView
    lateinit var t2:TextView
    lateinit var t3:TextView
    lateinit var t4:TextView
    lateinit var t5:TextView

    lateinit var h:TextView

    lateinit var imgInfo:ImageView




    lateinit var etPush: EditText
    lateinit var btnPush: Button
    lateinit var btnPop: Button
    lateinit var btnClear:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        st1 = findViewById(R.id.st1)
        st2 = findViewById(R.id.st2)
        st3 = findViewById(R.id.st3)
        st4 = findViewById(R.id.st4)
        st5 = findViewById(R.id.st5)

        ar1 = findViewById(R.id.ar1)
        ar2 = findViewById(R.id.ar2)
        ar3 = findViewById(R.id.ar3)
        ar4 = findViewById(R.id.ar4)

        img1=findViewById(R.id.img1)
        img2=findViewById(R.id.img2)
        img3=findViewById(R.id.img3)
        img4=findViewById(R.id.img4)
        img5=findViewById(R.id.img5)

        img11=findViewById(R.id.img11)
        img22=findViewById(R.id.img22)
        img33=findViewById(R.id.img33)
        img44=findViewById(R.id.img44)

        t1=findViewById(R.id.t1)
        t2=findViewById(R.id.t2)
        t3=findViewById(R.id.t3)
        t4=findViewById(R.id.t4)
        t5=findViewById(R.id.t5)
        h=findViewById(R.id.head)


        imgInfo=findViewById(R.id.imgInfo)

        etPush = findViewById(R.id.etPush)
        btnPush = findViewById(R.id.btnPush)
        btnPop = findViewById(R.id.btnPop)
        btnClear=findViewById(R.id.btnClear)


        supportActionBar?.title = "Visualize Stack Using Linked lists"




        imgInfo.setOnClickListener {
            val alterDialog = AlertDialog.Builder(this)
            alterDialog.setTitle("Developers Info")
            alterDialog.setMessage("App made by Rushi Mayur ")
            alterDialog.setPositiveButton("OK") { _, _ ->


            }

            alterDialog.create()
            alterDialog.show()
        }





        btnPush.setOnClickListener {
            val push = etPush.text.toString()

            if(st5.text!=""){
                Toast.makeText(this, "Stack Overflow", Toast.LENGTH_SHORT).show()
                val inputMethodManager: InputMethodManager = getSystemService(
                    INPUT_METHOD_SERVICE
                ) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(
                    getCurrentFocus()?.getWindowToken() , 0)

            }
            if (push == "") {
                Toast.makeText(this, "Enter the value to be pushed", Toast.LENGTH_SHORT).show()
            } else {
                if (st1.text.trim { it <= ' ' }.toString().isEmpty()) {
                    st1.text = push
                    etPush.text.clear()

                    h.visibility= VISIBLE
                    img11.visibility= VISIBLE
                    t1.visibility= VISIBLE
                } else {
                    if (st2.text.trim { it <= ' ' }.toString().isEmpty()) {
                        st2.text = push
                        etPush.text.clear()
                        ar1.visibility = VISIBLE
                        img22.visibility= VISIBLE
                        img11.visibility= INVISIBLE
                        img1.visibility= VISIBLE
                        t1.visibility= INVISIBLE
                        t2.visibility= VISIBLE
                        h.visibility= VISIBLE
                    } else {
                        if (st3.text.trim { it <= ' ' }.toString().isEmpty()) {
                            st3.text = push
                            etPush.text.clear()
                            ar2.visibility = VISIBLE
                            img33.visibility= VISIBLE
                            img22.visibility= INVISIBLE
                            img2.visibility= VISIBLE
                            t2.visibility= INVISIBLE
                            t3.visibility= VISIBLE
                            h.visibility= VISIBLE
                        } else {
                            if (st4.text.trim { it <= ' ' }.toString().isEmpty()) {
                                st4.text = push
                                etPush.text.clear()
                                ar3.visibility = VISIBLE
                                img44.visibility= VISIBLE
                                img33.visibility= INVISIBLE
                                img3.visibility= VISIBLE
                                t3.visibility= INVISIBLE
                                t4.visibility= VISIBLE
                                h.visibility= VISIBLE

                            } else {
                                if (st5.text.trim { it <= ' ' }.toString().isEmpty()) {
                                    st5.text = push




                                    val inputMethodManager: InputMethodManager = getSystemService(
                                        INPUT_METHOD_SERVICE
                                    ) as InputMethodManager
                                    inputMethodManager.hideSoftInputFromWindow(
                                        getCurrentFocus()?.getWindowToken() , 0)



                                    etPush.text.clear()
                                    ar4.visibility = VISIBLE
                                    img5.visibility= VISIBLE
                                    img44.visibility= INVISIBLE
                                    img4.visibility= VISIBLE
                                    t5.visibility= VISIBLE
                                    t4.visibility= INVISIBLE
                                    h.visibility= VISIBLE
                                }
                            }

                        }

                    }
                }
            }

        }

        btnPop.setOnClickListener {
            val inputMethodManager: InputMethodManager = getSystemService(
                INPUT_METHOD_SERVICE
            ) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(
                getCurrentFocus()?.getWindowToken() , 0)


            if(st1.text==""){
                Toast.makeText(this, "Stack Empty", Toast.LENGTH_SHORT).show()
            }else {
                if (st5.text != "") {
                    st5.text = ""
                    ar4.visibility = INVISIBLE
                    img5.visibility= INVISIBLE
                    img44.visibility= VISIBLE
                    img4.visibility= INVISIBLE
                    t5.visibility= INVISIBLE
                    t4.visibility= VISIBLE
                } else {
                    if (st4.text != "") {
                        st4.text = ""
                        ar3.visibility = INVISIBLE
                        img44.visibility= INVISIBLE
                        img33.visibility= VISIBLE
                        img3.visibility= INVISIBLE
                        t4.visibility= INVISIBLE
                        t3.visibility= VISIBLE
                    } else {
                        if (st3.text != "") {
                            st3.text = ""
                            ar2.visibility = INVISIBLE
                            img33.visibility= INVISIBLE
                            img22.visibility= VISIBLE
                            img2.visibility= INVISIBLE
                            t3.visibility= INVISIBLE
                            t2.visibility= VISIBLE
                        } else {
                            if (st2.text != "") {
                                st2.text = ""
                                ar1.visibility = INVISIBLE
                                img22.visibility= INVISIBLE
                                img11.visibility= VISIBLE
                                img1.visibility= INVISIBLE
                                t2.visibility= INVISIBLE
                                t1.visibility= VISIBLE
                            } else {
                                if (st1.text != "") {
                                    st1.text = ""
                                    img11.visibility= INVISIBLE
                                    t1.visibility= INVISIBLE
                                    h.visibility= INVISIBLE
                                }

                            }

                        }


                    }
                }
            }
        }

        btnClear.setOnClickListener {


                Toast.makeText(this, "Cleared!", Toast.LENGTH_SHORT).show()
                etPush.text.clear()
                img1.visibility = INVISIBLE
                img11.visibility = INVISIBLE
                img2.visibility = INVISIBLE
                img22.visibility = INVISIBLE
                img3.visibility = INVISIBLE
                img33.visibility = INVISIBLE
                img4.visibility = INVISIBLE
                img44.visibility = INVISIBLE
                img5.visibility = INVISIBLE
                ar1.visibility = INVISIBLE
                ar2.visibility = INVISIBLE
                ar3.visibility = INVISIBLE
                ar4.visibility = INVISIBLE
                st1.text = ""
                st2.text = ""
                st3.text = ""
                st4.text = ""
                st5.text = ""
                t1.visibility= INVISIBLE
                t2.visibility= INVISIBLE
                t3.visibility= INVISIBLE
                t4.visibility= INVISIBLE
                t5.visibility= INVISIBLE
                h.visibility= INVISIBLE


        }
    }
    }