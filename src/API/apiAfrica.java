package API;

import Entity.AfricaEntity;
import Util.HibernateUtil;
import org.hibernate.query.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/africa")
public class apiAfrica {
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public List<AfricaEntity> getInfoMappa(){
        List<AfricaEntity> normaleEntitiesOut;
        try {
            Query query= HibernateUtil.getSession().createQuery("FROM AfricaEntity");
            List<AfricaEntity> normaleEntities = query.list();

            for (AfricaEntity norm : normaleEntities){
                System.out.println("nome: " + norm.getNome() + "," +"latitudine: " + norm.getLatitude() + "," + "longitudine: " + norm.getLongitude() + ",");
            }
            normaleEntitiesOut = normaleEntities;
        } finally {
            HibernateUtil.getSession().close();
        }
        return normaleEntitiesOut;
    }

}
