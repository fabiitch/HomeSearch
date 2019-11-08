package com.nzt.homesearch;

import java.util.Observable;
import java.util.Observer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net.HttpMethods;
import com.badlogic.gdx.Net.HttpRequest;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nzt.gdx.net.AutoProxy;
import com.nzt.gmaps.GMaps;
import com.nzt.gmaps.TextureDownloader;

import NztGMaps.NzMapsLib;

public class HomeSearchMain extends ApplicationAdapter implements Observer {
	SpriteBatch batch;
	Texture img;
	NzMapsLib z;
	
	@Override
	public void create () {
		AutoProxy.init();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		
		TextureDownloader tDow = new TextureDownloader();
		tDow.addObserver(this);
//		tDow.downloadImage(url);
		
	GMaps.geoLocate();
		
//		https://www.googleapis.com/geolocation/v1/geolocate?key=YOUR_API_KEY
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("finish dowload image");
		
	}
}
