package com.example.s10203953;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public class User{
        //Attr
        String name;
        String description;
        int id;
        boolean followed;
        //Constructor
        public User(String n,String des,int ID,boolean Followed){
            name = n;
            description = des;
            id = ID;
            followed = Followed;
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User u1 = new User("Name","Description",01,false);
        if (u1.followed == true){
            Button b1 = findViewById(R.id.follow);
            b1.setText("Unfollow");
        }
    }

    public void anyName(View v){
        //Event handler
        Button b1 = findViewById(R.id.follow);
        String text = b1.getText().toString();//Text of follow button
        if (text == "Follow"){
            b1.setText("Unfollow");
        }
        else{
            b1.setText("Follow");
        }
    }
}