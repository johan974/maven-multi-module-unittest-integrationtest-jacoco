import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class DomainClass1IntegrationTest {
    @Test
//  @Category( MyIntegrationTest.class) - when you use in the failsafe plugin: '<groups>MyIntegrationTest</groups>'
    public void testUnitIntegrationTestTwo() {
        DomainClass1 domainClass1 = new DomainClass1();
        assertEquals( 15131, domainClass1.convert2( 123));
    }
}
