package cn.edu.sdwu.homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void homeworkOne(View view){
        //界面跳转
        Intent intent=new Intent(this,MusicActivity.class);
        startActivity(intent);
    }
    public void homework2(View view){
        Intent intent=new Intent(this,HomeworkActivity2.class);
        startActivity(intent);
    }
}
