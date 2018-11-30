package API;

import Controller.Controller;
import Entity.AfricaEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("/africa")
public class apiAfrica {

    /**
     * @return
     */
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public Response getInfoMappa(){
        List<AfricaEntity> normaleEntitiesOut;
        Map<String,List> json =new HashMap<>();
        normaleEntitiesOut = new Controller().queryAfrica();
        json.put("mappa",normaleEntitiesOut);
        return Response.ok(json).build();
    }

}
