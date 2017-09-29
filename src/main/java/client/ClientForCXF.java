package client;

import bean.Order;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import soap.service.OrderService;

public class ClientForCXF {

    public static OrderService getInterFace(){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(OrderService.class);
        factoryBean.setAddress("http://localhost/services/orderService");
        return (OrderService) factoryBean.create();
    }

    public static void main(String[] args) {
        OrderService service = getInterFace();
        Order order = service.getOrder(5);
        System.out.println(order.toString());
    }
}
