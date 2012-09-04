package net.jzx7.regiosapi.exceptions;

public class InvalidDirectionException extends Exception {

	private static final long serialVersionUID = -439035065502578900L;

	String set;

	public InvalidDirectionException(String set) {
		this.set = set;
	}

	@Override
	public void printStackTrace() {
		System.out.println("------------------------------");
		System.out.println("[Regios][Exception] The direction: " + set + " is invalid");
		System.out.println("------------------------------");
		super.printStackTrace();
		System.out.println("------------------------------");
	}

}