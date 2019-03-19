public class Greeting {
	private static  String greetingRecipient;

	public Greeting(String greetingRecipient) {
		this.greetingRecipient = greetingRecipient;
	}

	/**
	 * Should write "Hello, <greetingRecipient>!" to stdout
	 */
	public void greet() {
		System.out.println("Hello, "+greetingRecipient+"!");
	}

	public static void main(String[] args) {
		Greeting g = new Greeting("Donald");
		g.greet(); 
	}
}
