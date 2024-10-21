import java.util.ArrayList;
import java.util.List;

public class MyStack {

    List<Integer> list;
    int size;

    public MyStack(int size){
        this.size = size;
        list = new ArrayList<>(size);
    }


    public int pop() {
        if(list.size() == 0) {
            return -1;
        } else {
            size = size - 1;
            return list.remove(list.size() - 1);
        }
    }


    public int push(int value) {


        if(list.size() == size) {
            return -1;
        }
        list.add(value);
        size++;
        return value;
    }

    public int peek() {
        if(list.size() == 0) {
            return -1;
        } else {
            return list.get(list.size() -1);
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek()); // 5

        for(int i = 0; i < 5; i++) {
            System.out.println(stack.pop()); // 5
        }




    }
}
