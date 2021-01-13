package org.acme.mongodb;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/fruits")
public class FruitResource {

    @Inject FruitService fruitService;

    @GET
    public List<Fruit> list() {
				// return fruitService.list();
				Fruit fruit = new Fruit();
				fruit.setId(1);
				fruit.setName("Banana");
				fruit.setDescription("This is a banana.");
				fruitService.add(fruit);
				return fruitService.list();
    }

    @POST
    public List<Fruit> add(Fruit fruit) {
        fruitService.add(fruit);
        return list();
    }
}
