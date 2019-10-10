import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandartServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure();
        StandartServiceRegistryBuilder builder = new StandartServiceRegistryBuilder()
                .applySettings(sfg.getProperties());
        sessionFactory = cfg.buildSessionFactory(builder.build());
    }
}