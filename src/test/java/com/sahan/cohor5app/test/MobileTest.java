package com.sahan.cohor5app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import com.sahan.cohor5app.dao.MobileDao;
import com.sahan.cohor5app.model.Mobile;

public class MobileTest {

//	@Test
//	public void TestDbConnection() {
//		Connection actual = DbConn.getConnection();
//		assertNotNull(actual);
//	}
//	
//	
//	private int expected = 5;
//	@Test
//	public void TestGetMobiles() {
//		MobileDao mobileDao = new MobileDao();
//		int actual = mobileDao.getAllMobiles().size();
//		assertEquals(expected, actual);
//	}
	
	
//	private Mobile mobile = new Mobile("OnePlus", "10 Pro", 256, 330000.00f);
//	private int expected = 1;
	
//	@Test
//	public void TestAddMobile() {
//		MobileDao mobileDao = new MobileDao();
//		int actual = mobileDao.addMobile(mobile);
//		assertEquals(expected, actual);
//	}
//	
//	private Logger logger = LogManager.getLogger(MobileTest.class);
//	
//	@Test
//	public void TestFileLogging() {
//		
//		logger.fatal("THIS IS A FATAL");
//		logger.error("THIS IS A ERROR");
//		logger.warn("THIS IS A WARN");
//		logger.info("THIS IS A INFO");
//		logger.debug("THIS IS A DEBUG");
//		logger.trace("THIS IS A TRACE");
//		
//	}
	
	int id = 2;
	
	@Test
	public void TestFetchingAMobile() {
		
		MobileDao mobileDao = new MobileDao();
		Mobile actual = mobileDao.getAMobile(id);
		
		assertNotNull(actual);
		
	}
}
