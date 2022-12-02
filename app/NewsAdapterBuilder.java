import android.content.Context;

import java.util.List;

public class NewsAdapterBuilder {
    private Context context;
    private List<NewsItem> newsItems;

    public NewsAdapterBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public NewsAdapterBuilder setNewsItems(List<NewsItem> newsItems) {
        this.newsItems = newsItems;
        return this;
    }

    public NewsAdapter createNewsAdapter() {
        return new NewsAdapter(context, newsItems);
    }
}