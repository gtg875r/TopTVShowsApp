package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val docs: List<Show>?
)
//@Keep
//@Serializable
//data class BaseResponse(
//    @SerialName("results")
//    val docs: List<Show>?
//)
@Keep
@Serializable
data class Show(
    @SerialName("overview")
    val abstract: String?,
    @SerialName("first_air_date")
    val byline: String?,
    @SerialName("name")
    val headline: String?,
    @SerialName("poster_path")
    val multimedia: String?,
)
: java.io.Serializable {
////    val mediaImageUrl = "https://image.tmdb.org/t/p/w500/${multimedia?.firstOrNull { it.url != null }?.url ?: ""}"
      val mediaImageUrl = "https://image.tmdb.org/t/p/w500/${multimedia}"
}

//@Keep
//@Serializable
//data class HeadLine(
//    @SerialName("main")
//    val main: String
//) : java.io.Serializable
//
//@Keep
//@Serializable
//data class Byline(
//    @SerialName("original")
//    val original: String? = null
//) : java.io.Serializable
//
//@Keep
//@Serializable
//data class MultiMedia(
//    @SerialName("url")
//    val url: String?
//) : java.io.Serializable

