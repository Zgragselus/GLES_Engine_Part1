package com.example.gles_lesson1;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;

/**
 * 
 * @author Vilem Otte MyRenderer is an implementation of Renderer that actually
 *         renders something into the GLSurfaceView. It calls OpenGL ES methods
 *         allowing hardware accelerated 3D rendering.
 * 
 */
public class MyRenderer implements Renderer {

	/**
	 * onDrawFrame Called each time we redraw view
	 */
	@Override
	public void onDrawFrame(GL10 arg0) {
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	}

	/**
	 * onSurfaceChanged Called if the geometry of the view has been changed
	 */
	@Override
	public void onSurfaceChanged(GL10 arg0, int width, int height) {
		GLES20.glViewport(0, 0, width, height);
	}

	/**
	 * onSurfaceCreated Method called once to set up view of the OpenGL ES
	 * environment
	 */
	@Override
	public void onSurfaceCreated(GL10 arg0, EGLConfig arg1) {
		GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
	}

}
