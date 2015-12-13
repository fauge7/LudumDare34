package com.fauge.games.twobuttontakeover.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.fauge.games.twobuttontakeover.homelessLevel.Car;

public class GameScreen implements Screen {

	Game game;
	SpriteBatch batch;
	Viewport view;
	OrthographicCamera cam;
	Texture bg;
	Car car;
	public GameScreen(Game game, SpriteBatch batch) {
		// TODO Auto-generated constructor stub
		this.game = game;
		this.batch = batch;
		cam = new OrthographicCamera(720, 512);
		view = new StretchViewport(720, 512, cam);
		cam.position.set(view.getWorldWidth()/2, view.getWorldHeight()/2, 0);
		cam.update();
		car = new Car(720/2, 512/2, true);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		bg = new Texture(Gdx.files.internal("backgroundRoad.png"));
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		cam.update();
		batch.setProjectionMatrix(cam.combined);
		batch.begin();
		batch.draw(bg, 0, 0);
		car.update().draw(batch);
		batch.end();
		

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
