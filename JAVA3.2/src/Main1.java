public class Main1 {
    public static void main(String[] args) {
        int start = 100;
        double bonus = 0.01;
        double deposit = 1100;
        double summ;
        if (deposit >= 1000) {
            summ = start + (deposit * bonus) + deposit;
        } else {
            summ = deposit + start;
        }
        System.out.println(summ);
    }
}