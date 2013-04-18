package net.jzx7.regiosapi.inventory;

public class RegiosItemStack extends RegiosItem {
	
	private int amount = 1;

    public RegiosItemStack(int id) {
        super(id);
    }

    public RegiosItemStack(int id, int amount) {
        super(id);
        this.amount = amount;
    }

    public RegiosItemStack(int id, int amount, short data) {
        super(id, data);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}