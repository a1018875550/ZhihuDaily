package com.github.jokar.zhihudaily.model.entities.story

import android.arch.persistence.room.*
import com.github.jokar.zhihudaily.room.converter.Converters
import com.google.gson.annotations.SerializedName

/**
 * Created by JokAr on 2017/6/20.
 */
@Entity(tableName = "story")
@TypeConverters(Converters::class)
data class StoryEntity constructor(
        @PrimaryKey
        @SerializedName("id") var id: Int) {

    constructor() : this(0)

    @ColumnInfo(name = "images")
    @SerializedName("images") var images: Array<String>? = null

    @ColumnInfo(name = "title")
    @SerializedName("title") var title: String? = null

    @ColumnInfo(name = "date")
    var date: Long = 0

    @ColumnInfo(name = "read")
    var read: Int = 0

    @ColumnInfo(name = "like")
    var like: Int = 0

    @ColumnInfo(name = "collection")
    var collection: Int = 0

    /**
     * HTML-Body
     */
    @ColumnInfo(name = "body")
    var body: String? = null

    /**
     * 图片作者
     */
    @ColumnInfo(name = "image_source")
    var image_source: String? = null

    /**
     * 详情头部image
     */
    @ColumnInfo(name = "image")
    var image: String? = null

    @Ignore
    var dateString: String = ""

}