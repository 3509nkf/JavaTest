
public class B extends A{
	@Override //コンパイラーとかJVMにいっている
	public void test(){
		System.out.println("B");
	}
	
	public void test(String str) {
		System.out.println(str);
	}
	
}
