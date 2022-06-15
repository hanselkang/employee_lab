package techStaff;

import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin ("Elin","SX22033",58000);}


    @Test
    public void hasName() {
        assertEquals("Elin", databaseAdmin.getName());
    }

    @Test
    public void hasNino() {
        assertEquals("SX22033", databaseAdmin.getNino());
    }

    @Test
    public void hasSalary() {
        assertEquals(58000,databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(60000,databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void payBonus() {
        databaseAdmin.payBonus();
        assertEquals(580,databaseAdmin.getSalary(),0.0);
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Fuchsia");
        assertEquals("Fuchsia", databaseAdmin.getName());
    }
}