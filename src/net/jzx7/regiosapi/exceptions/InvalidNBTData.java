package net.jzx7.regiosapi.exceptions;

public class InvalidNBTData extends Exception {
	
	private static final long serialVersionUID = -891602678311772399L;
	
	String msg;
	
	public InvalidNBTData(String msg){
		this.msg = msg;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("------------------------------");
		System.out.println("[Regios][Exception] " + msg);
		System.out.println("------------------------------");
		super.printStackTrace();
		System.out.println("------------------------------");
	}

}
