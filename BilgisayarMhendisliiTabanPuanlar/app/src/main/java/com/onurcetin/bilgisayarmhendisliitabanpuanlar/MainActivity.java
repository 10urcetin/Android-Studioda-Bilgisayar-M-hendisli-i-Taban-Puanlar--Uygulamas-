package com.onurcetin.bilgisayarmhendisliitabanpuanlar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.onurcetin.bilgisayarmhendisliitabanpuanlar.databinding.ActivityDetaylarBinding;
import com.onurcetin.bilgisayarmhendisliitabanpuanlar.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<University>universityArrayList;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        universityArrayList=new ArrayList<>();

        University odtü=new University("Orta Doğu Teknik Üniversitesi","Ankara",R.drawable.odtu,889,541);
        University itü=new University("istanbul Teknik Üniversitesi","İstabul",R.drawable.tu,1.197,539);
        University hacettepe=new University("Hacettepe Üniversitesi","Ankara",R.drawable.hacettepe,3.582,528);
        University gazi=new University("Gazi Üniversitesi","Ankara",R.drawable.gazi,22.864,	491);
        University ege=new University("Ege Üniversitesi","İzmir",R.drawable.ege,13.898,505);
        University akdeniz=new University("Akdeniz Üniversitesi","Antalya",R.drawable.akdeniz1,28.564,484);
        University uludag=new University("Uludağ Üniversitesi","Bursa",R.drawable.uludag,41.173,468);
        University sakarya=new University("Sakarya Üniversitesi","Sakarya",R.drawable.sakarya,43.547,465);
        University bolu=new University("Bolu Abant İzzet Baysal Üniversitesi","Bolu",R.drawable.bolu,68.842,436);
        University cukurova=new University("Çukurova Üniversitesi","Adana",R.drawable.cukurova,56.567,450);
        University pamukkale=new University("PamukkaleÜniversitesi","Denizli",R.drawable.pamukkale,62.882,442);
        University sdü=new University("Süleyman Demirel Üniversitesi","Isparta",R.drawable.parta,73.864,431);
        University mersin=new University("Mersin Üniversitesi","Mersin",R.drawable.mersin,76.466,428);
        University trakya=new University("Trakya Üniversitesi","Edirne",R.drawable.trakya,	79.942,424);
        University düzce=new University("Düzce Üniversitesi","Düzce",R.drawable.ce,80.771,424);
        University zonguldak =new University("Zonguldak Bülent Ecevit Üniversitesi","Zonguldak",R.drawable.zonguldak,105.669,400);
        University ankara=new University("Ankara Üniversitesi","Ankara",R.drawable.ankara,26.211,487);
        University boğaziçi=new University("Boğaziçi Üniversitesi","İstanbul",R.drawable.bogaz,354,547);
        University marmara=new University("Marmara Üniversitesi","İstanbul",R.drawable.marmara,7.008,519);
        University gebze=new University("Gezbze Teknik Üniversitesi","Kocaeli",R.drawable.gebze,9.923,513);
        University yalova=new University("Yalova Üniversitesi","Yalova",R.drawable.yalova,81.639,423);
        University kütahya=new University("Kütahya Dumlupınar Üniversitesi","Kütahya",R.drawable.kutahya,99.938,405);
        universityArrayList.add(odtü);
        universityArrayList.add(itü);
        universityArrayList.add(hacettepe);
        universityArrayList.add(gazi);
        universityArrayList.add(ege);
        universityArrayList.add(akdeniz);
        universityArrayList.add(uludag);
        universityArrayList.add(sakarya);
        universityArrayList.add(bolu);
        universityArrayList.add(cukurova);
        universityArrayList.add(pamukkale);
        universityArrayList.add(sdü);
        universityArrayList.add(mersin);
        universityArrayList.add(trakya);
        universityArrayList.add(düzce);
        universityArrayList.add(yalova);
        universityArrayList.add(kütahya);
        universityArrayList.add(boğaziçi);
        universityArrayList.add(marmara);
        universityArrayList.add(ankara);
        universityArrayList.add(gebze);
        universityArrayList.add(zonguldak);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                universityArrayList.stream().map(university -> university.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             //   Toast.makeText(MainActivity.this, universityArrayList.get(i).name, Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,Detaylar.class);
                intent.putExtra("University",universityArrayList.get(i));
                startActivity(intent);
            }
        });




    }
}