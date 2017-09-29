package rest;

import bean.Order;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component("restComponent")
public class RestfulTest1 {

    @GET
    @Path("/getOrder")
    @Produces({MediaType.APPLICATION_JSON})
    public Order getOrder(){
        return new Order(1024L, "Zard", "蜂蜜柚子茶", 2);
    }
}
