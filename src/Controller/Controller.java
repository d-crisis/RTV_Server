package Controller;

import Entity.*;
import Util.HibernateUtil;
import org.hibernate.query.Query;

import java.util.List;

public class Controller {

    public List<AfricaEntity> queryAfrica(){

        Query query= HibernateUtil.getSession().createQuery("FROM AfricaEntity ");
        List<AfricaEntity> normaleEntities = query.list();
        HibernateUtil.getSession().close();
        return normaleEntities;
    }

    public List<AsiaEntity> queryAsia(){

        Query query= HibernateUtil.getSession().createQuery("FROM AsiaEntity ");
        List<AsiaEntity> normaleEntities = query.list();
        HibernateUtil.getSession().close();
        return normaleEntities;
    }

    public List<EuropaEntity> queryEuropa(){

        Query query= HibernateUtil.getSession().createQuery("FROM EuropaEntity");
        List<EuropaEntity> normaleEntities = query.list();
        HibernateUtil.getSession().close();
        return normaleEntities;
    }



    public List<SudAmericaEntity> querySudAmerica(){

        Query query= HibernateUtil.getSession().createQuery("FROM SudAmericaEntity ");
        List<SudAmericaEntity> normaleEntities = query.list();
        HibernateUtil.getSession().close();
        return normaleEntities;
    }

    public List<UsaEntity> queryUsa(){

        Query query= HibernateUtil.getSession().createQuery("FROM UsaEntity ");
        List<UsaEntity> normaleEntities = query.list();
        HibernateUtil.getSession().close();
        return normaleEntities;
    }

}
