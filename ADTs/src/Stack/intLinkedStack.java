package Stack;

public class intLinkedStack implements intStack {

	public class Element
	{
		int data;
		Element next;
	
	}
	private Element top;
	@Override
	public boolean isEmpty() {
		if(top==null)return false;
		else return true;
	}

	@Override
	public int top() {
		return top.data;
	}

	@Override
	public void push(int inhalt) {
		top.data=inhalt;
		Element top = new Element();

	}

	@Override
	public int pop() {
		return top.data;
		top.data = null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
