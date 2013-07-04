package linkedlist;

public class MyCheckingFile {
	public static void main(String[] args)
	{
		System.out.println("ooga booga");
		LinkedListImpl tester = new LinkedListImpl();
		tester.addFirst(3);
		tester.addLast(4);
		tester.addLast(5);
		tester.addLast(6);
		//tester.addLast(7);
		System.out.println(tester.toString());
	}
}
