package org.tensorflow.lite.examples.detection.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import androidx.room.TypeConverter;

/***********************************
 * Created by Babar on 9/26/2020.  *
 ***********************************/
public class DataConverter {

    @TypeConverter
    public String fromDiseaseList(List<DiseaseModel> countryLang) {
        if (countryLang == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<DiseaseModel>>() {}.getType();
        String json = gson.toJson(countryLang, type);
        return json;
    }

    @TypeConverter
    public List<DiseaseModel> toDiseaseList(String countryLangString) {
        if (countryLangString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<List<DiseaseModel>>() {}.getType();
        List<DiseaseModel> countryLangList = gson.fromJson(countryLangString, type);
        return countryLangList;
    }
}