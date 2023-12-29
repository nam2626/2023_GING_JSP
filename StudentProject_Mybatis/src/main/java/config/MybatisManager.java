package config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisManager {
	private static MybatisManager instance = new MybatisManager();
	private SqlSessionFactory sqlSessionFactory;

	private MybatisManager() {
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static MybatisManager getInstance() {
		if (instance == null)
			instance = new MybatisManager();
		return instance;
	}

	public SqlSession getSession() {
		return sqlSessionFactory.openSession(true);
	}
}




