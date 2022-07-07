package zuini.gustavo.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import zuini.gustavo.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Mock de notícias.
        List<News> news = new ArrayList<>();
        news.add(new News("Título 1", "Descrição 1"));
        news.add(new News("Título 2", "Descrição 2"));
        news.add(new News("Título 3", "Descrição 3"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}