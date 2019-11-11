import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {
    public Manager manager;

    @Before
    public void before(){
        manager = new Manager("Carlyn", "Finance", "S123456", 50000);
    }

    @Test
    public void hasName(){
        assertEquals("Carlyn", manager.getName());
    }

    @Test
    public void hasDept(){
        assertEquals("Finance", manager.getDeptname());
    }

    @Test
    public void hasNi(){
        assertEquals("S123456", manager.getNI());
    }

    @Test
    public void raiseSalary(){
        manager.raiseSalary(2000);
        assertEquals(52000.0, manager.getSalary());
    }

    @Test
    public void failRaiseSalary(){
        manager.raiseSalary(-2000);
        assertEquals(50000.0,manager.getSalary());
    }

    @Test
    public void payBonus(){
       assertEquals(500.0, manager.payBonus());

    }

    @Test
    public void cantChangeName(){
        manager.changeName("");
        assertEquals("Carlyn", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.changeName("Carlyn");
        assertEquals("Carlyn", manager.getName());
    }

//    @Test
//    public void canChangeNameFail(){
//        manager.changeName(null);
//        assertEquals("Geraldine", manager.getName());
//    }



}
