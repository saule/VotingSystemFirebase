package plant.kz.aygolek.votingsystem.VotingSystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import plant.kz.aygolek.votingsystem.R;

public class MainActivity extends AppCompatActivity {

    private EditText votingTopicText;
    private EditText textOption1;
    private EditText textOption2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        votingTopicText = findViewById(R.id.votingTopic);
        textOption1 = findViewById(R.id.option1);
        textOption2 = findViewById(R.id.option2);


    }

    public void createVotingTopic(View view){
        String votingTopic = votingTopicText.getText().toString();
        String option1 = textOption1.getText().toString();
        String option2 = textOption2.getText().toString();
        Toast.makeText(this,"submitted" + votingTopic+" " + option1+option2,Toast.LENGTH_LONG).show();
    }
}
