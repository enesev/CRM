import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactTest {

    @Test
    @DisplayName("Should throw RTex if ids from diff contacts are equal.")
    void ContactValuesTest() throws RuntimeException{
        Contact c1 = new Contact();
        c1.setName("Pedro");
        c1.setPhoneNumber(654765324);
        c1.setEmail("pedro@arenabsrpg.org");
        c1.setCompanyName("GladiaWizards");

        Contact c2 = new Contact("Pedro",654765324,"pedro@arenabsrpg.org","GladiaWizards");
        // De momento estos g&s no implementan lógica alguna; si esto cambia, ya tendremos los tests preparados.
        assertEquals(c2.getName(),c1.getName());
        assertEquals(c2.getPhoneNumber(),c1.getPhoneNumber());
        assertEquals(c2.getEmail(),c1.getEmail());
        assertEquals(c2.getCompanyName(),c1.getCompanyName());
        // raramente coinciden. El método que las compara debe tirar RTex si se da el caso.
        c1.setContactId(c2.getContactId());
        assertThrows(RuntimeException.class,
                () -> c1.compareId(c1.getContactId(), c2.getContactId()));
    }
}
