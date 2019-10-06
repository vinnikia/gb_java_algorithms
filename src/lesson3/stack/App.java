package lesson3.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        String str;
        while (true) {
            try {
                System.out.println("Введите строку, которую требуется развернуть:");
                str = getString();
                if (str.equals("")) {
                    System.out.println("Строка пустая");
                    continue;
                }
                ReverseString rs = new ReverseString(str);
                String result = rs.action();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        return reader.readLine();
    }
}
