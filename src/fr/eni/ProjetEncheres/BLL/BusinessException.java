package fr.eni.ProjetEncheres.BLL;

public class BusinessException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public BusinessException() {
		super();
		
	}

	public BusinessException(String message, Throwable t) {
		super(message,t);
		
		
	}
	
	
}
