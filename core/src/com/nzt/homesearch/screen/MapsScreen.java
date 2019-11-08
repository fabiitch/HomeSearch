package com.nzt.homesearch.screen;

import com.badlogic.gdx.graphics.Texture;
import com.nzt.gdx.archi.AbstractMain;
import com.nzt.gdx.screen.BaseScreen;

public class MapsScreen extends BaseScreen {

	Texture img;
	public MapsScreen(AbstractMain main) {
		super(main);
		img = new Texture("badlogic.jpg");
	}

	@Override
	protected void renderScreen(float dt) {
		sb.begin();
		sb.draw(img, 0, 0);
		sb.end();
	}
	
	@Override
	public void dispose () {
		img.dispose();
	}
}
