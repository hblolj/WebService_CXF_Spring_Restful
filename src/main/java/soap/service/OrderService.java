package soap.service;

import bean.Order;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderService {

    @WebMethod
    Order getOrder(int id);
}
