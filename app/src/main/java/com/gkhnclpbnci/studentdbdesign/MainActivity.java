package com.gkhnclpbnci.studentdbdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();
    StudentAdaptor studentAdaptor;

    StudentDBContext studentDBContext;

    int selectedEmployeePosition = 0;

    ListView lvStudent;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=(Button)findViewById(R.id.btn_add);
       /* lvStudent = (ListView) findViewById(R.id.liste);
        lvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selectedEmployeePosition = position;
                //updateBoxesBySelectedEmployee();
            }
        });

        this.studentDBContext = new StudentDBContext(getApplicationContext());

        this.updateListViewContent();*/

    }
   /* private void updateListViewContent(){
        students = studentDBContext.GetAllStudents();

        studentAdaptor = new StudentAdaptor(this,students);

        lvStudent.setAdapter(studentAdaptor);
    }*/

    public void Add(View view) {
        Intent intent = new Intent(MainActivity.this, AddActivity.class);

        startActivity(intent);

    }
}
