package lesson3.stack;

public class ReverseString {
    private String str;

    public ReverseString(String str) {
        this.str = str;
    }

    public String action() {
        String result = "";
        int size = str.length();
        StackImpl st = new StackImpl(size);
        for (int i = 0; i < size; i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        while (!st.isEmpty()) {
            result += String.valueOf(st.pop());
        }
        return result;
    }
}
