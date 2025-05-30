package basicSyntax;

public class ForWhile {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
            }
        }
        String[] languages = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };
        for (String lang : languages) {
            if (lang == "Java") {
                System.out.println("現在学習中の言語は" + lang + "です。");
                continue;
            } else if (lang == "HTML") {
                System.out.println(lang + "はプログラミング言語ではありません。");
                break;
            } else {
                System.out.println(lang);
            }

        }

    }
}