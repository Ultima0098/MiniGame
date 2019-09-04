package com.example.dmc_ultima.game_idea_01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {

    EditText pin01, pin02, pin03, pin04;
    Button key01, key02, key03, key04, key05, key06, key07, key08, key09, key00, keyenter, keyclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        pin01 = findViewById(R.id.pin1);
        pin02 = findViewById(R.id.pin2);
        pin03 = findViewById(R.id.pin3);
        pin04 = findViewById(R.id.pin4);

        key01 = findViewById(R.id.key1);
        key02 = findViewById(R.id.key2);
        key03 = findViewById(R.id.key3);
        key04 = findViewById(R.id.key4);
        key05 = findViewById(R.id.key5);

        key06 = findViewById(R.id.key6);
        key07 = findViewById(R.id.key7);
        key08 = findViewById(R.id.key8);
        key09 = findViewById(R.id.key9);
        key00 = findViewById(R.id.key0);

        keyenter = findViewById(R.id.keyEnter);
        keyclear = findViewById(R.id.keyClear);

        pin01.setFocusable(true);
        pin01.setCursorVisible(false);
        pin01.setShowSoftInputOnFocus(false);

        pin02.setFocusable(true);
        pin02.setCursorVisible(false);
        pin02.setShowSoftInputOnFocus(false);

        pin03.setFocusable(true);
        pin03.setCursorVisible(false);
        pin03.setShowSoftInputOnFocus(false);

        pin04.setFocusable(true);
        pin04.setCursorVisible(false);
        pin04.setShowSoftInputOnFocus(false);

        key01.setOnClickListener(this);
        key02.setOnClickListener(this);
        key03.setOnClickListener(this);
        key04.setOnClickListener(this);
        key05.setOnClickListener(this);

        key06.setOnClickListener(this);
        key07.setOnClickListener(this);
        key08.setOnClickListener(this);
        key09.setOnClickListener(this);
        key00.setOnClickListener(this);

        keyenter.setOnClickListener(this);
        keyclear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (pin01.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "1"));
                    pin02.requestFocus();
                    break;
                case R.id.key2:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "2"));
                    pin02.requestFocus();
                    break;
                case R.id.key3:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "3"));
                    pin02.requestFocus();
                    break;
                case R.id.key4:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "4"));
                    pin02.requestFocus();
                    break;
                case R.id.key5:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "5"));
                    pin02.requestFocus();
                    break;

                case R.id.key6:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "6"));
                    pin02.requestFocus();
                    break;
                case R.id.key7:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "7"));
                    pin02.requestFocus();
                    break;
                case R.id.key8:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "8"));
                    pin02.requestFocus();
                    break;
                case R.id.key9:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "9"));
                    pin02.requestFocus();
                    break;
                case R.id.key0:
                    pin01.setText(pin01.getText().insert(pin01.getText().length(), "0"));
                    pin02.requestFocus();
                    break;

                case R.id.keyClear:
                    pin01.getText().clear();
                    break;
            }
        } else if (pin02.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "1"));
                    pin03.requestFocus();
                    break;
                case R.id.key2:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "2"));
                    pin03.requestFocus();
                    break;
                case R.id.key3:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "3"));
                    pin03.requestFocus();
                    break;
                case R.id.key4:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "4"));
                    pin03.requestFocus();
                    break;
                case R.id.key5:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "5"));
                    pin03.requestFocus();
                    break;

                case R.id.key6:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "6"));
                    pin03.requestFocus();
                    break;
                case R.id.key7:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "7"));
                    pin03.requestFocus();
                    break;
                case R.id.key8:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "8"));
                    pin03.requestFocus();
                    break;
                case R.id.key9:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "9"));
                    pin03.requestFocus();
                    break;
                case R.id.key0:
                    pin02.setText(pin02.getText().insert(pin02.getText().length(), "0"));
                    pin03.requestFocus();
                    break;

                case R.id.keyClear:
                    pin02.getText().clear();
                    pin01.requestFocus();
                    break;
            }

        } else if (pin03.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "1"));
                    pin04.requestFocus();
                    break;
                case R.id.key2:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "2"));
                    pin04.requestFocus();
                    break;
                case R.id.key3:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "3"));
                    pin04.requestFocus();
                    break;
                case R.id.key4:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "4"));
                    pin04.requestFocus();
                    break;
                case R.id.key5:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "5"));
                    pin04.requestFocus();
                    break;

                case R.id.key6:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "6"));
                    pin04.requestFocus();
                    break;
                case R.id.key7:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "7"));
                    pin04.requestFocus();
                    break;
                case R.id.key8:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "8"));
                    pin04.requestFocus();
                    break;
                case R.id.key9:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "9"));
                    pin04.requestFocus();
                    break;
                case R.id.key0:
                    pin03.setText(pin03.getText().insert(pin03.getText().length(), "0"));
                    pin04.requestFocus();
                    break;

                case R.id.keyClear:
                    pin03.getText().clear();
                    pin02.requestFocus();
                    break;
            }

        } else if (pin04.isFocused()) {

            switch (view.getId()) {

                case R.id.key1:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "1"));
                    break;
                case R.id.key2:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "2"));
                    break;
                case R.id.key3:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "3"));
                    break;
                case R.id.key4:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "4"));
                    break;
                case R.id.key5:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "5"));
                    break;

                case R.id.key6:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "6"));
                    break;
                case R.id.key7:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "7"));
                    break;
                case R.id.key8:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "8"));
                    break;
                case R.id.key9:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "9"));
                    break;
                case R.id.key0:
                    pin04.setText(pin04.getText().insert(pin04.getText().length(), "0"));
                    break;

                case R.id.keyClear:
                    pin04.getText().clear();
                    pin03.requestFocus();
                    break;
            }

        }

        switch (view.getId()) {

            case R.id.keyEnter:
                //code for enter goes here
                break;

        }

    }
}
