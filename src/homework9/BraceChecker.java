package homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack st = new Stack(10);
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char var;
            switch (c) {
                case '(':
                    st.push('(');
                    break;
                case '[':
                    st.push('[');
                    break;
                case '{':
                    st.push('{');
                    break;
                case ')':
                    var = (char) st.pop();
                    if (var != '(') {
                        System.out.println("Error: " + i + " opened " + var +
                                "but closed" + c);
                    }
                    break;
                case ']':
                    var = (char) st.pop();
                    if (var != '[') {
                        System.out.println("Error: " + i + " opened " + var +
                                "but closed" + c);
                    }
                    break;
                case '}':
                    var = (char) st.pop();
                    if (var != '{'){
                        System.out.println("Error: " + i + " opened " + var +
                                "but closed" + c);
                    }
                    break;
            }

        }
    }
}