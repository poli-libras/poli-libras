package br.usp.libras.data;

import org.hibernate.Session;
import br.usp.libras.sign.Sign;


public class SignDaoFactory<T> extends DaoFactory<T> {

    public SignDaoFactory(Session session) {
        super(session);
    }

    @Override
    public Dao<T> getDao() {
        return new Dao<T>(this.session, Sign.class);
    }
    
    public SignDao getSignDao() {
        return new SignDao(this.session);
    }

}
