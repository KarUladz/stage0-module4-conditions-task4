package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int res = 0;
        if (first > second ) {
            res = first;
        }
        else if (second > first) {
            res = second;
        }
        res = third > res ? third : res;
        System.out.println(res);
    }
}
