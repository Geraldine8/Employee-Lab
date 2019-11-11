import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    public Developer developer;

    @Before
    public void before(){
        developer = new Developer("Anna", "S123456", 25000);
    }

    @Test
    public void hasName(){
        assertEquals("Anna", developer.getName());
    }


    @Test
    public void hasNi(){
        assertEquals("S123456", developer.getNI());
    }

    @Test
    public void raiseSalary(){
        developer.raiseSalary(2000);
        assertEquals(27000.0, developer.getSalary());
    }

    @Test
    public void failRaiseSalary(){
        developer.raiseSalary(-2000);
        assertEquals(25000.0,developer.getSalary());
    }

    @Test
    public void payBonus(){
        assertEquals(250.0, developer.payBonus());

    }

    @Test
    public void cantChangeName(){
        developer.changeName("");
        assertEquals("Anna", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.changeName("Anna");
        assertEquals("Anna", developer.getName());
    }


}
