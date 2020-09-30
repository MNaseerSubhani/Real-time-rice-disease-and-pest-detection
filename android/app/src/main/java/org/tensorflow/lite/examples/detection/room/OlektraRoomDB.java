package org.tensorflow.lite.examples.detection.room;

import android.content.Context;

import org.tensorflow.lite.examples.detection.model.DataConverter;
import org.tensorflow.lite.examples.detection.model.TripHistoryModel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

/***********************************
 * Created by Babar on 9/26/2020.  *
 ***********************************/
@TypeConverters(DataConverter.class)
@Database(entities = {TripHistoryModel.class}, version = 1, exportSchema = false)
public abstract class OlektraRoomDB extends RoomDatabase {

    public abstract TripDao tripDao();

    private static volatile OlektraRoomDB INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static OlektraRoomDB getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (OlektraRoomDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            OlektraRoomDB.class, "olektra_database")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
