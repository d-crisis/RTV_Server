package API;

import Controller.Controller;
import Entity.AsiaEntity;
import Util.HibernateUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("/asia")
public class apiAsia {
    /**
     * @return
     */
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public Response getInfoMappa(){
        List<AsiaEntity> normaleEntitiesOut;
        Map<String,List> json =new HashMap<>();

        try {
            normaleEntitiesOut = new Controller().queryAsia();
            json.put("mappa",normaleEntitiesOut);

        }
        finally {
            HibernateUtil.getSession().close();
            return Response.ok(json).build();
        }


    }

}
