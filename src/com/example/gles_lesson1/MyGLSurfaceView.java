package com.example.gles_lesson1;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * 
 * @author Vilem Otte MyGLSurfaceView is implementation of GLSurfaceView, which
 *         is a widget, into which one can draw using OpenGL ES api.
 * 
 */
public class MyGLSurfaceView extends GLSurfaceView {
	/**
	 * MyGLSurfaceView
	 * 
	 * @param context
	 *            - Activity context Initializes OpenGL ES renderer, sets
	 *            version and render mode
	 */
	public MyGLSurfaceView(Context context) {
		super(context);

		// Set GLES version
		setEGLContextClientVersion(2);

		// Set GLES renderer
		setRenderer(new MyRenderer());

		// Redraw on requestRender()
		setRenderMode(RENDERMODE_WHEN_DIRTY);
	}
}
