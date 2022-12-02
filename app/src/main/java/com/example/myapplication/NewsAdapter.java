package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewsAdapter extends  ArrayAdapter<NewsItem>{
    public NewsAdapter(Context context, List<NewsItem> newsItems) {
        super(context, 0, newsItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_news_list_item, parent, false);
        }

        // Get the NewsItem object located at this position in the list
        NewsItem currentNewsItem = (NewsItem) getItem(position);

        // Find the TextView in the news_list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        // Get the title from the currentNewsItem object and set this text on
        // the title TextView
        titleTextView.setText(currentNewsItem.getTitle());

        // Find the TextView in the news_list_item.xml layout with the ID description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the description from the currentNewsItem object and set this text on
        // the description TextView
      //  descriptionTextView.setText(currentNewsItem.getDescription());

        // Find the TextView in the news_list_item.xml layout with the ID date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        // Get the date from the currentNewsItem object and set this text on
        // the date TextView
        dateTextView.setText(currentNewsItem.getDate());

        // Find the TextView in the news_list_item.xml layout with the ID link
        TextView linkTextView = (TextView) listItemView.findViewById(R.id.link);
        // Get the link from the currentNewsItem object and set this text on
        // the link TextView
        linkTextView.setText(currentNewsItem.getLink());

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView
        return listItemView;
    }
}


