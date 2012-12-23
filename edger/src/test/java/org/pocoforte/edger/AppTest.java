package org.pocoforte.edger;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        
        ImagePlus imp = IJ.openImage("/Users/meisenberg/Downloads/deety2.JPG");
        ImageProcessor p = imp.getProcessor();
        p.flipVertical();
        int[] m = {1, 1, 1, 1, 2, 1, 1, 1, 1};
        for (int i = 0; i < 50; ++i) {
        	p.convolve3x3(m);
        }
        p.findEdges();
        //p.noise(20);
        imp.show();
        while(true);
    }
}
