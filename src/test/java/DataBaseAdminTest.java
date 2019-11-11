import TechStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DataBaseAdminTest {

    public DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        this.dataBaseAdmin = new DataBaseAdmin("Kirsty", "Z123456", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Kirsty", dataBaseAdmin.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("Z123456", dataBaseAdmin.getNI());
    }

    @Test
    public void raiseSalary(){
        dataBaseAdmin.raiseSalary(1000);
        assertEquals(31000.0, dataBaseAdmin.getSalary());
    }

    @Test
    public void failRaiseSalary(){
        dataBaseAdmin.raiseSalary(-1000);
        assertEquals(30000.0,dataBaseAdmin.getSalary());
    }

    @Test
    public void payBonus(){
        assertEquals(300.0, dataBaseAdmin.payBonus());

    }

    @Test
    public void cantChangeName(){
        dataBaseAdmin.changeName("");
        assertEquals("Kirsty", dataBaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        dataBaseAdmin.changeName("Kirsty");
        assertEquals("Kirsty", dataBaseAdmin.getName());
    }
}
