package org.sayem.khela;

import android.content.Context;
import android.graphics.Canvas;

/**
 * Created by syed.sayem on 8/13/15.
 */
public class DrawingThread extends Thread{

    private Canvas canvas;
    private GameView gameView;
    private Context context;
    private boolean threadFlag = false;

    public DrawingThread(GameView gameView, Context context) {
        super();
        this.gameView = gameView;
        this.context = context;
        initializeAll();
    }

    private void initializeAll() {


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

                }
            }
        }
    }

    private void updateDisplay() {


    }

    public void stopThread(){
        threadFlag = false;
    }
}
