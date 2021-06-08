package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        this.setTitle("ArrayList");
        tv = findViewById(R.id.textView);

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String text = "Fruits\n";
        text += "=====\n";

        for (int i = 0; i < fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);
    }
}