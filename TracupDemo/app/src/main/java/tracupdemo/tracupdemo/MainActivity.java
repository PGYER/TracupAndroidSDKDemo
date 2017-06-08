package tracupdemo.tracupdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.tracup.library.Tracup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.email_required_yes)
    RadioButton emailRequiredYes;
    @BindView(R.id.email_required_no)
    RadioButton emailRequiredNo;
    @BindView(R.id.email_visible_yes)
    RadioButton emailVisibleYes;
    @BindView(R.id.email_visible_no)
    RadioButton emailVisibleNo;
    @BindView(R.id.sound_yes)
    RadioButton soundYes;
    @BindView(R.id.sound_no)
    RadioButton soundNo;
    @BindView(R.id.message_reminder_yes)
    RadioButton messageReminderYes;
    @BindView(R.id.message_reminder_no)
    RadioButton messageReminderNo;
    @BindView(R.id.seekBar)
    SeekBar seekBar;
    @BindView(R.id.show_message_btn)
    Button showMessageBtn;
    @BindView(R.id.shake_threshold_value)
    TextView shakeThresholdValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        shakeThresholdValue.setText(Tracup.getInstance().getShakingThreshold()+"");

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                this.progress = progress + 50;
                shakeThresholdValue.setText(this.progress+"");
                Tracup.getInstance().setShakingThreshold(this.progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    @OnClick({R.id.email_required_yes, R.id.email_required_no, R.id.email_visible_yes, R.id.email_visible_no, R.id.sound_yes, R.id.sound_no, R.id.message_reminder_yes, R.id.message_reminder_no, R.id.show_message_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.email_required_yes:
                Tracup.getInstance().setEmailFiledRequied(true);
                break;
            case R.id.email_required_no:
                Tracup.getInstance().setEmailFiledRequied(false);
                break;
            case R.id.email_visible_yes:
                Tracup.getInstance().setEmailFiledVisibility(true);
                break;
            case R.id.email_visible_no:
                Tracup.getInstance().setEmailFiledVisibility(false);
                break;
            case R.id.sound_yes:
                Tracup.getInstance().setShouldPlaySounds(true);
                break;
            case R.id.sound_no:
                Tracup.getInstance().setShouldPlaySounds(false);
                break;
            case R.id.message_reminder_yes:
                Tracup.getInstance().setIntroMessageenabled(true);
                break;
            case R.id.message_reminder_no:
                Tracup.getInstance().setIntroMessageenabled(false);
                break;
            case R.id.show_message_btn:
                Tracup.showIntrMessage(this);
                break;
        }
    }
}
