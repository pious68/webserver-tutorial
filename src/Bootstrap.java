import connector.Connector;

/**
 * 启动服务器
 * @author pious
 */
public final class Bootstrap {
    public static void main(String[] args) {
//        ConnectorBIOSocket connector = new ConnectorBIOSocket();
        Connector connector = new Connector();
        connector.start();
    }
}