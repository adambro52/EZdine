package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chipotle_review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chipotle_review);

        Button butt87 = findViewById(R.id.button87);
        butt87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChipotle();
            }
        });

        Button butt47 = findViewById(R.id.button47);
        butt47.setOnClickListener(new View.OnClickListener() {
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
