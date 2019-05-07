package se.juneday.systemetappbasic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        button1 = (Button) findViewById(R.id.buttonJa);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button2 = (Button) findViewById(R.id.buttonNej);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnder20();
            }
        });
    }


    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openUnder20(){

        Uri uri = Uri.parse("https://www.systembolaget.se/under-20/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
//        Intent intent2 = new Intent(this,Under20.class);
//        startActivity(intent2);
    }
}

