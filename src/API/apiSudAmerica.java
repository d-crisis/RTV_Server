package API;

import Entity.SudAmericaEntity;
import Util.HibernateUtil;
import org.hibernate.query.Query;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("/sudamerica")
public class apiSudAmerica {
@GET

@Produces({MediaType.APPLICATION_JSON})

public List<SudAmericaEntity> getInfoMappa(){
    List<SudAmericaEntity> normaleEntitiesOut;
    try {
        Query query= HibernateUtil.getSession().createQuery("FROM SudAmericaEntity");
        List<SudAmericaEntity> normaleEntities = query.list();

        for (SudAmericaEntity norm : normaleEntities){
            System.out.println("nome: " + norm.getNome() + "," +"latitudine: " + norm.getLatitude() + "," + "longitudine: " + norm.getLongitude() + ",");
        }
        normaleEntitiesOut = normaleEntities;
    } finally {
        HibernateUtil.getSession().close();
    }
    return normaleEntitiesOut;
}
}
