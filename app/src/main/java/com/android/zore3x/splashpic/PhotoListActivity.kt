package com.android.zore3x.splashpic

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import com.android.zore3x.splashpic.adapters.PhotoAdapter
import com.android.zore3x.splashpic.model.Photo
import com.android.zore3x.splashpic.presenter.PhotoListPresenter
import com.android.zore3x.splashpic.view.PhotoListView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_photo_list.*

class PhotoListActivity : AppCompatActivity(),
        PhotoListView{

    var adapter: PhotoAdapter = PhotoAdapter()
    var presenter: PhotoListPresenter? = null

    companion object {
        fun newInstance(context: Context) = Intent(context, PhotoListActivity::class.java)
    }

    override fun showData(data: MutableList<Photo>) {
        adapter.data = data
    }

    override fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_list)

        presenter = PhotoListPresenter()
        presenter?.attach(this)

        recyclerView_allPhotos.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView_allPhotos.adapter = adapter

        presenter?.loadPhoto()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detach()
    }
}
