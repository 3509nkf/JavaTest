import java.util.concurrent.atomic.AtomicInteger;
public class CallByReferenceSample {
	public static void main(String... args) {
		public void someMethod() {
			StringBuilder text = new StringBuilder("This is ");
			AtomicInteger number = new AtomicInteger(1);
			System.out.println("‘‚«Š·‚¦‘O:" + text + " " + number);
			
			write(text, number);
			
			System.out.println("‘‚«Š·‚¦Œã:" + text + " " + number);
		}
		public static void write(StringBuilder text, AtomicInteger number) {
			text.append("an apple");
			number.incrementAndGet();
		}
		
		CallByReferenceSample test = new CallByReferenceSample();
		someMethod();
	}
}