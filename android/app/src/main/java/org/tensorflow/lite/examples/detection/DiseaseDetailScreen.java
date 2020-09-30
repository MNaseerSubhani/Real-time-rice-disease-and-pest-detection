package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DiseaseDetailScreen extends AppCompatActivity {
    private static final String TAG = "DiseaseDetailScreen";
    TextView diseaseName, diseaseIntro, diseaseSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_detail_screen);
        diseaseName = findViewById(R.id.diseaseName);
        diseaseIntro = findViewById(R.id.diseaseIntro);
        diseaseSave = findViewById(R.id.diseaseSave);
        Intent intent = getIntent();
        if(intent!=null){
            String disease = intent.getStringExtra("disease");
            if(disease!=null)
                parseDiseaseType(disease);
        }

    }

    private void parseDiseaseType(String diseaseType) {
        try {
            switch (diseaseType) {
                case "Bacterial Blight":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Bacterial Leaf_streak":
                    diseaseName.setText(getResources().getText(R.string.bls));
                    diseaseIntro.setText(getResources().getText(R.string.bls_intro));
                    diseaseSave.setText(getResources().getText(R.string.bls_save));
                    break;
                case "Bakanae":
                    diseaseName.setText(getResources().getText(R.string.bakni));
                    diseaseIntro.setText(getResources().getText(R.string.bakni_intro));
                    diseaseSave.setText(getResources().getText(R.string.bakni_save));
                    break;
                case "Brown Plant Hopper":
                    diseaseName.setText(getResources().getText(R.string.brown_spot));
                    diseaseIntro.setText(getResources().getText(R.string.brn_spot_intro));
                    diseaseSave.setText(getResources().getText(R.string.brn_spot_save));
                    break;
                case "Brown Spot":
                    diseaseName.setText(getResources().getText(R.string.brown_spot));
                    diseaseIntro.setText(getResources().getText(R.string.brn_spot_intro));
                    diseaseSave.setText(getResources().getText(R.string.brn_spot_save));
                    break;
                case "Case Worm":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Collar Blast":
                    diseaseName.setText(getResources().getText(R.string.blast));
                    diseaseIntro.setText(getResources().getText(R.string.blast_intro));
                    diseaseSave.setText(getResources().getText(R.string.blast_save));
                    break;
                case "False Smut":
                    diseaseName.setText(getResources().getText(R.string.fls_smut));
                    diseaseIntro.setText(getResources().getText(R.string.fls_smut_intro));
                    diseaseSave.setText(getResources().getText(R.string.fls_smut_save));
                    break;
                case "Gall Midge":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Grassy Stunt":
                    diseaseName.setText(getResources().getText(R.string.gras_st));
                    diseaseIntro.setText(getResources().getText(R.string.gras_st_intro));
                    diseaseSave.setText(getResources().getText(R.string.gras_st_intro));
                    break;
                case "Green Leaf Hopper":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Gundhi Bug":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Leaf Blast":
                    diseaseName.setText(getResources().getText(R.string.blast));
                    diseaseIntro.setText(getResources().getText(R.string.blast_intro));
                    diseaseSave.setText(getResources().getText(R.string.blast_save));
                    break;
                case "Leaf Folder":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Leaf Scald":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Neck Blast":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Node Blast":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Ragged Stunt":
                    diseaseName.setText(getResources().getText(R.string.rg_stunt));
                    diseaseIntro.setText(getResources().getText(R.string.rg_stunt_intro));
                    diseaseSave.setText(getResources().getText(R.string.rg_stunt_save));
                    break;
                case "Red Stripe":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Rice Hispa":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Rice Thrip":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Sheath Blight":
                    diseaseName.setText(getResources().getText(R.string.sht_blt));
                    diseaseIntro.setText(getResources().getText(R.string.sht_blt_intro));
                    diseaseSave.setText(getResources().getText(R.string.sht_blt_save));
                    break;
                case "Sheath Rot":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "White Backed Plant Hopper":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                case "Yellow Stem Borer":
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
                    break;
                default:
                    diseaseName.setText(getResources().getText(R.string.bacterial_blight));
                    diseaseIntro.setText(getResources().getText(R.string.bacterial_blight_intro));
                    diseaseSave.setText(getResources().getText(R.string.bacterial_blight_save));
            }
        } catch (Exception e) {
            Log.e(TAG, "parseDiseaseType: ", e);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}