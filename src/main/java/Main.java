import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //TODO ESTO SON PRUEBAS//


        List<Lead> lalista = new ArrayList<>();

        List<Contact> listaContactos = new ArrayList<>();

        List<Opportunity> listaOpportunities = new ArrayList<>();




        Lead lead1 = new Lead("juan", 555, "eee", "ddd");
        Lead lead2 = new Lead("juan88", 555, "eee", "ddd");
        Lead lead3 = new Lead("444", 555, "eee", "ddd");
        Lead lead4 = new Lead("111", 555, "eee", "ddd");
        Lead lead5 = new Lead("222", 555, "eee", "ddd");
        Lead lead6 = new Lead("000", 555, "eee", "ddd");



        System.out.println(lead1.toString());
        System.out.println(lead2.toString());

        lalista.add(lead1);
        lalista.add(lead2);
        lalista.add(lead3);
        lalista.add(lead4);
        lalista.add(lead5);
        lalista.add(lead6);


        showLeads(lalista);



        //HASTA AQUI SON PRUEBAS //

        ////MENU


        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        System.out.println("****************************************************");
        System.out.println("*\tWelcome to your CRM\t *");
        System.out.println("****************************************************\n");

        do{
            try{

                System.out.println("Please choose one of the options below: \n" +
                        "Show Leads \n" +
                        "Lookup Lead id \n" +
                        "Convert id  \n" +
                        "Show contacts  \n" +
                        "Show opportunities  \n" +
                        "Close-lost id \n" +
                        "Close-won id \n" +
                        "Exit \n");
                String option = scan.nextLine().toLowerCase().trim();

                switch (option){

                    case "show leads":
                        showLeads(lalista);

                        break;


                    case "lookup lead id":
                        lookupLeadId(lalista);
                        break;


                    case "convert id":
                        int id = PideDatos.pideEntero("Elige un lead para convertir a contact");
                        convertLead(lalista, listaContactos, listaOpportunities, id);

                        break;

                    case "show contacts":
                        showContacts(listaContactos);

                        break;

                    case "show opportunities":
                        showOpportunities(listaOpportunities);
                        break;

                    case "close-lost id":

                        break;


                    case "close-won id":

                        break;


                    case "exit":
                        System.out.println("Thank you for using CRM!");
                        exit = true;
                        break;


                    default:
                        System.err.println("You have to select an appropriate option");
                }
            }catch (Exception e){
                e.printStackTrace();
                scan.next();
            }
        }while (!exit);



    }




    //8 - A list of all Leads’ id and name can be displayed by typing “Show Leads” (case insensitive).

    public static void showLeads(List<Lead> lista){
        for (int i = 0; i <lista.size(); i++) {
            System.out.println(lista.get(i).getId() + " " + lista.get(i).getName());

        }
        System.out.println();
    } // está ok



    //9- An individual Lead’s details can be displayed by typing “Lookup Lead id” (case insensitive) where
    // “id” is the actual id of the Lead to lookup.
    public static void lookupLeadId(List<Lead> lista) {

        boolean repite = true;
        while (repite) {
            int id = PideDatos.pideEntero("Elige el id que quieres ver");
            for (int i = 0; i < lista.size(); i++) {
                int a = lista.get(i).getId();
                if (a == id) {
                    System.out.println(a + " " + lista.get(i).getName());
                    repite = false;
                }
            }
        }
    }    //está perfect



    //10-A Lead can be converted to an Opportunity by typing “convert id” (case insensitive)
    // where “id” is the actual id of the Lead to convert.
    public static void convertLead(List<Lead> listaLeads, List<Contact> listaContactos,List<Opportunity> listaOpportunities, int id){

        for (int i = 0; i < listaLeads.size(); i++) {
            int a = listaLeads.get(i).getId();
            if (a == id) {
                Contact contact1 = new Contact(listaLeads.get(i).getName(), listaLeads.get(i).getPhoneNumber(), listaLeads.get(i).getEmail(), listaLeads.get(i).getCompanyName());
                listaContactos.add(contact1);
                System.out.println("El lead " + listaLeads.get(i).getId() + " ha sido transferido a la lista de contactos\n");
/*FALLA AQUI!!*/Product product = PideDatos.pideProduct(); /*TODO--> ESTA FUNCION NO FUNCIONA DEL TODO BIEN, NO SE REPITE NI DA ERRORES. no devuelve nada */
                int quantity = PideDatos.pideValorMinMaxCamiones(1, 50);
                Opportunity opportunity1 = new Opportunity(contact1, product, quantity); //TODO--> PRODUCT ES SIEMPRE NULL!!
                listaOpportunities.add(opportunity1);
                System.out.println("El lead " + listaLeads.get(i).getId() + " ha sido convertido en opportunity y añadido a la lista de opportunities\n");
                listaLeads.remove(i);
            }
        }
    } // HAY QUE ARREGLARLO

    public static void showContacts(List<Contact> listaContacts){
        for (int i = 0; i <listaContacts.size(); i++) {
            System.out.println(listaContacts.get(i).getId() + " " + listaContacts.get(i).getName());
        }
        System.out.println();
    } // está ok



    public static void showOpportunities(List<Opportunity> listaOpportunities){
        for (int i = 0; i <listaOpportunities.size(); i++) {
            System.out.println(listaOpportunities.get(i).getId() + " " + listaOpportunities.get(i).getStatus() +" " + listaOpportunities.get(i).getDecisionMaker() + listaOpportunities.get(i).getProduct() + " " + listaOpportunities.get(i).getQuantity());
        }
        System.out.println();
    } // está ok



//escribo para hacer push

}