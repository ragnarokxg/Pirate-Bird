package com.phoenixrizing.PirateBird;

import com.badlogic.gdx.Game;
import com.phoenixrizing.PBHelpers.AssetLoader;
import com.phoenixrizing.Screens.SplashScreen;

public class PBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}