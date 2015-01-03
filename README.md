# OpenGL ES Engine

###### Introduction

In the introductory project it is shown how to set-up and write a very basic OpenGL ES 2.0 context within Android application. The used language is Java throughout whole lesson.

The actual code is straight forward, so let me explain it here a little bit.

###### MainActivity.java

This class is the main activity which is showed to the user. There is one private member:
```GLSurfaceView mGLView```

The GLSurfaceView is a (view) class that allows us to draw into the surface using OpenGL ES. For this class we create a sub-class (see below) that does the rendering we actually want.

Inside create method for activity we instatiate new sub-class of GLSurfaceView and set it as content view (so that all we are going to see is just the surface with OpenGL ES context.

###### MyGLRenderView.java

The class derives from GLRenderView class and all that is needed to do here is: setup some parameters. First the OpenGL ES version is selected, followed by setting the renderer (which is an instance of our own Renderer class- see below), and we set Render mode.

The render mode is important here, there are 2 common values that you are going to see in most of the OpenGL ES applications:

1. ```RENDERMODE_WHEN_DIRTY``` saves battery and re-draws the screen only when necessary (when render context is created or when requestRender() is called)
2. ```RENDERMODE_CONTINUOSLY``` re-draws the frame whenever we can, which is useful for games and animations
 
###### MyRenderer.java

Is the class where we do the actual OpenGL ES rendering. There are three overriden methods.

1. ```onDrawFrame``` is called each time we request frame rendering
2. ```onSurfaceChanged``` is called each time surface resolution has changed (rotating screen or start for example)
3. ```onSurfaceCreated``` is called just only time, when the surface for rendering is created (e.g. start only)
 
###### Summary

While there is nothing really drawn into the viewport after the introductory part, it shows some important concepts behind Android & OpenGL ES rendering.

Be sure to check the next part of adventures in Android and OpenGL ES, where there is going to be something put on the screen.
