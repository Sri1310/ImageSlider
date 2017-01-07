package com.example.kannan.imageslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by kannan on 1/7/2017.
 */

public class CustomSlideAdapter extends PagerAdapter {

    private int[] images = {


            R.drawable.logan_hugh_jackman_as_wolverine_19325402_450_583,
            R.drawable.spiderman_iphone_wallpaper_5,
            R.drawable.wolverine_3_logan_plot_characters
    };

   private LayoutInflater layoutinflater;

   private Context context;



    public CustomSlideAdapter(MainActivity mainActivity) {

        this.context = mainActivity;


    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater layoutinflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutinflater.inflate(R.layout.picture_activity,container,false);
        ImageView imageview = (ImageView)item_view.findViewById(R.id.imageView);
        TextView textview = (TextView)item_view.findViewById(R.id.textView);

        imageview.setImageResource(images[position]);
        textview.setText("X-Men"+0);
        textview.setText("Spiderman"+1);
        textview.setText("Wolverine"+2);
        container.addView(item_view);
        return item_view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
