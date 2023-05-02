package Entities;

import java.io.IOException;

public class Ticket {
    private String desc;
    private double total;
    private int type;
    private String typedesc;
    /**
     * Creates new Ticket with provided information
     * @param desc A String containing a the description of an expense/revenue
     * @param total A float representing the transaction amount.
     * @param type An int representing the type of transaction.
     * @param typedesc A String containing additional information relevant to the type of
     *                 transaction if it was an non-traditional transaction.
     * @throws IOException
     */
    public Ticket(String desc, double total, int type, String typedesc) throws IOException {
        this.desc = desc;
        this.total = total;
        this.type = type;
        this.typedesc = typedesc;
    }
    public String getDesc() {
        return this.desc;
    }
    public double getTotal() {
        return this.total;
    }
    public int getType() {
        return this.type;
    }
    public String getTypedesc() {
        return this.typedesc;
    }
    public String getTypeToString() {
        return switch (this.type) {
            case 0 -> "Other";
            case 1 -> "Rent";
            case 2 -> "Groceries";
            case 3 -> "Utilities";
            case 4 -> "Leisure";
            case 5 -> "Income";
            case 6 -> "Gift";
            default -> "";
        };
    }
}
