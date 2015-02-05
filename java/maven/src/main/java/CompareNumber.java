import java.util.Scanner;
/**
 * Created by jh_pc on 15-2-2.
 */
public class CompareNumber {

    /**
     * num的Test、方法
     *
     */
    public String numTest(int num,int num1) {
        Scanner input=new Scanner(System.in);//创建一个键盘扫描类对象
        //System.out.print("请您输入你猜测的4位数");
        int randomnum=num;
        //int intonum=input.nextInt();   //输入整型
        int intonum=1234;
        int[] randomnums={randomnum/1000,randomnum/100%10,randomnum/10%10,randomnum%10};
        int[] nums={intonum/1000,intonum/100%10,intonum/10%10,intonum%10};
        int anumber=0;
        int bnumber=0;
        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length;j++) {

                if (nums[i]==randomnums[j]) {
                    anumber++;
                    if (nums[j]==randomnums[j])
                    {
                        bnumber++;
                    }
                }
            }
        }
         return  anumber+"A"+bnumber+"B";
    }
}
