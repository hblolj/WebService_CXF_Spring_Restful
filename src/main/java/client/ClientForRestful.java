package client;

import bean.Order;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import rest.RestfulTest1;

public class ClientForRestful {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(RestfulTest1.class);
        factoryBean.setAddress("http://localhost/services/rs/getOrder");
        RestfulTest1 restfulTest1 = (RestfulTest1) factoryBean.create();
        Order order = restfulTest1.getOrder();
        System.out.println(order.toString());
    }
}
