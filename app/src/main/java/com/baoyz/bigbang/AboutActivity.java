/*
 * The MIT License (MIT)
 * Copyright (c) 2016 baoyongzhang <baoyz94@gmail.com>
 */
package com.baoyz.bigbang;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.drakeet.multitype.Items;
import me.drakeet.support.about.Card;
import me.drakeet.support.about.Category;
import me.drakeet.support.about.Contributor;
import me.drakeet.support.about.License;
import me.drakeet.support.about.Line;

/**
 * Created by baoyongzhang on 2016/10/25.
 */
public class AboutActivity extends me.drakeet.support.about.AboutActivity {

    @Override
    protected void onCreateHeader(ImageView icon, TextView slogan, TextView version) {
        icon.setImageResource(R.mipmap.icon);
        slogan.setText("关于 BigBang");
        version.setText("1.0 beta");
    }

    @Override
    protected void onItemsCreated(@NonNull Items items) {
        items.add(new Category("介绍与帮助"));
        items.add(new Card(getString(R.string.description), "项目主页"));

        items.add(new Line());

        items.add(new Category("Developers"));
        items.add(new Contributor(R.mipmap.bao, "baoyongzhang", "核心功能开发"));
        items.add(new Contributor(R.mipmap.dim, "zzz40500", "Xposed 模块开发"));

        items.add(new Line());

        items.add(new Category("Open Source Licenses"));
        items.add(new License("BigBang", "baoyongzhang", License.MIT,
                "https://github.com/baoyongzhang/BigBang"));
        items.add(new License("OkHttp", "square", License.APACHE_2,
                "https://github.com/square/okhttp"));
        items.add(new License("MultiType", "drakeet", License.APACHE_2,
                "https://github.com/drakeet/MultiType"));
        items.add(new License("about-page", "drakeet", License.APACHE_2,
                "https://github.com/drakeet/about-page"));
    }

    @Override
    protected void onActionClick(View action) {
        super.onActionClick(action);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/baoyongzhang/BigBang"));
        startActivity(intent);
    }
}
