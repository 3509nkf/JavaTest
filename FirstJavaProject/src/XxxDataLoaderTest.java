import java.util.List;

import org.junit.Test;

import java.io.IOException;

public class XxxDataLoaderTest {
	
	@Test
	public void testLoad() {
		JavaTest1 loader = new JavaTest1();
		
		//protectedのフィールドやメソッドに対しては、
		//リフレクションなどを用いずに値の上書きや処理の呼び出しがおこなえる
		loader.fileName = "sample.txt";
		List<String> result;
		try {
			result = loader.load();
		} catch (IOException e) {
			
		}
   }
}
