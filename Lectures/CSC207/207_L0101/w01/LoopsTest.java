import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This is a test class.
 * You need to have one test class per class being tested.
 * Within this class, you will have at least one test method per method being tested.
 *  
 * To generate this file, click on the class you would like to test,
 * choose File -> New -> JUnit test case.
 * In the pop-up, click Next rather than Finish so you can choose which 
 * methods you want stubs generated for (you can click on the class name 
 * to select every method in it).
 * 
 * Here is a JUnit tutorial we posted as readings on our lecture page:
 * http://www.vogella.com/tutorials/JUnit/article.html#juniteclipse
 * 
 * Here is another tutorial you could check out:
 * https://dzone.com/articles/junit-tutorial-beginners
 * 
 * Here is the JUnit documentation with a list of various types of assert
 * statements you could use:
 * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * 
 */

public class LoopsTest {

	// If you have any instance variables that all methods can share
	// you could delcare them here, before any of the test methods
	
	
    /**
     * == Setup and Teardown ==
     * 
     * Optional methods: setUp and tearDown
     * These are optional methods shared across all the tests in this class.
     * 
     * These methods can be used to avoid repetition.
     * e.g. to create/destroy data structures required for more than one test method
     * 
     */

    /**
     * This method will run ONCE before all test methods in this test class are executed.
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * This method will run ONCE after all test methods in this test class are executed.
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
 

    /**
     * This method will run before every test method is executed.
     */
	@Before
    public void setUp() throws Exception {
        // If you have any values that every test case uses, you can set them
        // up here. This way, all test cases will begin with them in this state, 
		// even if previous test cases have changed them.
        
    }

    /**
     * This method will run after every test method is executed.
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * == Selecting Test Cases ==
     * 
     * Note: For Assignment 1, you should have 10-30 cases checked for each method
     * Within these tests, make sure to include general cases and boundary cases
     * You could revisit this reading from csc108 on choosing good test cases:
     * https://mcs.utm.utoronto.ca/~zingarod/108/lectures/lecture22/testing.pdf
     * 
     */
   

	@Test
	public void testSumEven() {
		assertEquals("sumEven for n = 0", 0, Loops.sumEven(0));
		assertEquals("sumEven for n = 2", 2, Loops.sumEven(2));
		assertEquals("sumEven for n = 3", 2, Loops.sumEven(3));
		// add more like the three above
	}

	@Test
	public void testSumOdd() {
		// similar to the testSumEven method above
	}

	@Test
	public void testGetOddNums() {
        int[] actual = Loops.getOddNums(0);
        int[] expected = new int[] {};
        assertArrayEquals("getOddNums for n = 0", expected, actual);

        actual = Loops.getOddNums(1);
        expected = new int[] {1};
        assertArrayEquals("getOddNums for n = 1", expected, actual);

        actual = Loops.getOddNums(3);
        expected = new int[] {1, 3, 5};
        assertArrayEquals("getOddNums for n = 3", expected, actual);

        // add more cases like the three above
	}
	
}
