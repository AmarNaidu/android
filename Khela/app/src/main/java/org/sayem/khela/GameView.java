package org.sayem.khela;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by syed.sayem on 8/13/15.
 */
public class GameView extends SurfaceView implements SurfaceHolder.Callback{

    Context context;
    SurfaceHolder surfaceHolder;
    DrawingThread drawingThread;

    public GameView(Context context) {
        super(context);
        this.context = context;
        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        drawingThread = new DrawingThread(this, context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
