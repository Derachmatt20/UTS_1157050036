package com.derachmatt.uts_1157050036;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> namateam1 = new ArrayList<>();
    private ArrayList<String> namateam2 = new ArrayList<>();
    private ArrayList<String> Score1 = new ArrayList<>();
    private ArrayList<String> Score2 = new ArrayList<>();
    private ArrayList<String> mgmbr1 = new ArrayList<>();
    private ArrayList<String> mbmbr2 = new ArrayList<>();
    private ArrayList<String> url = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isi();
    }

    private void isi(){

            namateam1.add("BHAYANGKARA FC");
            namateam2.add("PERSIB BANDUNG");
            url.add("http://www.persib.co.id/fixtures/74");
            Score1.add("1");
            Score2.add("2");
            mgmbr1.add("https://pbs.twimg.com/profile_images/877233321440419840/_N5zZqFy_400x400.jpg");
            mbmbr2.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");

            namateam1.add("PERSIB BANDUNG");
            namateam2.add("BALI UNITED");
            url.add("http://www.persib.co.id/fixtures/73");
            Score1.add("1");
            Score2.add("1");
            mgmbr1.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");
            mbmbr2.add("https://upload.wikimedia.org/wikipedia/id/e/ee/Bali_United_logo.png");

            namateam1.add("PSM MAKASSAR");
            namateam2.add("PERSIB BANDUNG");
            url.add("http://www.persib.co.id/fixtures/72");
            Score1.add("1");
            Score2.add("0");
            mgmbr1.add("https://celebesonline.com/wp-content/uploads/2017/04/Logo-Baru-PSM-Makassar.jpg");
            mbmbr2.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");

            namateam1.add("PERSIB BANDUNG");
            namateam2.add("PERSIBAYA SURABAYA");
            url.add("http://www.persib.co.id/fixtures/71");
            Score1.add("1");
            Score2.add("4");
            mgmbr1.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");
            mbmbr2.add("https://upload.wikimedia.org/wikipedia/commons/3/30/PERSEBAYA_SINCE_1927.png");

            namateam1.add("PERSIPURA JAYAPURA");
            namateam2.add("PERSIB BANDUNG");
            url.add("http://www.persib.co.id/fixtures/70");
            Score1.add("1");
            Score2.add("1");
            mgmbr1.add("http://3.bp.blogspot.com/-4FA0T30-F-8/T2VstnoKdJI/AAAAAAAAFeo/ZF08m8hs-hE/s1600/LOGO+PERSIPURA.png");
            mbmbr2.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");

            namateam1.add("PSKC CIMAHI");
            namateam2.add("PERSIB BANDUNG");
            url.add("http://www.persib.co.id/fixtures/69");
            Score1.add("1");
            Score2.add("2");
            mgmbr1.add("https://upload.wikimedia.org/wikipedia/en/9/90/PSKC_badge.jpg");
            mbmbr2.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");

            namateam1.add("PERSIB BANDUNG");
            namateam2.add("MADURA UNITED");
            url.add("http://www.persib.co.id/fixtures/68");
            Score1.add("1");
            Score2.add("2");
            mgmbr1.add("https://images-na.ssl-images-amazon.com/images/I/61liwxkyfmL.png");
            mbmbr2.add("https://upload.wikimedia.org/wikipedia/id/thumb/d/de/MADURA_UNITED.jpg/1200px-MADURA_UNITED.jpg");


        initRecycler();

    }

    private void initRecycler(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        com.example.fluks77.myapplication.RVadapter adapter = new com.example.fluks77.myapplication.RVadapter(this, namateam1, namateam2, url, Score1, Score2, mgmbr1, mbmbr2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

