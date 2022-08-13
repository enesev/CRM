public class Opportunity {
    private Contact decisionMaker;
    private Enum status;
    private Integer id; //identificador único
    private Enum product;
    private int quantity;

    public Opportunity(Contact decisionMaker, Enum status, Integer id, Enum product, int quantity) {
        setDecisionMaker(decisionMaker);
        setStatus(status);
        setId(id);
        setProduct(product);
        setQuantity(quantity);
    }

    public void alterOpportunity(Integer id){

    }

    public Contact getDecisionMaker() {
        return decisionMaker;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Enum getProduct() {
        return product;
    }

    public void setProduct(Enum product) {
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