package com.devyankshaw.bajaapptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carouselList =  ArrayList<CarouselItem>()
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))
        carouselList.add(CarouselItem(imageLink = "https://s3b.cashify.in/gpro/uploads/2020/04/09064634/Read-If-Money-Heist-Fan.jpg", title = "Money Heist"))

        recycler_view.adapter = CarouselAdapter(context = this, carouselList = carouselList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
}