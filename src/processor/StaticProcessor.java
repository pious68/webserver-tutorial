package processor;



import connector.Request;
import connector.Response;

import java.io.IOException;

/**
 * 处理静态的资源请求
 * @author pious
 */
public class StaticProcessor {

    public void process(Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}