package cn.com.nggirl.ngdemo.launchmode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.com.nggirl.ngdemo.R;

public class LaunchModeSingleTaskB extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode_detail);
        findViewById(R.id.btn_launch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchModeSingleTaskC.start(LaunchModeSingleTaskB.this);
            }
        });
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, LaunchModeSingleTaskB.class));
    }
}
