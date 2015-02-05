
import AnswerGenerator.AnswerGenerator;
import NumberGenerator.NumberGenerator;
import answer.answer;
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Assertions.fail;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.mock;

/**
 * Created by jh_pc on 15-2-3.
 */
public class randomnum {
       @Test
       /**
        * 测试类
        */
       public void should_number_Test(){
           String result=result();
           assertThat(result).isEqualTo("4A0B");

       }
    @Test
    public void should_number_Test5(){
        String result=result();
           assertThat(result).isEqualTo("0A0B");


    }
    @Test
    public void should_number_Test2(){
        String result=result();

           assertThat(result).isEqualTo("0A0B");



    }
    @Test
    public void should_number_Test3(){
        String result=result();

           assertThat(result).isEqualTo("2A2B");



    }
    @Test
    public void should_number_Test4(){
        String result=result();

           assertThat(result).isEqualTo("2A1B");


    }



    @Test
    public  void should_number_Test1(){
        //new 一个产生随机数的类
        AnswerGenerator answerGenerator = new AnswerGenerator();
        //new 一个比较类
        answer answer  = new answer();
        String result=answer.say();
        String result1=answer.say();
        String result2=answer.say();
        System.out.println("不重复结果1："+result);
        System.out.println("不重复结果2："+result1);
        System.out.println("不重复结果3："+result2);
        assertThat(result == result1 || result == result2 || result2 == result1).isEqualTo(false);


    }

    public  String result(){
        //new 一个产生随机数的类
        AnswerGenerator answerGenerator = new AnswerGenerator();
        //new 一个产生比较测试类 返回 一个String类型的结果
        CompareNumber compareNumber = new CompareNumber();
        String result= compareNumber.numTest(answerGenerator.return_randomnum(),-1);
        System.out.println("产生结果：+++"+result);
        return  result;
    }
    @Test
    public  void  ingter_test(){
        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        String number=numberGenerator.generate();
        try {
            Integer.parseInt(number);
        }
        catch (NumberFormatException e){
            fail("result should be a number.");
        }

    }

    @Test
    public  void  ingter_test_resultnumber_length_in_4(){
     //产生的是不是4位数
        String number=new NumberGenerator(new Random()).generate();
        assertThat(number.length()).isEqualTo(4);
    }
    @Test
    public void integer_result_no_doplicate_number(){

     // 产生的随机数各位数不同
        String number=new NumberGenerator(new Random()).generate();
        for (int i=0;i<number.length();i++)
        {
            char ch=number.charAt(i);
            assertThat(number.indexOf(i)).isEqualTo(number.lastIndexOf(i));
        }
    }
    @Test
    public  void should_not_repeat_in_3_times(){
           //三次有重复
        Random random=mock(Random.class);

        given(random.nextInt(10))
                    .willReturn(1, 2, 3, 4)
                    .willReturn(1,2,3,4)
                    .willReturn(2,3,4,5)
                    .willReturn(3, 4, 5, 6);

        NumberGenerator numbergenerstor=new NumberGenerator(random);

        HashSet<String> numbers=new HashSet<String>();
        numbers.add(numbergenerstor.generate());
        numbers.add(numbergenerstor.generate());
        numbers.add(numbergenerstor.generate());

        System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);


       /* String number1=new NumberGenerator(new Random()).generate();
        String number2=new NumberGenerator(new Random()).generate();
        String number3=new NumberGenerator(new Random()).generate();
        assertThat(number1!=number2||number2!=number3||number3!=number1).isEqualTo(false);*/
    }

   @Test
    public void  should_repeat_in_3_times(){
       //三次不重复
        Random random=mock(Random.class);

        given(random.nextInt(10))
                .willReturn(1,2,3,4)
                .willReturn(2,3,4,5)
                .willReturn(3,4,5,6)
                .willReturn(1,2,3,4);


        NumberGenerator numbergenerstor=new NumberGenerator(random);

        HashSet<String> numbers=new HashSet<String>();
        numbers.add(numbergenerstor.generate());
        numbers.add(numbergenerstor.generate());
        numbers.add(numbergenerstor.generate());
        numbers.add(numbergenerstor.generate());
       System.out.println(numbers);
        assertThat(numbers.size()).isEqualTo(3);
    }



}
