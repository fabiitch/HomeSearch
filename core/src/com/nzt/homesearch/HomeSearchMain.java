package com.nzt.homesearch;

import com.nzt.gdx.archi.AbstractMain;
import com.nzt.gdx.assets.AbstractAssetsManager;
import com.nzt.gdx.screen.manager.AbstractScreenManager;
import com.nzt.homesearch.assets.AssetsManager;
import com.nzt.homesearch.manager.ScreenManager;

public class HomeSearchMain extends AbstractMain {

	@Override
	public void doCreate() {
	}

	@Override
	public AbstractAssetsManager createAssetsManager() {
		
		return new AssetsManager();
	}

	@Override
	public AbstractScreenManager createScreenManager() {
		return ScreenManager.instance;
	}

}
