package linkedlist;

import org.testng.annotations.Test;

/**
 * Some basic tests for a linkedlist implementation
 * @author Ben McCormick
 *
 */
public class LinkedListTest {
	ListInterface list;
	
  @Test
  public void createList() {
	  this.list = new LinkedListImpl();
	  assert list != null;
	  assert list.length() == 0;
  }
  
  @Test
  public void addToList() {
	  
	  this.list = new LinkedListImpl();
	  list.addFirst(1);
	  assert list.length() == 1;
	  list.addLast(2);
	  assert list.length() == 2;

	  list.addLast(3);

	  list.addFirst(4);
	  
	  assert list.toString().equals("4 1 2 3");
  }
  
  @Test
  public void removeFromList() {
	  this.list = new LinkedListImpl();
	  list.addFirst(1);
	  assert list.length() == 1;
	  list.addLast(2);
	  assert list.length() == 2;
	  list.addLast(3);
	  list.addFirst(4);
	  
	  assert list.length() == 4;
	  list.removeFirst();
	  assert list.length() == 3;
	  assert list.toString().equals("1 2 3");
	  list.removeFirst();
	  assert list.length() == 2;
	  assert list.toString().equals("2 3");
	  list.removeLast();
	  assert list.length() == 1;
	  assert list.toString().equals("2");
	  list.removeLast();
	  assert list.length() == 0;
	  assert list.toString().equals("");
	  list.removeLast();
	  list.removeFirst();
	  assert list.length() == 0;
	  assert list.toString().equals("");
  }
  
  @Test
  public void getFromList() {
	  
	  this.list = new LinkedListImpl();
	  list.addFirst(1);
	  assert list.length() == 1;
	  list.addLast(2);
	  assert list.length() == 2;

	  list.addLast(3);

	  list.addFirst(4);
	  
	  assert list.getFirst() == 4;
	  assert list.getLast() == 3;
  }
  
  
}
