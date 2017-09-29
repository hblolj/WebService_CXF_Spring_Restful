package server;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import soap.OrderServiceImpl;

public class Service {

    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setServiceClass(OrderServiceImpl.class);
        factoryBean.setAddress("http://localhost/services/orderService");
        Server server = factoryBean.create();
        server.start();
        System.out.println("服务启动成功");
    }
}
