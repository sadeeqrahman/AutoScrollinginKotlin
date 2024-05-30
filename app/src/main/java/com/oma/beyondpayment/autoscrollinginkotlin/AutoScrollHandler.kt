package com.oma.beyondpayment.autoscrollinginkotlin

import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.RecyclerView

class AutoScrollHandler(private val recyclerView: RecyclerView) {
    private val handler: Handler = Handler(Looper.getMainLooper())
    private var isScrolling = false

    private val scrollRunnable = object : Runnable {
        override fun run() {
            if (isScrolling) {
                val layoutManager = recyclerView.layoutManager
                layoutManager?.let {
                    val itemCount = it.itemCount
                    val lastVisibleItemPosition = (it as? androidx.recyclerview.widget.LinearLayoutManager)?.findLastVisibleItemPosition() ?: 0
                    if (lastVisibleItemPosition < itemCount - 1) {
                        recyclerView.smoothScrollBy(0, 30) // Adjust scroll speed by changing the value
                        handler.postDelayed(this, 100) // Adjust delay between scrolls
                    }
                }
            }
        }
    }

    fun startAutoScroll() {
        if (!isScrolling) {
            isScrolling = true
            handler.post(scrollRunnable)
        }
    }

    fun stopAutoScroll() {
        if (isScrolling) {
            isScrolling = false
            handler.removeCallbacks(scrollRunnable)
        }
    }
}
