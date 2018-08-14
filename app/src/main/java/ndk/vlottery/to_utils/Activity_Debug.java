package ndk.vlottery.to_utils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import tech.linjiang.pandora.Pandora;

import ndk.vlottery.R;

public class Activity_Debug extends AppCompatActivity {

    Button button_pandora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        button_pandora =(Button)findViewById(R.id.button_pandora);
        button_pandora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pandora.get().open();
            }
        });
    }
}
