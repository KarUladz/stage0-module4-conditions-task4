package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result = first == second ? first : second > first ? second : first;

        System.out.println(result);
    }
}
