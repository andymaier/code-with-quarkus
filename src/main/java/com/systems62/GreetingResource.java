package com.systems62;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        MyGuiEntity entity = new MyGuiEntity();
        entity.setField("Test");
        entity.setId(Math.round(Math.random()));
        return Response.ok(entity).build();
    }
}