public class Opportunity {
    private int opportunityId = (int) (Math.random() * 100 + 300);
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

    public int getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(int opportunityId) {
        this.opportunityId = opportunityId;
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

    @Override
    public String toString() {
        return "Opportunity{" +
                "opportunityId=" + opportunityId +
                ", status=" + status +
                ", decisionMaker=" + decisionMaker +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
