package API;

import Entity.UsaEntity;
import Util.HibernateUtil;
import org.hibernate.query.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usa")
public class apiUSA {
    @GET

    @Produces({MediaType.APPLICATION_JSON})

    public List<UsaEntity> getInfoMappa(){
        List<UsaEntity> normaleEntitiesOut;
        try {
            Query query= HibernateUtil.getSession().createQuery("FROM UsaEntity");
            List<UsaEntity> normaleEntities = query.list();

            for (UsaEntity norm : normaleEntities){
                System.out.println("nome: " + norm.getNome() + "," +"latitudine: " + norm.getLatitude() + "," + "longitudine: " + norm.getLongitude() + ",");
            }
            normaleEntitiesOut = normaleEntities;
        } finally {
            HibernateUtil.getSession().close();
        }
        return normaleEntitiesOut;
    }
}
