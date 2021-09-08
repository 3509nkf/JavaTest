import java.io.InputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;


public class JavaTest1 {
	
	File file = new File("mail.properties");
	
	InputStream is = null;
	try {
		is = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(is);
		
		String address = properties.getProperty("system.mail.address");
		System.out.println(address);
	} catch (IOException ex) {
		//��O�����͏ȗ�
	} finally {
		if(is != null) {
			try {
				is.close();
			} catch (IOException ex) {
				System.err.println(ex);
			}
		}
	}

}