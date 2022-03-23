package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<BirdModel> birdModels = new ArrayList<>();
    int[] birdImages = {R.drawable.crow, R.drawable.nuthatch, R.drawable.coot, R.drawable.bunting,
                        R.drawable.curlew, R.drawable.starling, R.drawable.gull, R.drawable.redshank,
                        R.drawable.tit, R.drawable.albatross};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setUpBirdModels() {
        String[] birdNames = getResources().getStringArray(R.array.bird_names_txt);
        for(int i = 0; i < birdNames.length ; i++) {
            birdModels.add(new BirdModel(birdNames[i], birdImages[i]));
        }
    }
}