package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sys.dao.UserDao;
import com.sys.pojo.User;

public class Demo {
	static SqlSessionFactory sf = null ;
	static {
		try {
			InputStream  is= Resources.getResourceAsStream("config.xml");
			sf = new SqlSessionFactoryBuilder().build(is);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void addUser() {
		SqlSession session = sf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		try {
			mapper.addUser(new User(0, "user","888","man","Gosh", null));
			session.commit();
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	
	}
	@Test
	public void delUser() {
		SqlSession session = sf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		try {
			mapper.delUser("user");
			session.commit();
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void updateUser() {
		SqlSession session = sf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		try {
			mapper.updateUser("user2","Gos");
			session.commit();
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getAll() {
		SqlSession session = sf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		try {
			System.out.println(mapper.getAll());
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getAllWithCardid() {
		SqlSession session = sf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		try {
			System.out.println(mapper.getAllWithCardid());
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getAllWithPhone() {
		SqlSession session = sf.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		try {
			System.out.println(mapper.getAllWithPhone());
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
