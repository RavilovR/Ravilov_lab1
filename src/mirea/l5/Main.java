package mirea.l5;

public class Main {
    public static void main(String[] args) {
        float garmm = 0;
        for (int i = 0; i < 10; i++){
            garmm = 1/(float)(i + 1);
            System.out.printf("%10.4f%n", garmm);
        }
    }
}
