package com.design.structural.decorator;

public abstract class GameDecorator implements Game{
	protected Game decorateGame;
	
	public GameDecorator(Game decorateGame) {
		this.decorateGame=decorateGame;
	}
	
	public void play() {
		decorateGame.play();
	}
	
}
