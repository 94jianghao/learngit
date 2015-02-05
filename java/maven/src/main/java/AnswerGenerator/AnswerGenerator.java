package AnswerGenerator;

import static java.lang.Math.random;

/**
 * Created by jh_pc on 15-2-3.
 * 产生随机数类
 */
public class AnswerGenerator {
    /**
     * 产生一个4位数的随机数
     * @return
     */
    public int return_randomnum() {
        int result=(int)(Math.random()*9000)+1000;
        System.out.println(result);
        return result;
    }


}
