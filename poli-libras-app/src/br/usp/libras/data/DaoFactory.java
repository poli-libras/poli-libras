package br.usp.libras.data;

import org.hibernate.Session;
import org.hibernate.Transaction;


public abstract class DaoFactory<T> {

    // session é o EntityManager do Hibernate
    protected final Session session;
    protected Transaction transaction;

    public DaoFactory(Session session) {
        this.session = session;
    }

    public void beginTransaction() {
        this.transaction = this.session.beginTransaction();
    }

    public void commit() {
        this.transaction.commit();
        this.transaction = null;
    }

    public boolean hasTransaction() {
        return this.transaction != null;
    }

    public void rollback() {
        this.transaction.rollback();
        this.transaction = null;
    }

    public void close() {
        this.session.close();
    }

    public abstract Dao<T> getDao();
    
}
