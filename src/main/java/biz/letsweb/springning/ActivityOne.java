package biz.letsweb.springning;

import org.springframework.stereotype.Component;

/**
 *
 * @author tomasz
 */
@Component
public class ActivityOne implements Activity {

    @Override
    public String doActivity(String input) {
        System.out.println("input: " + input);
        return "...done";
    }

}
