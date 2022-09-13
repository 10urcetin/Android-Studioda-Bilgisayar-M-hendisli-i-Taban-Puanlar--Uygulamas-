package com.onurcetin.bilgisayarmhendisliitabanpuanlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.onurcetin.bilgisayarmhendisliitabanpuanlar.databinding.ActivityDetaylarBinding;

public class Detaylar extends AppCompatActivity {
    private ActivityDetaylarBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityDetaylarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();
        //Casting
        University selectedUniversity=(University) intent.getSerializableExtra("University");
        binding.nameText.setText(selectedUniversity.name);
        binding.cityText.setText(selectedUniversity.city);
        binding.imageView.setImageResource(selectedUniversity.image);

        binding.textPoint.setText(Double.toString(selectedUniversity.puan));
        binding.textSRalama.setText(Double.toString(selectedUniversity.sıralama));



    }
}