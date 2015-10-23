import java.util.Arrays;
public class GetTheTop3 {
    
    //完成 main 方法
    public static void main(String[] args) {
        GetTheTop3 hello=new GetTheTop3();
        int[] scores={89,-23,64,91,119,52,73};
        int[] max=new int[3];
        max=hello.top3(scores);
//        Arrays.toString(max[]);
        System.out.println(Integer.toString(max[0])+ " " + Integer.toString(max[1])+ " " + Integer.toString(max[2]));
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    
    public int[] top3(int scores[])
    {   int[] max=new int[3];
        for(int i=0;i<scores.length;i++)
        {
            if(scores[i]>=0&&scores[i]<=100)
                ;
            else
                scores[i]=0;
        }
        Arrays.sort(scores);
        max[0]=scores[scores.length-1];
        max[1]=scores[scores.length-2];
        max[2]=scores[scores.length-3];
        return max;
    }
}