package API;

import Entity.SudAmericaEntity;
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

@Path("/sudamerica")
public class apiSudAmerica {
@GET

@Produces({MediaType.APPLICATION_JSON})

public Response getInfoMappa(){
    List<SudAmericaEntity> normaleEntitiesOut;
    Map<String,List> json =new HashMap<>();
    try {
        Query query= HibernateUtil.getSession().createQuery("FROM SudAmericaEntity");
        List<SudAmericaEntity> normaleEntities = query.list();
        normaleEntitiesOut = normaleEntities;
        json.put("mappa",normaleEntitiesOut);
    } finally {
        HibernateUtil.getSession().close();
        return Response.ok(json).build();
    }

}
}
