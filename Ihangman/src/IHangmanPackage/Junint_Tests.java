package IHangmanPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junint_Tests {

	@Test
	void test1() 
	{
		//This is a winning test
		Game game = new Game();
		game.Secret_Word="Egypt";
		game.Re_Initialize();
		game.setMaxWrongGuesses(5);
		game.play('e');
		game.play('g');
		game.play('y');
		game.play('p');
		game.play('t');
		assertEquals(true, game.win);
	}
	@Test
	void test2()
	{
		//This is a winning test
		Game game = new Game();
		game.Secret_Word="Brazil";
		game.Re_Initialize();
		game.setMaxWrongGuesses(3);
		game.play('w');
		game.play('L');
		game.play(']');
		game.play('|');
		game.play('b');
		game.play('r');
		game.play('b');
		game.play('A');
		game.play('Z');
		game.play('L');
		game.play('i');
		assertEquals(true, game.win);
	}
	@Test
	void test3()
	{
		//Winning test case
		Game game = new Game();
		game.Secret_Word="Russia";
		game.Re_Initialize();
		game.play('r');
		game.play('u');
		game.play('s');
		game.play('i');
		game.play('a');
		assertEquals(true, game.win);
	}
	@Test
	void test4() 
	{
		//Loosing test case
	    Exception exception = assertThrows(RuntimeException.class, () -> 
	    {
	    	Game game = new Game();
			game.Secret_Word="Iran";
			game.Re_Initialize();
			game.play('u');
	    });
	    String expectedMessage = "Maximum of trials is reached";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	void test5() 
	{
		//Loosing test case
	    Exception exception = assertThrows(RuntimeException.class, () -> 
	    {
	    	Game game = new Game();
			game.Secret_Word="Morroco";
			game.Re_Initialize();
			game.setMaxWrongGuesses(3);
			game.play('u');
			game.play('u');
			game.play('u');
			game.play('m');
			game.play('o');
			game.play('r');
			game.play('a');
			game.play('Q');
	    });
	    String expectedMessage = "Maximum of trials is reached";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	void test6() 
	{
		//Loosing test case
	    Exception exception = assertThrows(RuntimeException.class, () -> 
	    {
	    	Game game = new Game();
			game.Secret_Word="Korea";
			game.Re_Initialize();
			game.setMaxWrongGuesses(2);
			game.play('K');
			game.play('K');
			game.play('O');
			game.play('O');
			game.play('2');
			game.play('3');
			game.play('l');
			game.play('p');
	    });
	    String expectedMessage = "Maximum of trials is reached";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	void test7()
	{
		//Winning test case
		Game game = new Game();
		game.Secret_Word="Uninted States";
		game.Re_Initialize();
		game.play('u');
		game.play('n');
		game.play('i');
		game.play('t');
		game.play('e');
		game.play('d');
		game.play('s');
		game.play('t');
		game.play('a');
		assertEquals(true, game.win);
	}
}
