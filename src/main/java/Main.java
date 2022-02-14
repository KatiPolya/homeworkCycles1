public class Main {
    public static int main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (200 <= i * i || i * i <= 300) {
                return i;
            }
            System.out.println(i);
        }
        return 0;
    }
}
