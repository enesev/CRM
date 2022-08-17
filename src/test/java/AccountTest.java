import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

@Test
@DisplayName("Checks that acc properties are equal in case any logic is implemented in g&s. " +
            "Also makes sure RTex is thrown if ids from diff accs are equal.")
void AccountValuesTest() throws RuntimeException{
    Account a1 = new Account();
    a1.setIndustry(Industry.PRODUCE);
    a1.setEmployeeCount(25000);
    a1.setCity("Minas Tirith");
    a1.setCountry("Gondor");

    Account a2 = new Account(Industry.PRODUCE,25000,"Minas Tirith","Gondor");
    /*
        Estos tests son innecesarios, de momento. Si en el futuro introducimos lógica en los setters,
        podrían servirnos. (max employee count en su setter, tirar error si get country equivale a
        a Rusia para evitar sanciones, etc).
     */
    assertEquals(a2.getIndustry(),a1.getIndustry());
    assertEquals(a2.getEmployeeCount(),a1.getEmployeeCount());
    assertEquals(a2.getCity(),a1.getCity());
    assertEquals(a2.getCountry(),a1.getCountry());
    // Raramente coinciden. Nos aseguramos de que el método que las compara tire RTex si se da el caso.
    a1.setAccountId(a2.getAccountId());
    assertThrows(RuntimeException.class,
            () -> a1.compareId(a1.getAccountId(), a2.getAccountId()));
    }
}
