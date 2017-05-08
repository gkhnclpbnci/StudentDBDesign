package com.gkhnclpbnci.studentdbdesign;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ALTAY on 7.5.2017.
 */

public class StudentAdaptor extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Student> students;

    public StudentAdaptor(Activity activity,List<Student> students){
        this.inflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return  this.students.size();
    }


    @Override
    public Student getItem(int position) {
        return students.get(position);
    }
    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent ){

        View rootView;

        rootView=inflater.inflate(R.layout.student_visualize,null);

        TextView tvNameSurname=(TextView)rootView.findViewById(R.id.tvNameSurname);
        TextView tvAge=(TextView)rootView.findViewById(R.id.tvAge);
        TextView tvGender=(TextView)rootView.findViewById(R.id.tvGender);
        TextView tvClass=(TextView)rootView.findViewById(R.id.tvClass);

        Student student=students.get(position);

        tvNameSurname.setText(student.getName()+" " + student.getSurname());
        tvAge.setText(student.getAge().toString());
        tvGender.setText(student.getGender().toString());
        tvClass.setText(student.getClas().toString());
        return rootView;
    }
}
