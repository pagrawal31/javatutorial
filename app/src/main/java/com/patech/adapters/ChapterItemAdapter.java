package com.patech.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.patech.javatutorial.MainScreenActivity;
import com.patech.javatutorial.R;

import java.util.List;

/**
 * Created by pagrawal on 20-11-2017.
 */

public class ChapterItemAdapter extends ArrayAdapter {

    private Context context;
    private MainScreenActivity mCallback;
    private List<String> chapters;
    public ChapterItemAdapter(Context context, List<String> chapters) {
        super(context, -1, chapters);
        this.chapters = chapters;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_item_layout, parent, false);

        TextView sNo = (TextView) rowView.findViewById(R.id.textViewSNo);
        TextView title = (TextView) rowView.findViewById(R.id.textViewTitle);

        sNo.setText(String.valueOf(position));
        title.setText(chapters.get(position));

        return rowView;
    }
}
