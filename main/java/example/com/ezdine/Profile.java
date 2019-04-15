package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button butt34 = findViewById(R.id.button34);
        butt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });

        Button butt13 = findViewById(R.id.button13);
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavs();
            }
        });

        Button butt14 = findViewById(R.id.button14);
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReview();
            }
        });
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openFavs() {
        Intent intent = new Intent(this, FavPlaces.class);
        startActivity(intent);
    }

    public void openReview() {
        Intent intent = new Intent(this, chipotle_review.class);
        startActivity(intent);
    }
}
