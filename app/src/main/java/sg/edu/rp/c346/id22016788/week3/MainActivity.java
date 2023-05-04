package sg.edu.rp.c346.id22016788.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tgtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tgtn = findViewById(R.id.toggleButtonEnabled);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tgtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //-	disable the EditText, editTextInput when the toggle button is unchecked
                //-	enable it when it is checked
                boolean isChecked = tgtn.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }









            }
        });


    }
}