package biz.letsweb.springning;

import org.apache.camel.spring.javaconfig.Main;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author tomasz
 */
@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setConfigClass(Application.class);
        main.run();

    }
    


}
