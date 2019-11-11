import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    public Director director;

    @Before
    public void before(){
        this.director = new Director("Euan White", "Finance", "K123456", 90000, 300000 );
    }

    @Test
    public void hasName(){
        assertEquals("Euan White", director.getName());
    }

    @Test
    public void deptName(){
        assertEquals("Finance", director.getDeptname());
    }

    @Test
    public void hasNi(){
        assertEquals("K123456", director.getNI());
    }

    @Test
    public void raiseSalary(){
        director.raiseSalary(3000);
        assertEquals(93000.0, director.getSalary());
    }

    @Test
    public void failRaiseSalary(){
        director.raiseSalary(-3000);
        assertEquals(90000.0,director.getSalary());
    }

    @Test
    public void getBudget(){
        assertEquals(300000.0, director.getBudget());
    }

    @Test
    public void cantChangeName(){
        director.changeName("");
        assertEquals("Euan White", director.getName());
    }

    @Test
    public void canChangeName(){
        director.changeName("Euan White");
        assertEquals("Euan White", director.getName());
    }
}
