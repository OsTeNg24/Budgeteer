package Entities;

import java.io.IOException;

public class Ticket {
    private String desc;
    private float total;
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
    public Ticket(String desc, float total, int type, String typedesc) throws IOException {
        this.desc = desc;
        this.total = total;
        this.type = type;
        this.typedesc = typedesc;
    }
    public String getDesc() {
        return this.desc;
    }
    public float getTotal() {
        return this.total;
    }
    public int getType() {
        return this.type;
    }
    public String getTypedesc() {
        return this.typedesc;
    }
    public String getTypeToString() {
        switch (this.type) {
            case 0:
                return "Other";
            case 1:
                return "Rent";
            case 2:
                return "Groceries";
            case 3:
                return "Utilities";
            case 4:
                return "Leisure";
            case 5:
                return "Income";
            case 6:
                return "Gift";
        }
        return "";
    }
}
