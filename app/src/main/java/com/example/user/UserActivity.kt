package com.example.user

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class UserActivity : AppCompatActivity(),IUserRvAdapter {
    //  private lateinit var radapter: UserAdapter
    lateinit var viewModel: UserViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rcv = findViewById<RecyclerView>(R.id.userRecyclerView)
        rcv.layoutManager = LinearLayoutManager(this)
        val adapter = UserAdapter(this, this)
        rcv.adapter = adapter

        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        ViewModelProvider.AndroidViewModelFactory.getInstance(application).javaClass
        viewModel.allUsers.observe(this, Observer { list ->
            list?.let { adapter.upDataList(it) }

        })

    }

    override fun onListener(user: User) {
        viewModel.deleteUser(user)
    }


    fun submitsData(view: View) {

        val noteText =fName.text.toString()
        val noteText1 =lName.text.toString()
        if(noteText.isNotEmpty()){
            viewModel.insertUser(User(noteText,noteText1))

        }

    }
    open fun hideSoftKeyBoard() {
        val imm =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        if (currentFocus != null) {
            imm.hideSoftInputFromWindow(
                currentFocus?.windowToken,
                InputMethodManager.RESULT_UNCHANGED_SHOWN
            )
        }
    }


}