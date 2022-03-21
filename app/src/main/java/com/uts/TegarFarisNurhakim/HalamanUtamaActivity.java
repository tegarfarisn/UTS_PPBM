package com.uts.TegarFarisNurhakim;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uts.TegarFarisNurhakim.model.DataKlub;
import com.uts.TegarFarisNurhakim.model.Klub;

import java.util.ArrayList;
import java.util.List;

public class HalamanUtamaActivity extends AppCompatActivity implements DataKlub.KlubClickListener {
    public static final String Key_HalamanUtamaActivity="Key_HalamanUtamaActivity";

    public RecyclerView rv;
    public DataKlub dataKlub;
    public RecyclerView.LayoutManager layoutManager;
    public List<Klub> listKlub = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        rv = findViewById(R.id.rvKlub);
        listKlub.add(new Klub("Bali United                       69",
                "                                         ",

                "Liverpool FC adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. " +
                        "Liverpool juga merupakan juara bertahan Liga Champions UEFA musim 2018-2019. Liverpool telah memenangkan 6 trofi Liga Champions UEFA " +
                        "(dulu Piala Champions) dan merupakan klub dengan pemegang gelar juara Liga Champions UEFA terbanyak di Inggris dan ketiga di Eropa setelah " +
                        "Real Madrid dan AC Milan. Selain itu Liverpoo l juga pemegang 3 gelar juara Liga Eropa UEFA dan 4 gelar Piala Super UEFA."));
        listKlub.add(new Klub("Persib                               66",
                "",
                "Total main                 31\n"+

                "Menang                     20\n"+

                "Seri                             6\n"+

                "Kalah                          5\n"+

                "Gol Masuk                 46\n"+

                "Gol Kemasukan        20\n"+

                "Selisih Gol                  26"));
        listKlub.add(new Klub("Persebaya                       59",
                "",
                "Arsenal FC adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square. Klub ini " +
                        "bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris " +
                        "(10 pada era Divisi Pertama dan 3 pada era Premier League) dan 13 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode " +
                        "terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen " +
                        "Liga Inggris sepanjang abad ke-20. Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan " +
                        "tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan."));
        listKlub.add(new Klub(" Bhayangkara                     59",
                "",
                "Leicester City FC adalah sebuah tim sepak bola Inggris berbasis di Leicester. Leicester Dikenal juga dengan sebutan The Foxes. Klub ini memainkan " +
                        "pertandingan kandangnya di Stadion King Power yang berkapsitas 32.000 penonton. Mereka bermain di Liga Premier, setelah promosi sebagai juara " +
                        "Football League Championship di 2013-14, kembali ke papan atas sepak bola Inggris setelah satu dekade dan akhirnya menjadi juara di musim 2015-16, " +
                        "atau dua musim setelah promosi."));
        listKlub.add(new Klub("Arema                              58",
                "",
                "Chelsea FC adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama " +
                        "Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih " +
                        "pada dekade 1960an, 1970an, 1990an, dan 2000an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam " +
                        "gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, satu Liga Champions UEFA, dan satu " +
                        "Piala Super UEFA. Dalam dua dekade terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih lebih dari 30 gelar sejak tahun 1997, termasuk " +
                        "untuk pertama kali meraih gelar ganda, Liga Utama Inggris dan Piala FA pada tahun 2010 serta gelar juara Liga Champions UEFA pada tahun 2012 dan Liga " +
                        "Eropa UEFA pada 2013 dan 2019."));

        dataKlub = new DataKlub(listKlub);
        dataKlub.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(dataKlub);
        rv.setLayoutManager(layoutManager);

    }

    @Override
    public void onClick(View view, int position) {
        Klub klub = listKlub.get(position);
        Intent apkklub = new Intent(HalamanUtamaActivity.this,HalamanDetailActivity.class);
        apkklub.putExtra(Key_HalamanUtamaActivity,klub);
        startActivity(apkklub);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.halamanutama:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamandetail:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.halamantentang:
                Toast.makeText(HalamanUtamaActivity.this, item.getTitle().toString(), Toast.LENGTH_SHORT).show();
                break;
        }
        return true;//super.onOptionsItemSelected(item);

    }
}
