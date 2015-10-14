package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	//the score of a single frame
	public int score(){
		int score = firstThrow + secondThrow;
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		// if firstThrow >=10, return true
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//if firstThrow + secondThrow >=10, return true
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//if framecounter >=10 return true
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
	
	

}
