package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chipotle_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chipotle_menu);

        Button butt12 = findViewById(R.id.button12);
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChipotle();
            }
        });

        Button butt10 = findViewById(R.id.button10);
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openChipotle() {
        Intent intent = new Intent(this, chipotle_page.class);
        startActivity(intent);
    }
}
