package dao;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import model.Master;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MasterDao {

    private static final MasterDao INSTANCE = new MasterDao();
    public Master getMaster(Long id) {
        System.out.println(id);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            return session.find(Master.class, id);
        }
    }
    public static MasterDao getInstance() {
        return INSTANCE;
    }
}
