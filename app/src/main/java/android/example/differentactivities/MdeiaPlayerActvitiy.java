package android.example.differentactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MdeiaPlayerActvitiy extends AppCompatActivity {

    Button plyBtn;
    Button pauseBtn;

    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdeia_player_actvitiy);

        mediaPlayer = MediaPlayer.create(this, R.raw.audio);

        plyBtn = findViewById(R.id.plyBtn);
        pauseBtn = findViewById(R.id.pauseBtn);

        plyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MdeiaPlayerActvitiy.this, "I am done!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
    }
}