import java.util.Hashtable;
import java.util.Stack;

public class MinStack {
	
	//Hashtable<Integer, Integer> hash=new Hashtable<>();
	long min;
	Stack<Long> stack;

	public MinStack() {
		stack = new Stack<>();
	}

	public void push(int x) {
		if (stack.isEmpty()) {
			stack.push(0L);
			min = x;
		} else {
			stack.push(x - min); // Could be negative if min value needs to
									// change
			if (x < min)
				min = x;
		}
	}
	
	

	public int pop() {
		if (stack.isEmpty())
			return 0;

		long pop = stack.pop();

		if (pop < 0) {
			long ret = min;
			min = min - pop; // If negative, increase the min value
			return (int) ret;
		}
		return (int) (pop + min);

	}

	public int top() {
		long top = stack.peek();
		if (top < 0) {
			return (int) min;
		} else {
			return (int) (top + min);
		}
	}

	public int getMin() {
		return (int) min;
	}
}
