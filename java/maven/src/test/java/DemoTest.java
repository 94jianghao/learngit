import Demo.Demo;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by jh_pc on 15-2-2.
 */
public class DemoTest {
    @Test
    public void should_return_string_hi (){
        Demo demo = new Demo();
        String name= demo.say();
        assertThat(name).isEqualTo("hi");
    }
}
