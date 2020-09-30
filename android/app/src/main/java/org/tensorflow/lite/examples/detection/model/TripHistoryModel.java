package org.tensorflow.lite.examples.detection.model;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

/***********************************
 * Created by Babar on 9/26/2020.  *
 ***********************************/
@Entity(tableName = "trip_history")
public class TripHistoryModel {
    @PrimaryKey
    @NonNull
    private long startTime;
    private long endTime;
    List<DiseaseModel> diseases;

    public TripHistoryModel() {
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    @TypeConverters(DataConverter.class)
    public List<DiseaseModel> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<DiseaseModel> diseases) {
        this.diseases = diseases;
    }

    @Override
    public String toString() {
        return "TripHistoryModel{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", diseases=" + diseases +
                '}';
    }
}
