package NumberGenerator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by jh_pc on 15-2-4.
 */
public class NumberGenerator {

    private final ArrayList<String> historyGenerateNUmbers;
    private  Random random;

    public  NumberGenerator(Random random){
        this.historyGenerateNUmbers=new ArrayList<String>();
        this.random=random;
    };
    /**
     * 产生4位位置上不想同的随机数
     * @return
     */
    public  String generate(){
        

        String digit=generateone();
        while(historyGenerateNUmbers.contains(digit)){
            digit=generateone();
        }
        if(historyGenerateNUmbers.size()==2)
        {
            historyGenerateNUmbers.remove(0);
        }
        historyGenerateNUmbers.add(digit);
        return digit;
    }

    /**
     * 产生随机数的方法
     * @return
     */
    private String generateone() {
        StringBuilder digits=new StringBuilder();

        while (digits.length()<4)
        {
            String number=String.valueOf((random.nextInt(10)));
            if(digits.indexOf(number)==-1)
            {
                digits.append(number);
            }
        }
        return  digits.toString();
    }


}
