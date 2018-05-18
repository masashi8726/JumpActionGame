package jp.techacademy.masashi.muto.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Enemy extends Sprite {
    public static final float ENEMY_WIDTH = 1.5f;
    public static final float ENEMY_HEIGHT = 0.8f;

    public static final int ENEMY_EXIST = 0;
    public static final int ENEMY_NONE = 1;

    int mState;

    public Enemy(Texture texture, int srcX,int srcY, int srcWidth, int srcHeight)  {
        super(texture, srcX, srcY,srcWidth,srcHeight);
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT);
        mState = ENEMY_EXIST;
    }

    public void get() {
        mState = ENEMY_NONE;
        setAlpha(0);
    }
}
