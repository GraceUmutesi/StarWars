package com.example.starwars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CharacterListActivity extends AppCompatActivity {
    private ListView listView;
    private String[] CharacterName= new String[]{"Luke Skywalker","C-3PO","R2-D2","Darth Vader","Leia Organa","Owen Lars","Beru Whitesun lars ","Biggs Darklighter","Obi-Wan Kenobi","Anakin Skywalker"
            ,"Wilhuff Tarkin","Chewbacca","Han Solo","Greedo","Jabba Desilijic Tiure","Wedge Antilles","Jek Tono Porkins","Yoda","Palpatine","Boba Fett","Bossk","Captain Phasma"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);

        listView = (ListView) findViewById(R.id.list1);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,CharacterName);
        listView.setAdapter(adapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<Character>> call = api.getCharacters();
        call.enqueue(new Callback<List<Character>>() {
            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {
                List<Character> characters = response.body();
                String[] characterNames = new String[characters.size()];

                for (int n= 0; n < characters.size(); n++){
                    characterNames[n] = characters.get(n).getName();
                }

                listView.setAdapter(
                        new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,characterNames)
                );



            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
