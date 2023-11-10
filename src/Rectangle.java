import java.util.Arrays;
public class Rectangle {
    double[] xs = {1, 9, 3, 5, 6};//长
    double[] yx = {10, 11, 4, 7, 13};//宽
    double[] array;
    public Rectangle(){}
    public Rectangle rarea(){
        Rectangle rects = new Rectangle();
        rects.array = new double[25];
        int index = 0;
        int n = Math.min(xs.length, yx.length);
        for (int i=0; i<n; i++){
            //System.out.println(xs[i] + " " + yx[i]);
            rects.array[index] = xs[i]*yx[i];
            //System.out.println("area["+index+"]="+rects.array[index]);
            index++;
        }//给rects数组的每个元素赋值
        Arrays.sort(rects.array);//对rects里面的元素从小到大排序
        System.out.println(Arrays.toString(rects.array));
        return rects;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.rarea();
    }
}



//不理解如何使用Rectangle rects[]=new Rectangle[25]