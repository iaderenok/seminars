public class prog4 {
    public static void main(String[] args) {

        System.out.println("\n\nЗадано выражение: 2? + ?5 = 69 . Восстановить выражение до верного равенства.");
        int c = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i * 1 + j * 10 + 5 == 69) {
                    c += 1;
                    System.out.println(c + ") 2" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println("\n");
        if (c == 0) {
            System.out.println("Решений нет\n");
        }

    }
}