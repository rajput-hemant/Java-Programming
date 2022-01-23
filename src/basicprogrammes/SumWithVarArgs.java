package basicprogrammes;

public class SumWithVarArgs {
    public int sum(int...var) {
        int sum = 0;
        for (int i : var)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        SumWithVarArgs ob = new SumWithVarArgs();
        System.out.println(ob.sum(2, 2));
        System.out.println(ob.sum(2, 3, 4));
        System.out.println(ob.sum(865, 65, 87, 68));
    }
}
