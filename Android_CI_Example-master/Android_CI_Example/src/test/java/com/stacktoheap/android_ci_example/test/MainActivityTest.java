package com.stacktoheap.android_ci_example.test;

import android.widget.Button;
import android.widget.EditText;

import com.stacktoheap.android_ci_example.MainActivity;
import com.stacktoheap.android_ci_example.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.fest.assertions.api.ANDROID.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void shouldNotBeNull() {
        assertThat(activity).isNotNull();
    }

    @Test
    public void shouldHaveEditText() {
        EditText editText = (EditText) activity.findViewById(R.id.edit_message);
        assertThat(editText).isNotNull();
    }

    @Test
    public void shouldHaveSendButton() {
        Button button = (Button) activity.findViewById(R.id.send_button);
        assertThat(button).isNotNull();
    }
}