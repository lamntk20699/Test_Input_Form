package com.example.form_input;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkSports, checkTravel, checkMusic;
    EditText editName, editMs, editYear, editPhone, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkSports = findViewById(R.id.check_sports);
        checkTravel = findViewById(R.id.check_travel);
        checkMusic = findViewById(R.id.check_music);

        editName = findViewById(R.id.edit_name);
        editMs = findViewById(R.id.edit_mssv);
        editYear = findViewById(R.id.edit_birth);
        editPhone = findViewById(R.id.edit_phone);
        editEmail = findViewById(R.id.edit_email);

        findViewById(R.id.button_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean withSports = checkSports.isChecked();
                boolean withTravel = checkTravel.isChecked();
                boolean withMusic = checkMusic.isChecked();

                boolean checkRadio = false;
                boolean checkInput = false;

                String strName = editName.getText().toString();
                String strMs = editMs.getText().toString();
                String strYear = editYear.getText().toString();
                String strPhone = editPhone.getText().toString();
                String strEmail = editEmail.getText().toString();

                RadioGroup radioGroup = findViewById(R.id.radioGroup);
                int id = radioGroup.getCheckedRadioButtonId();
                if (id == R.id.male || id == R.id.female) checkRadio = true;

                if (strName.isEmpty() || strMs.isEmpty() || strYear.isEmpty() || strPhone.isEmpty() || strEmail.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.warn_message, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, R.string.confirm_message, Toast.LENGTH_SHORT).show();
                };
            }
        });
    }
}