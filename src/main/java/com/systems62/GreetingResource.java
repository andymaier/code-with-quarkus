package com.systems62;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("myGuiEntity")
    public Response myGuiEntitiy() {
        MyGuiEntity entity = new MyGuiEntity();
        entity.setField("Test");
        entity.setId(Math.round(Math.random()));
        return Response.ok(entity).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}