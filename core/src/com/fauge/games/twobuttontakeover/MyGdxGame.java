package com.fauge.games.twobuttontakeover;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fauge.games.twobuttontakeover.screens.GameScreen;

public class MyGdxGame extends Game implements ApplicationListener{
	SpriteBatch batch;
	@Override
	public void create () {
		batch = new SpriteBatch();
//		this.setScreen(new MainMenuScreen(this,batch));
		//
		this.setScreen(new GameScreen(this,batch));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}
}
