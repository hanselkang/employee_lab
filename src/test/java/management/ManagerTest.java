package management;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;
    
    @Before
    public void before(){
        manager = new Manager ("Elin","SX22033",58000,"Ministry of Power");
    }
    
    @Test
    public void hasDeptName() {
        assertEquals("Ministry of Power", manager.getDeptName());

    }

    @Test
    public void hasName() {
        assertEquals("Elin", manager.getName());
    }

    @Test
    public void hasNino() {
        assertEquals("SX22033", manager.getNino());
    }

    @Test
    public void hasSalary() {
        assertEquals(58000,manager.getSalary(),0.0);
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(2000);
        assertEquals(60000,manager.getSalary(),0.0);
    }

    @Test
    public void payBonus() {
        manager.payBonus();
        assertEquals(580,manager.getSalary(),0.0);
    }

    @Test
    public void canChangeName() {
        manager.setName("Fuchsia");
        assertEquals("Fuchsia", manager.getName());
    }
}