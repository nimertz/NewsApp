package dk.mertz.newsapp.network

import dk.mertz.newsapp.model.NewsList
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface  NewsApiService {
    @GET("everything?sortBy=popularity&apiKey=$API_KEY")
    fun getNews(@Query("q") query: String) : Observable<NewsList>

}