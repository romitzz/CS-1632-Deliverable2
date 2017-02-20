//Zach Romitz CS 1632 Deliverable 2

import org.junit.Test;
import static org.junit.Assert.*;

//This class tests the Myrandom for faults

public class MyrandomTest {

    
   	
   	//This test makes sure that the rand12 returns a value greater than 0;
	//This Test should always pass or the program will not run correclty;
	//rand12 will help deterine where the person is going from a destination.	
    @Test
    public void testtheoutputofrandoms12() {
    Myrandom rand = new Myrandom(83);	
	assertTrue(rand.ran12() > 0);
    }

    //Tests that rand12 will produce a value of 2 or less.
    //If a value greater than 2 is made then the program will have an error.
    //rand12 will help deterine where the person is going from a destination.
    @Test
    public void testtheoutputofrandoms12upper() {
    Myrandom rand = new Myrandom(5);	
	assertTrue(rand.ran12() <= 2);
    }

   	//This test makes sure that the rand14 returns a value greater than 0;
	//This Test should always pass or the program will not run correclty;
	//rand14 determines the starting positon of the driver	
    @Test
    public void testtheoutputofrandoms14() {
    Myrandom rand = new Myrandom(68);	
	assertTrue(rand.ran14() > 0);
    }

    //Tests that rand12 will produce a value of 4 or less.
    //If a value greater than 4 is made then the program will default to sennott.
    //rand14 determines the starting position of the driver.
    @Test
    public void testtheoutputofrandoms14upper() {
    Myrandom rand = new Myrandom(5);	
	assertTrue(rand.ran14() <= 4);
    }
    
}