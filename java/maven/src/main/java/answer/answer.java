package answer;

import AnswerGenerator.AnswerGenerator;

/**
 * Created by jh_pc on 15-2-3.
 */
public class answer {
    public String say() {

        AnswerGenerator isgo=new AnswerGenerator();
        int random=isgo.return_randomnum();
       String randoms =random+"";
        System.out.println(randoms);
        for(int i=0;i<randoms.length();i++)
        {
             if(randoms.indexOf(randoms.substring(i,i+1))!=i&&randoms.indexOf(randoms.substring(i,i+1))!=-1)
             {
                 randoms=say();
                 break;
             }

        }
        return  randoms;
    }
}
