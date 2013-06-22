package br.usp.libras.data;

import java.util.List;

import org.hibernate.Session;

import br.usp.libras.sign.Sign;

public class SignDao extends Dao<Sign> {

    SignDao(Session session) {
        super(session, Sign.class);
    }

    public List<Sign> searchByNearWord(String word) {
        
        String ejbql = "SELECT OBJECT(s) FROM Sign AS s, IN (s.words) w WHERE w.word LIKE '%" + word + "%'";
        return (List<Sign>) session.createQuery(ejbql).list();
    }

    public List<Sign> searchByWord(String word) {
        
        String ejbql = "SELECT OBJECT(s) FROM Sign AS s, IN (s.words) w WHERE w.word = '" + word + "'";
        return (List<Sign>) session.createQuery(ejbql).list();
    }
    
    public List<Sign> searchByNearName(String name) {

        String ejbql = "SELECT OBJECT(s) FROM Sign AS s WHERE s.name LIKE '%" + name + "%'";
        return (List<Sign>) session.createQuery(ejbql).list();
    }
    
    public Sign searchByName(String name) {
        
        String ejbql = "SELECT OBJECT(s) FROM Sign AS s WHERE s.name LIKE '" + name + "'";
        return (Sign) session.createQuery(ejbql).uniqueResult();        
    }
    
}
