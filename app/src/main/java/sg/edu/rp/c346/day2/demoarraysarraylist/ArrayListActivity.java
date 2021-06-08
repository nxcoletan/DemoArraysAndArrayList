package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String msg = "";
        for (int i = 0; i < fruits.size(); i++){
            msg += fruits.get(i) + "\n";
        }
        System.out.println(msg);
    }
}