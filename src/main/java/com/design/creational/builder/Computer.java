package com.design.creational.builder;

public class Computer {
	private final String cpu;
	private final String ram;
	private final String hardDisk;
	private final String monitor;
	private final String dvdPlayer;
	private final String keyboard;
	private final String mouse;
	private final String speakers;
	
	private Computer(ComputerBuilder builder) {
		this.cpu= builder.cpu;
		this.ram= builder.ram;
		this.hardDisk= builder.hardDisk;
		this.monitor= builder.monitor;
		this.dvdPlayer= builder.dvdPlayer;
		this.keyboard= builder.keyboard;
		this.mouse= builder.mouse;
		this.speakers= builder.speakers;
	}
	
	//All getter, and NO setter to provide immutability
	public String getCpu() {
		return cpu;
	}
	public String getRam() {
		return ram;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public String getMonitor() {
		return monitor;
	}
	public String getDvdPlayer() {
		return dvdPlayer;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public String getSpeakers() {
		return speakers;
	}

	public static class ComputerBuilder{
		private final String cpu;
		private final String ram;
		private final String hardDisk;
		private String monitor;
		private String dvdPlayer;
		private String keyboard;
		private String mouse;
		private String speakers;
		
		public ComputerBuilder(String cpu, String ram, String hardDisk){
			this.cpu= cpu;
			this.ram= ram;
			this.hardDisk= hardDisk;
		}
		
		public ComputerBuilder monitor(String monitor) {
			this.monitor= monitor;
			return this;
		}
		public ComputerBuilder dvdPlayer(String dvdPlayer) {
			this.monitor= dvdPlayer;
			return this;
		}
		public ComputerBuilder keyboard(String keyboard) {
			this.monitor= keyboard;
			return this;
		}
		public ComputerBuilder mouse(String mouse) {
			this.monitor= mouse;
			return this;
		}
		public ComputerBuilder speakers(String speakers) {
			this.monitor= speakers;
			return this;
		}
		
		//Return the finally constructed Computer object
		public Computer build() {
			Computer computer = new Computer(this);
			checkComputer(computer);
			return computer;
		}
		
		private void checkComputer(Computer computer) {
	        //Do some basic validations to check computer.
	    }
	}
}
