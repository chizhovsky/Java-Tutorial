package links;

public class Links {
    public static void main(String[] args) {
        int firstArray[];
        int secondArray[];
        firstArray = new int[3];
        secondArray = firstArray;
        System.out.println("First array: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
            System.out.println(firstArray[i]);
        }
        System.out.println("Second array: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = i;
            System.out.println(secondArray[i]);
        }
        firstArray[1] = 100;
        System.out.println("First array: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        System.out.println("Second array: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
    }
}
