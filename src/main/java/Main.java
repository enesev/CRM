import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        //TODO ESTO SON PRUEBAS//


    Integer idCounter = Lead.createID(0);
        System.out.println(idCounter);

    Map<Integer, Lead> leadLists = new HashMap<>();

        Lead lead1 = new Lead("juan", 555, "eee", "ddd");
        Lead lead2 = new Lead("juan88", 555, "eee", "ddd");

        leadLists.put(Lead.createID(idCounter), lead1);

        leadLists.put(Lead.createID(idCounter), lead2);
        System.out.println(leadLists.keySet());


        System.out.println(leadLists.get(0).getName());
        System.out.println(leadLists.get(1).getName());

        Map<Integer, Lead> contacts = new HashMap<>();


        leadLists.remove(0);

        //HASTA AQUI SON PRUEBAS //

    }
}