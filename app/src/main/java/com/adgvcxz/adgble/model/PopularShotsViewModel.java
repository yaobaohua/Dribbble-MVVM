package com.adgvcxz.adgble.model;

import android.content.Context;
import android.os.Parcel;

import com.adgvcxz.adgble.R;
import com.adgvcxz.adgble.adapter.TopMarginSelector;

/**
 * zhaowei
 * Created by zhaowei on 2016/10/23.
 */

public class PopularShotsViewModel extends ShotsListViewModel {

    public PopularShotsViewModel(Context context, TopMarginSelector selector) {
        super(context, selector);
    }

    @Override
    String getSorts() {
        return "";
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_shots_list;
    }
}
