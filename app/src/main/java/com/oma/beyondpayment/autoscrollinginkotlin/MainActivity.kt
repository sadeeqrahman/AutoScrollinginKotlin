package com.oma.beyondpayment.autoscrollinginkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oma.beyondpayment.autoscrollinginkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _binding:ActivityMainBinding
    private lateinit var usersListAdapter: UsersListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = DataBindingUtil.setContentView(this ,R.layout.activity_main)


        list()

    }

    fun list() {
        _binding.recylerview!!.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )
        usersListAdapter = UsersListAdapter(
            mutableListOf("Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman",
                "Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman","Sadeeq Rahman")
        )
        _binding.recylerview!!.adapter = usersListAdapter

        val autoScrollHandler = AutoScrollHandler(_binding.recylerview)

        autoScrollHandler.startAutoScroll()
    }
}