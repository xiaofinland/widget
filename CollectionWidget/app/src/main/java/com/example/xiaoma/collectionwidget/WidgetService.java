package com.example.xiaoma.collectionwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by xiaoma on 11/02/16.
 */
public class WidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {

        WidgetDataProvider dataProvider = new WidgetDataProvider(
                getApplicationContext(), intent);
        return dataProvider;
    }

}
