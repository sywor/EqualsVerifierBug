package Internal.InternalTool;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import nl.jqno.equalsverifier.EqualsVerifier;

/**
 * Unit test for simple App.
 */
public class InternalClassTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InternalClassTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( InternalClassTest.class );
    }

    /**
     * 
     */    
    public void testApp()
    {
        InternalClass pepe = new InternalClass();
        String result = pepe.testDNI();
        if ( result.equals("dummy test") ) 
            assertTrue( true );
        else 
            assertTrue( false );
    }
    
    /**
     * 
     */    
    public void testApp2()
    {
        EqualsVerifier.forClass(InternalClass.class).verify();
    }
    
}
