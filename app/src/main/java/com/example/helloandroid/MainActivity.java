package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();
        initClearButton();

    }

    private void initClearButton() {
        Button clearButton = findViewById(R.id.buttonClear);
        clearButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                textDisplay.setText("Hello World!");
                EditText editName = findViewById(R.id.editTextName);
                EditText editName1 = findViewById(R.id.editLastName);
                editName.setText("");
                editName1.setText("");
            }
        });
    }

    private void initDisplayButton() {
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editTextName);
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                EditText editName1 = findViewById(R.id.editLastName);
                String firstNameToDisplay = editName.getText().toString();
                String lastNameToDisplay = editName1.getText().toString();
                Resources res = getResources();
                String displayString = res.getString(R.string.welcome_message, firstNameToDisplay);
                String displayString1 = res.getString(R.string.last_message, lastNameToDisplay);
                textDisplay.setText(displayString + " " + displayString1);
            }
        });
    }
}
