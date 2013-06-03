package linkedlist;

/**
 * Provides an interface for a list of integers
 * @author Ben McCormick
 *
 */
public interface ListInterface {

	/**
	 * Add a new integer as the first item in the list
	 * @param x
	 */
	public abstract void addFirst(int x);

	/**
	 * Add a new integer as the last item in the list
	 * @param x
	 */
	public abstract void addLast(int x);

	/**
	 * Remove the first item in the list
	 */
	public abstract void removeFirst();

	/**
	 * remove the last item in the list
	 */
	public abstract void removeLast();

	/**
	 * Get the first item in the list
	 * @return the first item in the list, or null if the list is empty
	 */
	public abstract Integer getFirst();

	/**
	 * Get the last item in the list
	 * @return the last item in the list, or null if the list is empty
	 */
	public abstract Integer getLast();

	/**
	 * Get the length of the list
	 * @return
	 */
	public abstract int length();

	/**
	 * Return the list as a string in the form
	 * "1 2 3 4" for each one.  There should be no leading or trailing spaces
	 * @return the list as a string
	 */
	public abstract String toString();

}