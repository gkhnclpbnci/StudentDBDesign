package com.gkhnclpbnci.studentdbdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {


    ArrayList<Student> students = new ArrayList<>();
    StudentAdaptor studentAdaptor;

    StudentDBContext studentDBContext;
    EditText etName,etSurname,etAge;
    Spinner spGender,spClass;
    SeekBar sk_gpa;
    Button add;
    int selectedEmployeePosition = 0;

    ListView lvStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        etName = (EditText) findViewById(R.id.etName);
        etSurname = (EditText) findViewById(R.id.etSurname);
        etAge = (EditText) findViewById(R.id.etAge);
        spClass=(Spinner)findViewById(R.id.spClass);

        spGender = (Spinner) findViewById(R.id.spGender);
        sk_gpa=(SeekBar)findViewById(R.id.sk_gpa);
        add=(Button)findViewById(R.id.btn_add);
      /*  lvStudent = (ListView) findViewById(R.id.liste);
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
  /*  public void updateListViewContent(){
        students = studentDBContext.GetAllStudents();

        studentAdaptor = new StudentAdaptor(this,students);

        lvStudent.setAdapter(studentAdaptor);
    }*/

    public void Add(View view) {

        String name = etName.getText().toString();
        String surname = etSurname.getText().toString();
        Integer age = Integer.parseInt(etAge.getText().toString());

        Integer clas= Integer.valueOf(spClass.getSelectedItem().toString());

        String gender = spGender.getSelectedItem().toString();
        Double gpa= Double.valueOf(sk_gpa.getProgress());
        Student student = new Student(name,surname,age,gender,gpa,clas);

        studentDBContext.AddStudent(student);
        //employees.add(new Employee(name,surname,age,salary,gender));
       // this.updateListViewContent();

    }
}
