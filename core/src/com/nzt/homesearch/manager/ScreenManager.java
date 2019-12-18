package com.nzt.homesearch.manager;

import com.nzt.gdx.screen.manager.AbstractScreenManager;
import com.nzt.homesearch.HomeSearchMain;
import com.nzt.homesearch.assets.AssetsManager;
import com.nzt.homesearch.screen.MapsScreen;

public class ScreenManager extends AbstractScreenManager {

	public static ScreenManager instance = new ScreenManager();


	@Override
	public void doStartApplication() {
		this.assetsManager = new AssetsManager();
	}

	@Override
	protected void afterSplashScreen() {
		setScreen(new MapsScreen(mainClass));
	}

	@Override
	protected void doPause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doResume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doResize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doDispose() {
		// TODO Auto-generated method stub
		
	}

}
