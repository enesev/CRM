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
    /* As of now, there's no logic implemented in our g&s; but we might want to test them in the future.
       For example, since we can't provide any more than 50 trucks, we might want to limit employeeCount
       to avoid selling our services to companies, if their logistical chain's size is way above ours */
    assertEquals(a2.getIndustry(),a1.getIndustry());
    assertEquals(a2.getEmployeeCount(),a1.getEmployeeCount());
    assertEquals(a2.getCity(),a1.getCity());
    assertEquals(a2.getCountry(),a1.getCountry());
    // compareId should throw RTex if ids are equal
    a1.setAccountId(a2.getAccountId());
    assertThrows(RuntimeException.class,
            () -> a1.compareId(a1.getAccountId(), a2.getAccountId()));
    }
}
