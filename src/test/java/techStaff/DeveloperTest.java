package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer ("Elin","SX22033",58000);}


    @Test
    public void hasName() {
        assertEquals("Elin", developer.getName());
    }

    @Test
    public void hasNino() {
        assertEquals("SX22033", developer.getNino());
    }

    @Test
    public void hasSalary() {
        assertEquals(58000,developer.getSalary(),0.0);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(60000,developer.getSalary(),0.0);
    }

    @Test
    public void payBonus() {
        developer.payBonus();
        assertEquals(580,developer.getSalary(),0.0);
    }

    @Test
    public void canChangeName() {
        developer.setName("Fuchsia");
        assertEquals("Fuchsia", developer.getName());
    }
}