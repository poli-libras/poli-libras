package br.usp.libras.dic;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import br.usp.libras.data.SignDao;
import br.usp.libras.data.SignDaoFactory;
import br.usp.libras.sign.Sign;
import br.usp.libras.dic.SignDictionary;

public class SQLiteDictionary implements SignDictionary{

	private static final String DATABASE_URL = "jdbc:sqlite:resources/wikilibras.db";
	//private static final String DATABASE_URL =  "jdbc:sqlite::resources:wikilibras.db";
	
	private SignDao dao;
	
	public SQLiteDictionary(){
		
		Configuration configSqlite = new AnnotationConfiguration().setProperty("hibernate.connection.url", DATABASE_URL);
		SessionFactory sessions = configSqlite.configure().buildSessionFactory();
		Session session = sessions.openSession();        
        SignDaoFactory<Sign> factory = new SignDaoFactory<Sign>(session);
        this.dao = factory.getSignDao();

	}

	@Override
	public List<Sign> nearSigns(String arg0) {
		
		List<Sign> signs = dao.searchByNearName(arg0);
        if (signs != null)
            return signs;
        else
            return new ArrayList<Sign>();
	}

	@Override
	public Sign signByName(String arg0) {
		
		return dao.searchByName(arg0);
	}

	@Override
	public Sign simpleTranslate(String arg0) {
		List<Sign> signs = dao.searchByWord(arg0);
        if (signs.isEmpty())
            return null;
        else
            return signs.get(0);
	}

	@Override
	public List<Sign> translate(String arg0) {
		
		List<Sign> signs = dao.searchByWord(arg0);
        if (signs != null)
            return signs;
        else
            return new ArrayList<Sign>();
	}

	

}
