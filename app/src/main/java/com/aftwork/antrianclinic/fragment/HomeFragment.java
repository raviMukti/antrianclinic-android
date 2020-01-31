package com.aftwork.antrianclinic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aftwork.antrianclinic.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HomeFragment extends Fragment {

    CarouselView carouselView;
    int[] carouselImages = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3
    };

    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fr_home, container, false );

        carouselView = (CarouselView) view.findViewById( R.id.carouselView );
        carouselView.setPageCount( carouselImages.length );
        carouselView.setImageListener( imageListener );
        return view;
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource( carouselImages[position] );
        }
    };
}
