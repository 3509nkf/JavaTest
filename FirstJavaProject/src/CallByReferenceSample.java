import java.util.concurrent.atomic.AtomicInteger;
public class CallByReferenceSample {
	public static void main(String... args) {
		public void someMethod() {
			StringBuilder text = new StringBuilder("This is ");
			AtomicInteger number = new AtomicInteger(1);
			System.out.println("書き換え前:" + text + " " + number);
			
			write(text, number);
			
			System.out.println("書き換え後:" + text + " " + number);
		}
		public static void write(StringBuilder text, AtomicInteger number) {
			text.append("an apple");
			number.incrementAndGet();
		}
		
		CallByReferenceSample test = new CallByReferenceSample();
		someMethod();
	}
}