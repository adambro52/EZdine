package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class search_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Button butt = findViewById(R.id.button5);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChipotle();
            }
        });

        Button butt21 = findViewById(R.id.button21);
        butt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
    }

    public void openChipotle() {
        Intent intent = new Intent(this, chipotle_page.class);
        startActivity(intent);
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
