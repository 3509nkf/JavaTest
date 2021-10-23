import java.util.LinkedList;
import java.util.List;
public class JavaTest1 {
	public static void main(String[] args) {
	
	
	List<Integer> list = new LinkedList<>();
	list.add(1);
	list.add(2);
	if(list instanceof LinkedList) {
		((LinkedList<Integer>)list).addLast(10);
	}
	System.out.println(list);
	}
	

}
