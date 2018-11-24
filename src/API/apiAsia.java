package API;

import Entity.AsiaEntity;
import Util.HibernateUtil;
import org.hibernate.query.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/asia")
public class apiAsia {
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public List<AsiaEntity> getInfoMappa(){
        List<AsiaEntity> normaleEntitiesOut;
        try {
            Query query= HibernateUtil.getSession().createQuery("FROM AsiaEntity");
            List<AsiaEntity> normaleEntities = query.list();

            for (AsiaEntity norm : normaleEntities){
                System.out.println("nome: " + norm.getNome() + "," +"latitudine: " + norm.getLatitude() + "," + "longitudine: " + norm.getLongitude() + ",");
            }
            normaleEntitiesOut = normaleEntities;
        } finally {
            HibernateUtil.getSession().close();
        }
        return normaleEntitiesOut;
    }
}
