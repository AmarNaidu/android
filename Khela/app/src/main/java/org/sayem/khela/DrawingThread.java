package org.sayem.khela;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by syed.sayem on 8/13/15.
 */
public class DrawingThread extends Thread{

    private Canvas canvas;
    private GameView gameView;
    private Context context;
    private boolean threadFlag = false;
    Bitmap backgroundBitmap;
    int displayX, displayY;

    public DrawingThread(GameView gameView, Context context) {
        super();
        this.gameView = gameView;
        this.context = context;
        initializeAll();
    }

    private void initializeAll() {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point displayDimension = new Point();
        defaultDisplay.getSize(displayDimension);
        
        displayX = displayDimension.x;
        displayY = displayDimension.y;
    }

    @Override
    public void run() {
        threadFlag = true;

        while (threadFlag){
            canvas = gameView.surfaceHolder.lockCanvas();
            try {
                synchronized (gameView.surfaceHolder){
                    updateDisplay();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (canvas != null){
                    gameView.surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }

            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateDisplay() {



    }

    public void stopThread(){
        threadFlag = false;
    }
}
