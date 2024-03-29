package com.basv.gifmoviewview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.basv.gifmoviewview.widget.GifMovieView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GifMovieView gif1 = new GifMovieView(this);
		gif1.setMovieResource(R.drawable.gif_heart);
		setContentView(gif1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onGifClick(View v) {
		GifMovieView gif = (GifMovieView) v;
		gif.setPaused(!gif.isPaused());
	}

}
