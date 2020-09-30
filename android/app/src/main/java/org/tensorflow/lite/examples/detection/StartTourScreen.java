package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.tensorflow.lite.examples.detection.model.DiseaseModel;
import org.tensorflow.lite.examples.detection.model.TripHistoryModel;
import org.tensorflow.lite.examples.detection.room.OlektraRoomDB;

import java.util.ArrayList;
import java.util.List;

public class StartTourScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_tour_screen);
        /*TripHistoryModel tripHistoryModel = new TripHistoryModel();
        tripHistoryModel.setStartTime(System.currentTimeMillis());
        tripHistoryModel.setEndTime(System.currentTimeMillis() + 2);
        DiseaseModel diseaseModel = new DiseaseModel(System.currentTimeMillis(), "abc");
        List<DiseaseModel> disesas = new ArrayList<>();
        disesas.add(diseaseModel);
        tripHistoryModel.setDiseases(disesas);
        OlektraRoomDB.getDatabase(this).tripDao().insert(tripHistoryModel);
        List<TripHistoryModel> tripHistory = OlektraRoomDB.getDatabase(this).tripDao().getTripHistory();
        Log.d("TAG_ABV", "onCreate: " + tripHistory.toString());*/

       // disesas.stream().filter()

    }

    public void startCameraActivity(View v){
        Utils.tripHistoryModel = new TripHistoryModel();
        Utils.tripHistoryModel.setStartTime(System.currentTimeMillis());
        startActivity(new Intent(this,DetectorActivity.class));
        finish();
    }


}