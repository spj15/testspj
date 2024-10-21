import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromStringArray {

    public List<String> removeDuplicates(String[] words) {
        List<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String s: words) {
            if(set.contains(s)) {
                continue;
            } else {
                set.add(s);
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"saurabh", "saurabh", "nigel", "max"};
        RemoveDuplicatesFromStringArray remove = new RemoveDuplicatesFromStringArray();
        System.out.println(remove.removeDuplicates(words));

    }
}
