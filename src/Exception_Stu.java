import java.util.Arrays;
import java.util.Scanner;
import java.lang.Exception;
public class Exception_Stu {
    private static final int max = 1000;//原数组长度
    public Exception_Stu(){}
    public static void main(String[] args) {
        Exception_Stu stu = new Exception_Stu();
        int[] arr = new int[max];
        int i = 0;
        System.out.print("请输入成绩：");
        Scanner scan = new Scanner(System.in);//从键盘接受数据
        String s = scan.nextLine();
        Scanner sc = new Scanner(s);
        try{
        while (sc.hasNext()){
            arr[i++] = Integer.parseInt(String.valueOf(sc.next()));
        }
        if (i < 10){
            throw new LessThan();
        }
        else if (i>10){
            throw new ArrayIndexOutOfBoundsException();
        }
        //无异常操作
        //定义一个新的数组,将原数组中的元素复制过来，并只保留新的长度大小的元素
        final int newLength = 10;//代表10个成绩
        int[] pArray = Arrays.copyOf(arr,newLength);
        stu.sortArray(pArray);
        System.out.println("该学生的成绩（降序）：");//输出
        System.out.println(Arrays.toString(pArray));
        }
        catch (NumberFormatException e){//捕获输入数据不为整数异常
            System.out.println("输入数据不为整数");
        }
        catch (LessThan e){//捕获输入参数不足10个异常
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("超过10个成绩");
        }
        catch (Exception e){//捕获其他异常
            System.out.println("捕获了一个未知类型的异常");//输出提示信息
        }
    }

    public static int[] sortArray(int[] arrays){//冒泡排序（降序）
        int temp = 0;
        //外层循环，需要判断循环次数
        for (int i=0; i < arrays.length-1; i++){
            //内层循环，若第一个数比第二个数字小，则交换
            boolean flag = false;//通过flag减少没有必要的比较

            for (int j=0; j < arrays.length-i-1; j++){
                if (arrays[j]<arrays[j+1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }
        }
        return arrays;
    }
}
class LessThan extends Exception{
    public LessThan(){
        super("请输入至少10个成绩");
    }
}
