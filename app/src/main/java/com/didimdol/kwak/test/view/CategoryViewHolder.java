package com.didimdol.kwak.test.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.didimdol.kwak.test.R;
import com.didimdol.kwak.test.data.Category;


/**
 * Created by Kwak on 2016-08-14.
 */
public class CategoryViewHolder  extends RecyclerView.ViewHolder {
    Category category;
    TextView category_name;

    public CategoryViewHolder(View itemView)
    {
        super(itemView);
        category_name = (TextView)itemView.findViewById(R.id.category_textview);
    }

    public void setCategory(String category_name)
    {
        this.category_name.setText(category_name);
    }
}
