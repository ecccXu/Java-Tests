public class WordSort {
    public WordSort(){}
    public void sortStringArray(String[] strings){
        //冒泡排序
        for (int i = 0; i < strings.length - 1; i++){
            for (int j = 0; j < strings.length - i - 1; j++){
                if (strings[j].compareTo(strings[j+1])>0){
                    String temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        WordSort wordSort = new WordSort();
        String[] strArray = new String[]{"orange", "apple", "grape", "pear", "banana"};
        wordSort.sortStringArray(strArray);
        //输出排序结果
        for (int i=0; i<strArray.length; i++){
            System.out.print(strArray[i]);
            if (i == strArray.length-1){
                break;
            }
            System.out.print(",");
        }
    }
}