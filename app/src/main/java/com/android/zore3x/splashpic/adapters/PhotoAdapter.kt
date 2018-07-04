package com.android.zore3x.splashpic.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.zore3x.splashpic.R
import com.android.zore3x.splashpic.model.Photo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_item_photo.view.*


class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.PhotoHolder>() {

    var data: MutableList<Photo> = ArrayList()
        set(value) {
            data.clear()
            data.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PhotoHolder =
            PhotoHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_item_photo, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: PhotoHolder?, position: Int) {
        holder?.bind(data[position])
    }


    inner class PhotoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(photo: Photo) {
            // загрузка изображения
            Picasso.get().load(photo.urls.small)
                    .placeholder(R.drawable.placeholder_photo)
                    .into(itemView.imageView_photo)
            // загрузка аватара автора
            Picasso.get().load(photo.user.profileImage.small)
                    .placeholder(R.drawable.user_placeholder)
                    .into(itemView.imageView_user_mini_photo)

            itemView.textView_username.text = photo.user.name
            itemView.textView_photo_description.text = photo.description

        }

    }
}
