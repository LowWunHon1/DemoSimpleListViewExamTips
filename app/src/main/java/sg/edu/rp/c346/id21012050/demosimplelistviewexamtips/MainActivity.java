package sg.edu.rp.c346.id21012050.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ArrayList<String> examTipsArray;
    ArrayAdapter<String> mainExamTips;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);
        btn = findViewById(R.id.button);

        examTipsArray = new ArrayList<>();
        examTipsArray.add("Don't just read the code, code it as much as possible during each practical session");
        examTipsArray.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        examTipsArray.add("Prepare your template source code for each topic");
        examTipsArray.add("Create a few empty Android projects to speed up your coding during the exam");
        examTipsArray.add("Ensure that your Android Studio is up and running before the exam");

        mainExamTips = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, examTipsArray);

        lvExamTips.setAdapter(mainExamTips);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                examTipsArray.add("Revise through your works");
                mainExamTips.notifyDataSetChanged();
            }
        });
    }
}