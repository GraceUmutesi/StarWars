package com.example.starwars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mCharacters;
    private Button mSavedCharacters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCharacters=(Button)findViewById(R.id.viewCharacters);
        mSavedCharacters=(Button)findViewById(R.id.savedCharacters);

        mCharacters.setOnClickListener(this);
        mSavedCharacters.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mCharacters){
            Intent intent = new Intent(MainActivity.this, CharacterListActivity.class);
            startActivity(intent);
        }
        if(view == mSavedCharacters){
            Intent intent = new Intent(MainActivity.this, SavedCharactersListActivity.class);
            startActivity(intent);
        }
    }
}
