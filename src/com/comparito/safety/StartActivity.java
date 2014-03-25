package com.comparito.safety;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

public class StartActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_activity);


			final Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				public void run() {

					Intent intent = new Intent(StartActivity.this,
							MainActivity.class);
					StartActivity.this.startActivity(intent);
					StartActivity.this.finish();
				}
			}, 3000);
		}
}
