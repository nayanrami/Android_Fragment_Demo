package in.ac.adit.mad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fragmentBtn1;
    Button fragmentBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentBtn1 = findViewById(R.id.fragmentBtn1);
        fragmentBtn2 = findViewById(R.id.fragmentBtn2);


        fragmentBtn1.setOnClickListener(v->{
            replaceFragment(new Fragment1());
        });

        fragmentBtn2.setOnClickListener(v->{
            replaceFragment(new Fragment2());
        });
    }

    private void replaceFragment(Fragment fragment1) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment1);
        fragmentTransaction.commit();


    }
}