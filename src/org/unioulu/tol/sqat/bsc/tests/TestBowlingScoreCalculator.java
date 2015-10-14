package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;


public class TestBowlingScoreCalculator {

	Frame tFrame;
	BowlingGame tBowlingGame;
	
	@Before
	public void setup(){
		tFrame = new Frame(0, 0);
	}
	
	/*
	@Test
	public void testSingleFrameScore() {
		//act
		tFrame.addFrame(tFrame);
		
		//assert
		assertEquals(10,tFrame(score));
	}
	*/
	
	@Test
	public void testIsStrike() {
		//act
		if(tFrame.getFirstThrow() >= 10)
		//assert
		assertEquals(true,false);
	}
	
	@Test
	public void testIsSpare() {
		//act
		if(tFrame.getFirstThrow() + tFrame.getSecondThrow() >= 10)
		//assert
		assertEquals(true,false);
	}

}
