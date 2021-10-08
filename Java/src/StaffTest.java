import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.InputStream;
import java.io.IOException;
import javax.xml.bind.JAXB;

public class StaffTest {

	
		public void parse(String xmlFile) {
			try(InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
				Staffs staffs = JAXB.unmarshal(is, Staffs.class);
				System.out.println(staffs);
			} catch (IOException ex) {
				//—áŠOˆ—‚Í•s—v
			}
		}
		
		public static void main(String[] args) {
			StaffTest xml = new StaffTest();
			xml.parse("test.xml");
		}

}
