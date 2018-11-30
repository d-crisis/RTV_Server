package API;

import Controller.Controller;
import Entity.UsaEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/usa")
public class apiUSA {
    /**
     * @return
     */
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public Response getInfoMappa(){
        List<UsaEntity> normaleEntitiesOut;
        Map<String,List> json =new HashMap<>();
        normaleEntitiesOut = new Controller().queryUsa();
        json.put("mappa",normaleEntitiesOut);
        return Response.ok(json).build();

    }
}
