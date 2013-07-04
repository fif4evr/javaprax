package linkedlist;

public class LinkedListImpl implements ListInterface {
		Integer data;
		LinkedListImpl link;
		int y = 0;
		
	public Integer getData() {
		return data;
	}

	public LinkedListImpl getLink() {
		return link;
	}

	public LinkedListImpl() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#addFirst(int)
	 */
	@Override
	public void addFirst(int x) {
		//if there is already something in the first spot
		if (data != null) {
			LinkedListImpl newOne = new LinkedListImpl();
			newOne.data = data;
			link = newOne;
			data = x;
		} 
		//empty first spot
		else {
			data = x;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#addLast(int)
	 */
	@Override
	public void addLast(int x) {
		if (data == null) {
			data = x;
		}
		else {
			LinkedListImpl end = new LinkedListImpl();
			if (link != null) {
				end = link;
			}
			while (end.link != null){
				end = end.link;
			}
			LinkedListImpl newOne = new LinkedListImpl();
			newOne.data = x;
			end.link = newOne;
			
			
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#removeFirst()
	 */
	@Override
	public void removeFirst() {
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#removeLast()
	 */
	@Override
	public void removeLast() {
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#getFirst()
	 */
	@Override
	public Integer getFirst() {
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#getLast()
	 */
	@Override
	public Integer getLast() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#length()
	 */
	@Override
	public int length() {
		LinkedListImpl templink = link;
		int x = 0;
		if (data != null) x = 1;
		while (templink != null) {
			templink = templink.link;
			x++;
		}

		return x;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see linkedlist.LinkedListInt#toString()
	 */
	@Override
	public String toString() {
		String str = "";
		str = data.toString();
		LinkedListImpl templink = link;
		while (templink != null){
			str = " " + templink.data.toString();
			templink = templink.link;
		}
		return str;
	}

}
