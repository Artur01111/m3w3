package com.example.m3w3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3w3.databinding.FragmentScreenMainBinding;

import java.util.ArrayList;

public class ScreenMainFragment extends Fragment {

    FragmentScreenMainBinding binding;
    CarAdapter adapter;
    private ArrayList<String> carList = new ArrayList<>();
    private ArrayList<String> imageList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScreenMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new CarAdapter(carList, imageList);
        binding.rvView.setAdapter(adapter);
    }

    private void loadData(){
        imageList.add("https://avatars.mds.yandex.net/get-autoru-reviews/1676382/yOgZCpJ0N0kBVa3NSg4C9nXvlN3WT6Q2m/500x400");
        carList.add("Mustang");
        imageList.add("https://ncars.com.ua/image/data/blog/Огляди/Довгоочікувана%20Tesla%20Model%203%20Highland%20що%20змінилося/tesla_model_3_highland_1.jpg");
        carList.add("Tesla");
        imageList.add("https://avatars.mds.yandex.net/get-vertis-journal/3934100/2020-09-24-fea4c16248e24ca2b1614f6f48670cc1.jpg_1622736695542/orig");
        carList.add("Mersedes");
        imageList.add("https://www.bmwusa.com/content/dam/bmw/common/limited-edition/2024/soc25/m4-cs/BMW-LimitedEdition-M4-CSL-all.jpg.bmwimg.small.jpg");
        carList.add("BMW");
        imageList.add("https://configurator.porsche.com/model-start/pictures/718/extcam01.webp");
        carList.add("Porsh");
        imageList.add("https://www.honda.co.th/uploads/car_models/4b20bdc2f43b65cf292c383db2ef031a15.png");
        carList.add("Honda");
        imageList.add("https://www.kia.com/content/dam/kwcms/kme/global/en/assets/vehicles/sorento-pe-my25/discover/kia-sorento-my25-phev-clearcut-34front.png");
        carList.add("Kia");
        imageList.add("https://www.mazda.ca/globalassets/mazda-canada/build-and-price/jellies/2024-CX-30-Nav-Hover.png");
        carList.add("Mazda");
        imageList.add("https://www.toyota.com/config/pub/3d/toyota/1007736/1006275/Exterior/2/864_477_PNG/3d418b8-774f175-51d353f-c8c7ac5-1b1bfc4-f2cc576-cf0ba45-21ce168-6024785-d9076f1-958359b-95f71a6-480e600.png");
        carList.add("Toyota");
        imageList.add("https://hips.hearstapps.com/hmg-prod/images/2024-ferrari-812-gts-101-64caae4038b21.jpeg?crop=0.526xw:0.701xh;0.137xw,0.299xh&resize=768:*");
        carList.add("Ferrari");
    }
}