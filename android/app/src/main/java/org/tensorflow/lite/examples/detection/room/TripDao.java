package org.tensorflow.lite.examples.detection.room;

import org.tensorflow.lite.examples.detection.model.TripHistoryModel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

/***********************************
 * Created by Babar on 9/26/2020.  *
 ***********************************/
@Dao
public interface TripDao {
    @Query("SELECT * from trip_history ORDER BY startTime DESC")
    List<TripHistoryModel> getTripHistory();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(TripHistoryModel event);
}
