package in.ac.adit.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import java.net.URI;

public class IntentDemo extends AppCompatActivity {

    Button intentBtn1;
    Button intentBtn2;

    Intent intent = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);

        intentBtn1 = findViewById(R.id.intentBtn1);
        intentBtn2 = findViewById(R.id.intentBtn2);

        intentBtn1.setOnClickListener(view -> {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://adit.ac.in"));
            startActivity(intent);
        });

        intentBtn2.setOnClickListener(view -> {
            intent = new Intent(IntentDemo.this, MainActivity.class);
            startActivity(intent);
        });
    }
}