package com.xxpodo.avoidgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;

public class View_Img extends View {
    BitmapDrawable Back_Img1 = null;
    BitmapDrawable User = null;

    public View_Img(Context context) {
        super(context);
        Back_Img1 = (BitmapDrawable) context.getResources().getDrawable(R.drawable.background);
        User = (BitmapDrawable) context.getResources().getDrawable(R.drawable.user);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 배경 이미지 그리기
        Back_Img1.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        Back_Img1.draw(canvas);

        // 사용자 이미지 중앙에 그리기
        int userWidth = User.getIntrinsicWidth();
        int userHeight = User.getIntrinsicHeight();
        int userLeft = (canvas.getWidth() - userWidth) / 2;
        int userTop = (canvas.getHeight() - userHeight) / 2;
        User.setBounds(userLeft, userTop, userLeft + userWidth, userTop + userHeight);
        User.draw(canvas);
    }
}