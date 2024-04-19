public class Strings {
    public static void main(String[] args) {
        String string = "Hello World!";
        System.out.println("Длина строки: " + string.length());
        String string2 = string + " World hello!";
        System.out.println("Вторая строка: " + string2);
        String string3 = string2.replace("o", "u");
        System.out.println("Заменили все символы 'o' на 'u': " + string3);
        String substring = string.substring(0, 5);
        System.out.println("Подстрока (символы от индекса 0 до 5): " + substring);
        String substring2 = string.substring(6, 11);
        System.out.println("Подстрока (символы от индекса 6 до 11): " + substring2);
        String [] strings = string2.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(i+1 + ") " + strings[i]);
        }
    }
}
