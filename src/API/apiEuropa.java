package API;

import Entity.EuropaEntity;
import org.hibernate.query.Query;
import Util.HibernateUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/europa")
public class apiEuropa {

    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public List<EuropaEntity> getInfoMappa(){
        List<EuropaEntity> normaleEntitiesOut;
        try {
            Query query= HibernateUtil.getSession().createQuery("FROM EuropaEntity");
            List<EuropaEntity> normaleEntities = query.list();

            for (EuropaEntity norm : normaleEntities){
                System.out.println("nome: " + norm.getNome() + "," +"latitudine: " + norm.getLatitude() + "," + "longitudine: " + norm.getLongitude() + ",");
            }
            normaleEntitiesOut = normaleEntities;
        } finally {
            HibernateUtil.getSession().close();
        }
        return normaleEntitiesOut;
    }

}