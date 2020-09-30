package org.tensorflow.lite.examples.detection.model;

/***********************************
 * Created by Babar on 9/26/2020.  *
 ***********************************/
public class DiseaseModel {
    private long detectTime;
    private String diseaseName;

    public DiseaseModel() {
    }

    public DiseaseModel(long detectTime, String diseaseName) {
        this.detectTime = detectTime;
        this.diseaseName = diseaseName;
    }


    public long getDetectTime() {
        return detectTime;
    }

    public void setDetectTime(long detectTime) {
        this.detectTime = detectTime;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @Override
    public String toString() {
        return "DiseaseModel{" +
                "detectTime=" + detectTime +
                ", diseaseName='" + diseaseName + '\'' +
                '}';
    }
}
