package com.example.gles_lesson1;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * 
 * @author Vilem Otte MainActivity containing just single view - supporting
 *         OpenGL ES drawing.
 * 
 */
public class MainActivity extends Activity {
	private GLSurfaceView mGLView; // OpenGL ES front buffer aka GLSurfaceView

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Create GLES surface view and set it as content of current activity
		mGLView = new MyGLSurfaceView(this);
		setContentView(mGLView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
