package com.example.knightlife;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private String course;

    public MainActivity (){
        course = "chemistry";
    }
    public String returnCourse(){
        return course;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener OnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_Today:
                    mTextMessage.setText(R.string.title_schedule);
                    setContentView(R.layout.today);
                    return true;
                case R.id.navigation_Upcoming:
                    mTextMessage.setText(R.string.title_upcoming);
                    setContentView(R.layout.upcoming);
                    return true;
                case R.id.navigation_Settings:
                    mTextMessage.setText(R.string.title_settings);
                    setContentView(R.layout.settings);
                    return true;
            }
            return false;
        }

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.today);
        setTitle("Today");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button mButton = findViewById(R.id.button4);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, com.example.knightlife.Button.class));
            }
        });

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        final TextView Block1 = findViewById(R.id.block1);
        final TextView Block2 = findViewById(R.id.block2);
        final TextView Block3 = findViewById(R.id.block3);
        final TextView Block4 = findViewById(R.id.block4);
        final TextView Block5 = findViewById(R.id.block5);
        final TextView Block6 = findViewById(R.id.block6);
        final TextView Block7 = findViewById(R.id.block7);
        final TextView Block8 = findViewById(R.id.block8);
        final TextView Block1lab = findViewById(R.id.block1_lab);
        final TextView Block2lab = findViewById(R.id.block2_lab);
        final TextView Block3lab = findViewById(R.id.block3_lab);
        final TextView Block4lab = findViewById(R.id.block4_lab);
        final TextView Block5lab = findViewById(R.id.block5_lab);
        final TextView Block6lab = findViewById(R.id.block6_lab);
        final TextView Block7lab = findViewById(R.id.block7_lab);
        final TextView Block8lab = findViewById(R.id.block8_lab);
        final TextView Morning = findViewById(R.id.morningblock);
        final TextView Activities = findViewById(R.id.activities);
        final TextView Block = findViewById(R.id.Block);


        Block.setText(R.string.Thursday);


//        switch (day) {
//            case Calendar.MONDAY:
//                Block1.setText(R.string.D_Block);
//                Block2.setText(R.string.B_Block);
//                Block2lab.setVisibility(View.VISIBLE);
//                Block2lab.setText(R.string.B_Lab);
//                Block3.setText(R.string.F_Block);
//                Block4.setText(R.string.Lunch);
//                Block5.setText(R.string.A_Block);
//                Block6.setText(R.string.X_Block);
//                Block7.setText(R.string.C_Block);
//                Block8.setText(R.string.G_Block);
//                Morning.setText(R.string.Monday);
//                break;
//
//
//            case Calendar.TUESDAY:
//                Block1.setText(R.string.E_Block);
//                Block2.setText(R.string.C_Block);
//                Block2lab.setVisibility(View.VISIBLE);
//                Block2lab.setText(R.string.C_Lab);
//                Block3.setText(R.string.D_Block);
//                Block4.setText(R.string.Lunch);
//                Block5.setText(R.string.B_Block);
//                Block6.setText(R.string.X_Block);
//                Block7.setText(R.string.F_Block);
//                Block7lab.setVisibility(View.VISIBLE);
//                Block7lab.setText(R.string.F_Lab);
//                Block8.setText(R.string.A_Block);
//                Morning.setText(R.string.Tuesday);
//                break;
//
//            case Calendar.WEDNESDAY:
//                Block1.setText(R.string.G_Block);
//                Block2.setText(R.string.E_Block);
//                Block2lab.setVisibility(View.VISIBLE);
//                Block2lab.setText(R.string.E_Lab);
//                Block3.setText(R.string.C_Block);
//                Block4.setText(R.string.Lunch);
//                Block5.setText(R.string.F_Block);
//                Block6.setVisibility(View.GONE);
//                Block7.setVisibility(View.GONE);
//                Block8.setVisibility(View.GONE);
//                Activities.setVisibility(View.VISIBLE);
//                Activities.setText(R.string.Activities);
//                Morning.setText(R.string.Wednesday);
//                break;
//
//            case Calendar.THURSDAY:
//                Block1.setText(R.string.F_Block);
//                Block2.setText(R.string.A_Block);
//                Block2lab.setText(R.string.A_Lab);
//                Block2lab.setVisibility(View.VISIBLE);
//                Block3.setText(R.string.X_Block);
//                Block4.setText(R.string.Lunch);
//                Block5.setText(R.string.G_Block);
//                Block6.setText(R.string.E_Block);
//                Block7.setText(R.string.D_Block);
//                Block7lab.setVisibility(View.VISIBLE);
//                Block7lab.setText(R.string.D_Lab);
//                Block8.setText(R.string.B_Block);
//                Morning.setText(R.string.Thursday);
//                break;
//
//            case Calendar.FRIDAY:
//                Block1.setText(R.string.C_Block);
//                Block2.setText(R.string.G_Block);
//                Block2lab.setVisibility(View.VISIBLE);
//                Block2lab.setText(R.string.G_Lab);
//                Block3.setText(R.string.B_Block);
//                Block3lab.setVisibility(View.GONE);
//                Block4.setText(R.string.Lunch);
//                Block5.setText(R.string.D_Block);
//                Block6.setText(R.string.A_Block);
//                Block7.setText(R.string.E_Block);
//                Block8.setText(R.string.X_Block);
//                Morning.setText(R.string.Friday);
//                break;

//        }


        mTextMessage = (TextView) findViewById(R.id.message);
    }

}


