package cn.tedu.action;

public class HelloAction {
	/*
	 * ����������Ϊexecute()
	 */
	private String message;
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	public String execute(){
		
		message="HI.........";
		System.out.println("Hello World!!!");
		
		return "success";
	}
}