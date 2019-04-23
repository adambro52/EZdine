package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mcdonalds_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdonalds_page);

        Button buttMC6 = findViewById(R.id.buttonMC6);
        buttMC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });

        Button buttMC52 = findViewById(R.id.buttonMC52);
        buttMC52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMcdonaldsMenu();
            }
        });

        Button buttMC99 = findViewById(R.id.buttonMC99);
        buttMC99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddReview();
            }
        });
    }

    public void openMcdonaldsMenu() {
        Intent intent = new Intent(this, mcdonalds_menu.class);
        startActivity(intent);
    }

    public void openReview() {
        Intent intent = new Intent(this, mcdonalds_review.class);
        startActivity(intent);
    }

    public void openAddReview() {
        Intent intent = new Intent(this, add_review.class);
        startActivity(intent);
    }
}
