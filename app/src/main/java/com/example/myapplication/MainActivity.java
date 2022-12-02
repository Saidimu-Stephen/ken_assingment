package com.example.myapplication;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ProgressBar progressBar;
    private Button button;
    private EditText editText;

    private NewsAdapter adapter;
    private List<NewsItem> newsItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        progressBar = findViewById(R.id.progress_bar);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.edit_text);

        newsItems = new ArrayList<>();
        adapter = new NewsAdapter(this, newsItems);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                if (!url.isEmpty()) {
                    new NewsTask().execute(url);
                }
            }
        });
    }

    private class NewsTask extends AsyncTask<String, Void, Void> {
        @Override
        protected void onPreExecute() {
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(String... strings) {
            String url = strings[0];
            newsItems.clear();
            newsItems.addAll(NewsUtils.fetchNewsData(url));
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            progressBar.setVisibility(View.GONE);
            adapter.notifyDataSetChanged();
        }
    }
}

