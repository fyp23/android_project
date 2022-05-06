package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class normal_house extends AppCompatActivity {
    //drop textView
    AutoCompleteTextView autoCompleteTextView, autoCompleteTextView1, autocompleteAlbinism, autocompleteSeeing, autoCompletehearing, autoCompleteWorking, autoCompleteRemembering;
    AutoCompleteTextView autoCompleteSelfcare,autoCompleteDisability,autoCompleteMaritual,autoEducationAttainment,autoCompleteBirthcirtificate,autoCompleteEducation,autoCompleteEducationLevel;
    AutoCompleteTextView autoCompleteDeath,autoCompleteNatureDeath;
    ArrayAdapter<CharSequence> adapterItems, adapterItem1, adapterAlbino,adapterSeeing, adapterHearing,adapterWorking, adapterRemembering,adapterEducationLevel;
    ArrayAdapter<CharSequence> adapterSelfcare,adapterDisability,adapterMaritual,adapterBirthcirtificate,adapterEducation,adapterEductionAttainment;
    ArrayAdapter<CharSequence> adapterDeath,adapterNatureDeath;
    Button btnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_house);

        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        //connecting display layout
        adapterItems = ArrayAdapter.createFromResource(this, R.array.item_house_holder, R.layout.house_hold_layout);
        //connect with view adapter
        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView1 = findViewById(R.id.auto_complete_txt1);
        //connect display layout
        adapterItem1 = ArrayAdapter.createFromResource(this, R.array.item_sex, R.layout.sex_layout);
        //dislapy layer
        autoCompleteTextView1.setAdapter(adapterItem1);
///
        //connect Albinism
        autocompleteAlbinism = findViewById(R.id.auto_complete_albino);
        adapterAlbino = ArrayAdapter.createFromResource(this, R.array.item_albino, R.layout.albino_layout);
        autocompleteAlbinism.setAdapter(adapterAlbino);

        //connect layer
        autocompleteSeeing = findViewById(R.id.auto_complete_seeing);
        adapterSeeing=ArrayAdapter.createFromResource(this, R.array.item_seeing, R.layout.seeing_layout);
        autocompleteSeeing.setAdapter(adapterSeeing);

        //connect hearing
        autoCompletehearing = findViewById(R.id.auto_complete_Hearing);
        adapterHearing = ArrayAdapter.createFromResource(this,R.array.item_hearing, R.layout.hearing_layout);
        autoCompletehearing.setAdapter(adapterHearing);

        //connect Working
        autoCompleteWorking = findViewById(R.id.auto_complete_Working);
        adapterWorking = ArrayAdapter.createFromResource(this,R.array.item_working, R.layout.working_layout);
        autoCompleteWorking.setAdapter(adapterWorking);

        //connect remembering
        autoCompleteRemembering = findViewById(R.id.auto_complete_remembering);
        adapterRemembering = ArrayAdapter.createFromResource(this,R.array.item_remembering, R.layout.remembering_layout);
        autoCompleteRemembering.setAdapter(adapterRemembering);

        //self care
        autoCompleteSelfcare = findViewById(R.id.auto_complete_selfcare);
        adapterSelfcare = ArrayAdapter.createFromResource(this,R.array.item_selfcare, R.layout.selfcare_layout);
        autoCompleteSelfcare.setAdapter(adapterSelfcare);

        //Disability
        autoCompleteDisability = findViewById(R.id.auto_complete_disability);
        adapterDisability = ArrayAdapter.createFromResource(this,R.array.item_disability, R.layout.disability_layout);
        autoCompleteDisability.setAdapter(adapterDisability);
//Maritual Status
        autoCompleteMaritual = findViewById(R.id.auto_complete_maritual);
        adapterMaritual = ArrayAdapter.createFromResource(this,R.array.item_maritul, R.layout.maritual_layout);
        autoCompleteMaritual.setAdapter(adapterMaritual);

        //birthcirtificate

        autoCompleteBirthcirtificate = findViewById(R.id.auto_complete_birthcirtificate);
        adapterBirthcirtificate = ArrayAdapter.createFromResource(this,R.array.item_birthCertificate, R.layout.birth_cirtification);
        autoCompleteBirthcirtificate.setAdapter(adapterBirthcirtificate);

        //education
        autoCompleteEducation= findViewById(R.id.auto_complete_education);
        adapterEducation=ArrayAdapter.createFromResource(this,R.array.item_education, R.layout.education_layout);
        autoCompleteEducation.setAdapter(adapterEducation);

        //education attainment
        autoEducationAttainment= findViewById(R.id.auto_complete_educationAttain);
        adapterEductionAttainment=ArrayAdapter.createFromResource(this,R.array.item_education_attain, R.layout.education_attainment);
        autoEducationAttainment.setAdapter(adapterEductionAttainment);

        //education level
        autoCompleteEducationLevel= findViewById(R.id.auto_complete_education_level);
        adapterEducationLevel=ArrayAdapter.createFromResource(this,R.array.item_education_level,R.layout.level_of_education);
        autoCompleteEducationLevel.setAdapter(adapterEducationLevel);

        //death
        autoCompleteDeath = findViewById(R.id.auto_complete_dealth);
        adapterDeath =ArrayAdapter.createFromResource(this,R.array.item_dealth,R.layout.item_death_layout);
        autoCompleteDeath.setAdapter(adapterDeath);

        //nature of death
        autoCompleteNatureDeath = findViewById(R.id.auto_complete_dealth_couse);
        adapterNatureDeath = ArrayAdapter.createFromResource(this, R.array.item_couse_death,R.layout.item_nature_death_layout);
        autoCompleteNatureDeath.setAdapter(adapterNatureDeath);

        //
btnSendData= findViewById(R.id.sendData);

btnSendData.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        toastBtn();

    }
    private void toastBtn(){
        Toast.makeText(normal_house.this, "Data send", Toast.LENGTH_SHORT).show();
    }
});



    }
}