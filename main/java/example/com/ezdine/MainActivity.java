package example.com.ezdine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt = findViewById(R.id.button52);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchResult();
            }
        });

        Button butt2 = findViewById(R.id.button2);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddReview();
            }
        });

        Button butt3 = findViewById(R.id.button3);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavs();
            }
        });

        Button butt4 = findViewById(R.id.button4);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });

    }

    public void openSearchResult() {
        Intent intent = new Intent(this, search_result.class);
        startActivity(intent);
    }

    public void openProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void openFavs() {
        Intent intent = new Intent(this, FavPlaces.class);
        startActivity(intent);
    }

    public void openAddReview() {
        Intent intent = new Intent(this, add_review.class);
        startActivity(intent);
    }
}

