import connector.Connector;

/**
 * 启动服务器
 * @author pious
 */
public final class Bootstrap {
    public static void main(String[] args) {
//        ConnectorBIOSocket connector = new ConnectorBIOSocket();
        Connector connector = new Connector();
        System.out.println("Dev BRANCH");
        System.out.println("main add.");
        connector.start();
    }
}