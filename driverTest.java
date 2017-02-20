//Zach Romitz CS 1632 Deliverable 2

import org.junit.Test;
import static org.junit.Assert.*;

//This class tests the Myrandom for faults

public class driverTest {

    
   	
   	//This test makes sure that the start location is being updated properly
    //Any failure to update the start location and the program fails to run

    @Test
    public void teststartlocatoin() {
    driver bob = new driver(1);
    assertEquals(bob.setstartlocation("Testing"), "Testing");
    }

    //This test makes sure that the start location is being updated properly
    //Any failure to update the start location and the program fails to run
    //Testing with an input of "50"

    @Test
    public void teststartlocatoinwithint() {
    driver bob = new driver(1);
    assertEquals(bob.setstartlocation("50"), "50");
    }

   
    //TEsting to make sure that the program updates the string and returns 0;
    //Only 0 should be returned here
    @Test
    public void testupdatelocation() {
    driver bob = new driver(1);
    assertEquals(bob.updatelocation("Testing"), 0);
    }

      //TEsting to make sure that the program updates the string and returns 0;
    //Only 0 should be returned here
    @Test
    public void testupdatelocationsennott() {
    driver bob = new driver(1);
    assertEquals(bob.updatelocation("Sennott"), 0);
    }

    //Testing the funciont properly reconizes the Outside City string and returns 1.
    @Test
    public void testupdatelocationoutside() {
    driver bob = new driver(1);
    assertEquals(bob.updatelocation("Outside City"), 1);
    }

    //Testing that the function properly updates the string.
    //then ensuring that the new string is returned form getlocaiton
    @Test
    public void testgetlocatoin() {
    driver bob = new driver(1);
    bob.updatelocation("This is only a test");
    assertEquals(bob.getlocation(), "This is only a test");
    }

    //Testing that the Driver number is correclty returned.
    //This is testing that initialized with 4 it will return 4
    @Test
    public void testgetid() {
    driver bob = new driver(4);
    assertEquals(bob.getid(), 4);
    }

    //This test makes sure that Sennott is being reconized properly 
    //and the meetings with Laboon are updated on each visit.
    //Updated 3 times should result in 3 being returned on getsennot
    @Test
    public void testsennotupdate() {
    driver bob = new driver(1);
    bob.updatelocation("Sennott");
    bob.updatelocation("Hillman");
    bob.updatelocation("Sennott");
    bob.updatelocation("Sennott");
    assertEquals(bob.getsennot(), 3);
    }
    
}