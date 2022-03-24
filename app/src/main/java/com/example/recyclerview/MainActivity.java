package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    Button button;
    public ArrayList<BirdModel> birdModels = new ArrayList<>();
    int[] birdImages = {R.drawable.crow, R.drawable.nuthatch, R.drawable.coot, R.drawable.bunting,
                        R.drawable.curlew, R.drawable.starling, R.drawable.gull, R.drawable.redshank,
                        R.drawable.tit, R.drawable.albatross};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);


        setUpBirdModels();
        createSnackBar();

        B_RecyclerViewAdapter adapter = new B_RecyclerViewAdapter(this, birdModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

    private void setUpBirdModels() {
        String[] birdNames = getResources().getStringArray(R.array.bird_names_txt);
        for(int i = 0; i < birdNames.length ; i++) {
            birdModels.add(new BirdModel(birdNames[i], birdImages[i]));
        }
    }

    private void createSnackBar() {
        constraintLayout = findViewById(R.id.constraintLayout);
        button = findViewById(R.id.btn_snackbar);
        button.setOnClickListener(View -> Snackbar.make(constraintLayout, "This is a snackbar", Snackbar.LENGTH_INDEFINITE)
                .setTextColor(Color.BLACK)
                .setBackgroundTint(Color.YELLOW)
                .setAction("Create Toast", view -> Toast.makeText(MainActivity.this, "This is Toast", Toast.LENGTH_SHORT).show())
                .setActionTextColor(Color.BLACK)
                .show());
    }
}