package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.tensorflow.lite.examples.detection.model.TripHistoryModel;
import org.tensorflow.lite.examples.detection.room.OlektraRoomDB;

import java.util.List;

public class ToursScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours_screen);

        RecyclerView rvItem = findViewById(R.id.rv_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        List<TripHistoryModel> tourHistory = OlektraRoomDB.getDatabase(this).tripDao().getTripHistory();
        TourAdapter itemAdapter = new TourAdapter(this,tourHistory);
        rvItem.setAdapter(itemAdapter);
        rvItem.setLayoutManager(layoutManager);

    }
}