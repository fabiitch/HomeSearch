package com.nzt.homesearch.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nzt.homesearch.HomeSearchMain;

public class DesktopLauncher {
	public static void main(String[] arg) {
		// required for HTTPS requests
		System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new HomeSearchMain(), config);
	}
}
