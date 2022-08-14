public class Opportunity {
    private int id = (int) (Math.random() * 100 + 300);
    private Status status = Status.OPEN;
    private Contact decisionMaker;
    private Product product;
    private int quantity;

    public Opportunity(Contact decisionMaker, Product product, int quantity) {
        setDecisionMaker(decisionMaker);
        setProduct(product);
        setQuantity(quantity);
    }



    public void alterOpportunity(int id){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Contact getDecisionMaker() {
        return decisionMaker;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



/* public Enum status {
OPEN, CLOSED_WON, CLOSED_LOST
        } */
/*
public Enum product {
HYBRID, FLATBED, BOX
        }*/