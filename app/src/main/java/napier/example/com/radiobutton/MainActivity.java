package napier.example.com.radiobutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import napier.example.com.radiobutton.activities.HopewellRocksFacts;
import napier.example.com.radiobutton.activities.NiagaraFallsFacts;
import napier.example.com.radiobutton.activities.ParliamentHillFacts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton1);
        rb1.setOnClickListener(radioGroupClick);
        RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb2.setOnClickListener(radioGroupClick);
        RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb3.setOnClickListener(radioGroupClick);
    }
    private View.OnClickListener radioGroupClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ImageView imageView = (ImageView)findViewById(R.id.imageView);
            Intent intent = new Intent();
            switch (v.getId()){
                case R.id.radioButton1: intent =
                        new Intent(MainActivity.this, HopewellRocksFacts.class);
                    break;
                case R.id.radioButton2: intent =
                        new Intent(MainActivity.this, NiagaraFallsFacts.class);
                    break;
                case R.id.radioButton3: intent =
                        new Intent(MainActivity.this, ParliamentHillFacts.class);
                    break;
            }
            startActivity(intent);
            RadioButton rb = (RadioButton)v;
            Toast.makeText(MainActivity.this,rb.getText(), Toast.LENGTH_LONG).show();
        }
    };
}
