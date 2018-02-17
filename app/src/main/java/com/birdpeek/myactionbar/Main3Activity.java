package com.birdpeek.myactionbar;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
//ref https://stackoverflow.com/questions/27354812/android-remove-left-margin-from-actionbars-custom-layout
public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_layout2);
        View view = getSupportActionBar().getCustomView();
        Toolbar parent =(Toolbar) view.getParent();
        parent.setPadding(0,0,0,0);//for tablet otherwise give space in tablet
        parent.setContentInsetsAbsolute(0,0);

        ImageButton imageButton= (ImageButton)view.findViewById(R.id.action_bar_back);
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.linearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
