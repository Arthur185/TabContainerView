package com.muheda.mdtabcontainerview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.muheda.tabcontainerview.widget.AbsTab;


public class ExampleOneTab extends AbsTab {

    private TextView mTvTitle;
    private int mTextColor = Color.BLACK, mSelectedTextColor = Color.BLUE;

    public ExampleOneTab(Context context, int index) {
        super(context, index);

        inflaterView(this, R.layout.tab_example_one);
    }

    @Override
    protected void tabSelected(boolean isSelected) {
        mTvTitle.setTextColor(isSelected ? mSelectedTextColor : mTextColor);
    }


    @Override
    protected void initView(View rootView) {
        mTvTitle = (TextView) rootView.findViewById(R.id.tv_title);
    }

    public void setText(String text) {
        mTvTitle.setText(text);
    }
}
