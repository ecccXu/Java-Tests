/*
 * 冒泡排序：
 *     (1)数组中两个相邻的元素，如果第一个数比第二个大，交换他们的位置；
 *     (2)每次比较，都会产生一个最大或者最小的数
 *     (3)下一轮可以少一次排序
 *     (4)依次循环，直到结束
 *
 *   例：
 *       9,8,4,7,5,6,17,26排序：
 * */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={9,8,4,7,5,6,17,26};
        int[] a=bubbleSort(array);
        System.out.println(Arrays.toString(a));   //未优化的排序

        System.out.println(Arrays.toString(bubbleSort1(array)));//优化后的排序
    }

    public static int[] bubbleSort(int[] arrays){
        int temp;
        //外层循环，判断需要循环多少次
        for(int i=0;i<arrays.length-1;i++){
            //内层循环，如果第一个数比第二个数大，则交换
            for(int j=0;j<arrays.length-i-1;j++){
                if(arrays[j]>arrays[j+1]){
                    temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                }

            }
        }
        return arrays;
    }

    //冒泡排序的优化
    //利用判断语句，最后一次判断去掉
    public static int[] bubbleSort1(int[] arrays){
        int temp;
        //外层循环，判断需要循环多少次
        for(int i=0;i<arrays.length-1;i++){
            //内层循环，如果第一个数比第二个数大，则交换

            boolean flag=false;  //通过falg减少没有必要的比较

            for(int j=0;j<arrays.length-i-1;j++){
                if(arrays[j]>arrays[j+1]){
                    temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
        return arrays;
    }

}

