package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chipotle_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chipotle_page);

        Button butt6 = findViewById(R.id.button6);
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });

        Button butt52 = findViewById(R.id.button52);
        butt52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChipotleMenu();
            }
        });

        Button butt99 = findViewById(R.id.button99);
        butt99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddReview();
            }
        });
    }

    public void openChipotleMenu() {
        Intent intent = new Intent(this, chipotle_menu.class);
        startActivity(intent);
    }

    public void openReview() {
        Intent intent = new Intent(this, chipotle_review.class);
        startActivity(intent);
    }

    public void openAddReview() {
        Intent intent = new Intent(this, add_review.class);
        startActivity(intent);
    }
}
