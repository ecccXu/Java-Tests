public class Matrix {//矩阵
    int h = 0,l = 0;
    int[][] array;
    public Matrix(){}//无参构造
    public Matrix(int h,int l,int[][] array){//带参构造
        this.h = h;
        this.l = l;
        this.array = array;
    }
    public Matrix mul(Matrix b){
        Matrix c = new Matrix();//生成一个新的矩阵对象，便于该方法返回值
        c.array = new int[this.h][b.l];

        for (int i = 0; i < this.h; i++){
            for (int j = 0; j < b.l; j++){
                int sum = 0;
                for (int t = 0; t < this.l; t++){
                    sum = sum + this.array[i][t] * b.array[t][j];//矩阵的乘法
                }
                c.array[i][j] = sum;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{7,8},{9,0},{1,2}};
        Matrix a = new Matrix(2, 3 ,array1);
        Matrix b = new Matrix(3, 2 ,array2);

        Matrix c = a.mul(b);//两个矩阵相乘

        for (int i = 0; i < c.array.length; i++){
            for (int j = 0; j < c.array[0].length; j++){
                System.out.print(c.array[i][j]+" ");
            }
            System.out.println();
        }//打印矩阵
    }
}