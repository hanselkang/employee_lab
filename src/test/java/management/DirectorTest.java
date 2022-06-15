package management;

import management.Director;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director ("Elin","SX22033",58000,"Ministry of Power",100000000);}

    @Test
    public void hasDeptName() {
        assertEquals("Ministry of Power", director.getDeptName());

    }

    @Test
    public void hasName() {
        assertEquals("Elin", director.getName());
    }

    @Test
    public void hasNino() {
        assertEquals("SX22033", director.getNino());
    }

    @Test
    public void hasSalary() {
        assertEquals(58000,director.getSalary(),0.0);
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(2000);
        assertEquals(60000,director.getSalary(),0.0);
    }

    @Test
    public void payBonus() {
        director.payBonus();
        assertEquals(580,director.getSalary(),0.0);
    }

    @Test
    public void canChangeName() {
        director.setName("Fuchsia");
        assertEquals("Fuchsia", director.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(100000000, director.getBudget(),0.0);
    }



    }
