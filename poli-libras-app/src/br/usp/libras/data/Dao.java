package br.usp.libras.data;

import java.util.List;

import javax.persistence.NonUniqueResultException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Dao<T> {

    protected final Session session;
    private final Class clazz;

    public Dao(Session session, Class clazz) {
        this.session = session;
        this.clazz = clazz;
    }

    public void save(T u) {
        this.session.save(u);
    }

    public void merge(T u) {
        this.session.merge(u);
    }
    
    public void delete(T u) {
    	this.session.delete(u);
    }

    public T search(String name) throws NonUniqueResultException {
        
        return (T) session.createCriteria(this.clazz).add(
            Restrictions.ilike("name", name)).uniqueResult();
    }

    public T search(String field, String value) throws NonUniqueResultException {

        return (T) session.createCriteria(this.clazz).add(
            Restrictions.ilike(field, value)).uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<T> listAll() {
        
        try {
            return this.session.createCriteria(this.clazz).list();
        }
        catch (HibernateException e) {
            System.out.println(e);
            return null;
        }
    }
}
