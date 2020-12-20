package com.example.praktikum11.model

import com.google.gson.annotations.SerializedName

//inisialisasi data dan objek yang akan diambil dan ditampilkan
data class Photo (
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("thumbnailUrl")
    val thumbnail: String?,
    @SerializedName("url")
    val url: String?
    )