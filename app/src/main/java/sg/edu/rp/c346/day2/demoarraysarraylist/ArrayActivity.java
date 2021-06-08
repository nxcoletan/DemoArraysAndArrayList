package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ArrayActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        tv = findViewById(R.id.textView1);

        String[] fruits = new String[3];
        fruits[0]="";
        fruits[1]="";
        fruits[2]="";

        String msg = "";
        for (int i = 0; i < fruits.length; i ++){
            msg += fruits[i] + "\n";
        }

        System.out.println(msg);

    }
}