import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {
    Main m1 = new Main();
    List<Lead> listaLeads = new ArrayList<>() {};
    Lead l1 = new Lead("juan",622733955,"juan@gmail.com","juanCompany");

    @BeforeEach
    void setUp(){

    }

    @Test
    @DisplayName("Check if new leads are created with the right values")
    void createNewLeadTest(){
        /* "Simulating" how our scanner behaves. Most methods in Main use a customized Scanner. I have tried
            InputStream, Scanner, and similar tools, but I can't find a way to run these in a testing environment.
            Therefore, I will implement tests that are functionally identical to those found in other test files,
            but I will use the logic implemented in Main, instead of the logic found in their respective class files */

        listaLeads.add(l1);
        String name = "juan";
        int phoneNumber = 622733955;
        String email = "juan@gmail.com";
        String companyName = "juanCompany";
        Lead lead2 = new Lead(name, phoneNumber, email, companyName);
        listaLeads.add(lead2);

        assertEquals(listaLeads.get(1).getName(),listaLeads.get(0).getName());
        assertEquals(listaLeads.get(1).getPhoneNumber(),listaLeads.get(0).getPhoneNumber());
        assertEquals(listaLeads.get(1).getEmail(),listaLeads.get(0).getEmail());
        assertEquals(listaLeads.get(1).getCompanyName(),listaLeads.get(0).getCompanyName());

        // We also make sure Lead ids differ.
        listaLeads.get(0).setLeadId(listaLeads.get(1).getLeadId());
        assertThrows(RuntimeException.class,
                () ->l1.compareId(listaLeads.get(1).getLeadId(),listaLeads.get(0).getLeadId()));
    }
}
