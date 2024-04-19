public class Variables {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;
        int k = i + j;
        int x = k * 3;
        int y = x % 6;
        System.out.println(i + " + " + j + " = " + k);
        System.out.println(k + " * 3 = " + x);
        System.out.println("Остаток от деления " + x + " на 6 равен " + y);

        double a = 0.1;
        double b = 0.2;
        double c = a * b;
        System.out.println(a + " * " + b + " = " + c);

        char d = 'A';
        char e = 'B';
        int char_sum = d + e;

        System.out.println("Сумма двух символов '" + d + "' и '" + e + "' в кодировке UTF-8: " + char_sum);
    }
}
