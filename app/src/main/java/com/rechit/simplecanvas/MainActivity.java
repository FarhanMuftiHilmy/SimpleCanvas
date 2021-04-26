package com.rechit.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.UNDERLINE_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(), R.color.purple_200, null));
        mPaintText.setTextSize(60);
    }

    public void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth, vHeight, Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(Color.CYAN);


        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(5);
        mCanvas.drawLine(100, 200, 300, 100, mPaint);
        mCanvas.drawLine(300, 100, 500, 200, mPaint);
        mCanvas.drawLine(300, 100, 800, 100, mPaint);
        mCanvas.drawLine(500, 200, 1000, 200, mPaint);
        mCanvas.drawLine(800, 100, 1000, 200, mPaint);

        mPaint.setColor(Color.RED);
        Rect mRect = new Rect();
        mRect.set(100, 200, 500, 400);
        mCanvas.drawRect(mRect, mPaint);

        mPaint.setColor(Color.YELLOW);
        Rect mRect2 = new Rect();
        mRect2.set(250, 250, 350, 400);
        mCanvas.drawRect(mRect2, mPaint);

        mPaint.setColor(Color.YELLOW);
        Rect mRect3 = new Rect();
        mRect3.set(500, 200, 1000, 400);
        mCanvas.drawRect(mRect3, mPaint);

        mPaint.setColor(Color.WHITE);
        mCanvas.drawCircle(200, 275, 35, mPaint);
        mCanvas.drawCircle(400, 275, 35, mPaint);

//        Path path = new Path();
//        path.moveTo(100, 600);
//        path.lineTo(300, 750);
//        path.lineTo(500, 650);
//        path.lineTo(700, 800);
//        mPaint.setColor(Color.MAGENTA);
//        mCanvas.drawPath(path, mPaint);

        Path path2 = new Path();
        path2.moveTo(250, 400);
        path2.lineTo(300, 1900);
        path2.lineTo(900, 1900);
        path2.lineTo(350, 400);
        mPaint.setColor(Color.GRAY);
        mCanvas.drawPath(path2, mPaint);

        mPaintText.setColor(Color.RED);
        mCanvas.drawText("RUMAH HILMY", 550, 300, mPaintText);



        view.invalidate();
    }
}