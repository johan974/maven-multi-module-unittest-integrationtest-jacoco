import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class DomainClass2Test {
    @Test
//  @Category( MyUnitTest.class) -- see parent.pom '
    public void testUnitTestOne() {
        DomainClass2 domainClass2 = new DomainClass2();
        assertEquals( 15131, domainClass2.convert( 123));
    }
}
