package soap;

import bean.Order;
import org.springframework.stereotype.Component;
import soap.service.OrderService;

import javax.jws.WebService;

@Component
@WebService(endpointInterface = "soap.service.OrderService")
public class OrderServiceImpl implements OrderService {

    public Order getOrder(int id) {
        return new Order(id, "坂井泉水", "篮球", 5);
    }
}
