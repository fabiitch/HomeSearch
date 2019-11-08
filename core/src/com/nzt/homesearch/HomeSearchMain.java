package com.nzt.homesearch;

import com.nzt.gdx.archi.AbstractMain;
import com.nzt.gdx.assets.AbstractAssetsManager;
import com.nzt.homesearch.assets.AssetsManager;
import com.nzt.homesearch.manager.ScreenManager;

public class HomeSearchMain extends AbstractMain {

	@Override
	public void doCreate() {
		ScreenManager.instance.startApplication(this);
	}

	@Override
	public AbstractAssetsManager createAssetsManager() {
		
		return new AssetsManager();
	}

}
