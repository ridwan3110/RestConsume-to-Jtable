/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfulclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import javax.ws.rs.core.MediaType;
import restconsume.model.ListProduct;

/**
 *
 * @author Muhammad Ridwan
 */
public class ProductRestfullClient {
    private WebResource webResource;
    private Client client;
    private static final String BASE_URL="http://localhost:8080/";

    public ProductRestfullClient() {
        client = Client.create(new DefaultClientConfig());
        webResource = client.resource(BASE_URL).path("Customer");
    }
    
    public ListProduct findAll(){
        WebResource wr = webResource;
        return wr.path("getlist").accept(MediaType.APPLICATION_JSON).get(ListProduct.class);
    }
    
}
