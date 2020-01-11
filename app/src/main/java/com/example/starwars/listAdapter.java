package com.example.starwars;

import android.content.Context;
import android.widget.ArrayAdapter;

public class listAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mCharacterName;

    public listAdapter(Context mContext, int resource, String[] mCharacterName) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mCharacterName = mCharacterName;

    }


}
