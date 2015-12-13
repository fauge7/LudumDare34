package com.fauge.games.twobuttontakeover.homelessLevel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class Car {
	
	float x,y,direction;
	public static final float SPEED = 100f;
	Animation anim;
	float animTimer;
	Sprite spr;
	public Car(float x, float y,boolean right) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		if(right)
			direction = 1;
		else
			direction = -1;
		Array<TextureRegion> keyFrames = new Array<TextureRegion>();
		Texture t1 = new Texture("carGreen/g1.png");
		Texture t2 = new Texture("carGreen/g2.png");
		Texture t3 = new Texture("carGreen/g3.png");
		Texture t4 = new Texture("carGreen/g4.png");
		
		keyFrames.add(new TextureRegion(t1));
		keyFrames.add(new TextureRegion(t2));
		keyFrames.add(new TextureRegion(t3));
		keyFrames.add(new TextureRegion(t4));
		spr = new Sprite(new Texture(Gdx.files.internal("carGreen/g1.png")));
		spr.setPosition(x, y);
		anim = new Animation(.03f, keyFrames );
		animTimer = 0;
	}
	public Sprite update(){
		this.x += SPEED * Gdx.graphics.getDeltaTime() * direction;
		animTimer+=Gdx.graphics.getDeltaTime();
		spr.setPosition(x, y);
		spr.setTexture(anim.getKeyFrame(animTimer,true).getTexture());
		return spr;
	}
}
