package ramdasample;

import com.sample.Sample;
import com.sample.Test;
import com.sample.Factory;


public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		test.process(() -> {
			System.out.println("Hello with Lambda.");
		});
	}

}
