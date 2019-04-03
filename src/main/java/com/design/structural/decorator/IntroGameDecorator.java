package com.design.structural.decorator;

public class IntroGameDecorator extends GameDecorator {

	public IntroGameDecorator(Game decorateGame) {
		super(decorateGame);
	}

	@Override
	public void play() {
		addingIntro();
		decorateGame.play();
	}

	private void addingIntro() {
		System.out.println("Adding game introduction..");		
	}
}
