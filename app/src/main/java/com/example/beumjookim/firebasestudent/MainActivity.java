package com.example.beumjookim.firebasestudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    public class Student(){

        private String name;

        public String getName(){
            return name;
        }
        public void setName(String newName){
            name = newName;
        }
        public String getStudentId(){
            return studentId;
        }
        public void setStudentId(String id){
            studentId = id;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase myFirebaseRef = new Firebase("https://danielkim-cse110.firebaseio.com/student");
        Firebase.setAndroidContext(this);     // other setup code
        setContentView(R.layout.activity_main);
    }
    public void onClickBtn(View v){
        Student student = new Student();
        student.setName(name);
        student.setStudentId(id); myFirebaseRef.child(student.getStudentId()).setValue(student);
    }


}
