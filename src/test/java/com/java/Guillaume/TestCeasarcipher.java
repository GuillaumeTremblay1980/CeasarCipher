package com.java.Guillaume;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestCeasarcipher 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCeasarcipher( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCeasarcipher.class );
    }

public void testEncipher() throws Exception {

     Ceasarcipher c = new Ceasarcipher(4);

    Assert.assertEquals("Lipps", c.encipher("Hello"));

    	 

    c = new Ceasarcipher(0);

    Assert.assertEquals("Hello", c.encipher("Hello"));

    	 

    c = new Ceasarcipher(-1);

    Assert.assertEquals("Ana fhudr 0//$ sn @khbd.", c.encipher("Bob gives 100$ to Alice."));


    }

   }

