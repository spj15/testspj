import java.util.HashSet;

public class RemoveDuplicateCharacters {

    public String removeDuplicate(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(char c: s.toCharArray()) {
            if(set.contains(c)) {
                continue;
            } else {
                set.add(c);
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "xyzzy";
        // "xyz"
        RemoveDuplicateCharacters removeDuplicateCharacters = new RemoveDuplicateCharacters();
        System.out.println(removeDuplicateCharacters.removeDuplicate(s));
    }
}
