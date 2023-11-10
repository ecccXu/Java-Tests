public class TestArraySum {
    static int[] a = new int[10];
    public int arraySum(int[] A){
        int sum = 0;
        for (int i=0; i<a.length; i++){
            sum += A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i=0; i<a.length; i++){
            a[i] = i + 11;
        }
        TestArraySum s = new TestArraySum();
        System.out.println("11~20的和为：" + s.arraySum(a));
    }
}