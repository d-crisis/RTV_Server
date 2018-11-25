package API;

import Entity.AsiaEntity;
import Util.HibernateUtil;
import org.hibernate.query.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
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
        List<AsiaEntity> normaleEntitiesOut=new ArrayList<>();
        Map<String,List> json =new HashMap<>();

        try {
            Query query= HibernateUtil.getSession().createQuery("FROM AsiaEntity");
            List<AsiaEntity> normaleEntities = query.list();
            normaleEntitiesOut = normaleEntities;
            json.put("mappa",normaleEntitiesOut);

        }
        finally {
            HibernateUtil.getSession().close();
            return Response.ok(json).build();
        }


    }

}
