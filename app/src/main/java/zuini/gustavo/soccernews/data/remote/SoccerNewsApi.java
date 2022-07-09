package zuini.gustavo.soccernews.data.remote;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import zuini.gustavo.soccernews.domain.News;

public interface SoccerNewsApi {
    @GET("news.json")
    Call<List<News>> getNews();
}
