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
	
	@Test
	public void testSingleFrameScore() {
		//
		
		//act
		tFrame.addFrame(4,6);
		
		//assert
		assertEquals(10,tFrame(score));
	}
	
	

}
