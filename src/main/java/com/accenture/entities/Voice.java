package com.accenture.entities;


public class Voice {
	private String speech;
	private String text;
	
	public Voice() {
	}

	public Voice(String speech, String text) {
		super();
		this.speech = speech;
		this.text = text;
	}
	
	public String getSpeech() {
		return speech;
	}
	
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	
}
