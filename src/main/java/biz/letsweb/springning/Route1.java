package biz.letsweb.springning;

import org.apache.camel.builder.RouteBuilder;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author tomasz
 */
@Component
public class Route1 extends RouteBuilder {

    @Autowired
    private Activity activityOne;
    
    @Autowired
    private SqlSession sqlSession;

    @Override
    public void configure() throws Exception {
        from("timer://foo?repeatCount=1")
                .to("direct:one")
                ;

        from("direct:one")
                .bean(activityOne);
        
    }

}