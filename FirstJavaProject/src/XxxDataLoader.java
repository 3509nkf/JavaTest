import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class XxxDataLoader {
	
	
	
	protected String fileName; //protected
	
	protected List<String> load() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(this.fileName));
		return lines;
	}

}
