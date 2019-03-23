package re;

public class Max3 {

    //完成 main 方法
    public static void main(String[] args) {
        int[] scores = {89, -23,64,91,119,52,73};
        Max3 hello = new Max3();
        hello.max3(scores);


    }

    //定义方法完成成绩排序并输出前三名的功能




    public void max3(int[] grades){
        int [] thr = new int[3];
        int count = 0;

        for(int i = 0; i < grades.length;i++){

            int max = i;
            for(int j = i+1; j < grades.length;j++){

                if(grades[j]  > grades[max]){
                    max = j;
                }

            }
            int temp = grades[i];
            grades[i] = grades[max];
            grades[max] = temp;
        }


        for (int k =0;k <grades.length;k++){

            if (grades[k] > 0 && grades[k] < 100){
                thr[count] = grades[k];
                count ++;
            }
            if(count == 3){
                break;
            }
        }
        System.out.println("考试成绩的前三名为：");
        System.out.println(thr[0]);
        System.out.println(thr[1]);
        System.out.println(thr[2]);
    }




}