package API;

import Entity.UsaEntity;
import Util.HibernateUtil;
import org.hibernate.query.Query;

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
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public Response getInfoMappa(){
        List<UsaEntity> normaleEntitiesOut;
        Map<String,List> json =new HashMap<>();
        try {
            Query query= HibernateUtil.getSession().createQuery("FROM UsaEntity");
            List<UsaEntity> normaleEntities = query.list();
            normaleEntitiesOut = normaleEntities;
            json.put("mappa",normaleEntitiesOut);
        } finally {
            HibernateUtil.getSession().close();
            return Response.ok(json).build();
        }

    }
}
