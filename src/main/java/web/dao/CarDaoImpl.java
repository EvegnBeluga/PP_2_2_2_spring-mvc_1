package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import web.model.Car;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
   // @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    private final SessionFactory sessionFactory;

    public CarDaoImpl() {
        sessionFactory = null;
    }

//    public CarDaoImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    @Override
    public List<Car> listCars(int count) {

        sessionFactory.getCurrentSession().save(new Car ("Mercedes SLC (R172)", "XTA210990Y2766389", 2016));
        sessionFactory.getCurrentSession().save(new Car ("Mercedes SLK (R170)", "X7MXKN7FP6M004128", 1996));
        sessionFactory.getCurrentSession().save(new Car ("Pontiac Bonneville", "X9FMMXXEEBMBM38625", 1993));
        sessionFactory.getCurrentSession().save(new Car ("Toyota RAV-4", "JT153JSG000151888", 2006));
        sessionFactory.getCurrentSession().save(new Car ("Toyota Blizzard", "XTA210990Y2766389", 1985));
        sessionFactory.getCurrentSession().save(new Car ("Toyota Camry", "VF37BRFVE12345678", 2014));
        sessionFactory.getCurrentSession().save(new Car ("Лада Калина", "JMZNK14Y26132582", 2021));
        sessionFactory.getCurrentSession().save(new Car ("Toyota Camry", "JT4RN56S2F0139246", 1987));

        TypedQuery<Car> query;
        if(count<5)
            query = (TypedQuery<Car>) sessionFactory.getCurrentSession().createQuery("FROM Car").setMaxResults(count);
        else {
            query = (TypedQuery<Car>) sessionFactory.getCurrentSession().createQuery("from Car ");
        }
        return query.getResultList();
    }
}
