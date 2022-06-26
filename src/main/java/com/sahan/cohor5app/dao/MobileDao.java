package com.sahan.cohor5app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sahan.cohor5app.config.DbConn;
import com.sahan.cohor5app.model.Mobile;

public class MobileDao {
	
	public List<Mobile> getAllMobiles() {
		Connection conn = DbConn.getConnection();
		
		try {
			
			//Prepare the SQL Query
			String sql = "SELECT * FROM tbl_mobile";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			List<Mobile> mobileList = new ArrayList<>();
			
			while(rs.next()) {
				Mobile mobile = new Mobile();
				mobile.setId(rs.getInt("id"));
				mobile.setBrand(rs.getString("brand"));
				mobile.setModel(rs.getString("model"));
				mobile.setCapacity(rs.getInt("capacity"));
				mobile.setPrice(rs.getFloat("price"));
				
				mobileList.add(mobile);
			}
			conn.close();
			return mobileList;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}		
		
	}
	
	
	public Mobile getAMobile(int id) {
		
		List<Mobile> mobiles = getAllMobiles();
		
		for (Mobile mobile : mobiles) {
			if (mobile.getId() == id) {
				return mobile;
			}
		}
		return null;
	}
	
	
	
	public int addMobile(Mobile mobile) {
		Connection conn = DbConn.getConnection();
		
		try {
			String sql = "INSERT INTO `tbl_mobile` (`brand`, `model`, `capacity`, `price`) VALUES (?,?,?,?)";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, mobile.getBrand());
			stmt.setString(2, mobile.getModel());
			stmt.setInt(3, mobile.getCapacity());
			stmt.setFloat(4, mobile.getPrice());
			
			int response = stmt.executeUpdate();
			conn.close();
			return response;
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	//fakeDBAccess
/*	public List<Mobile> fakeData(){
		
		List<Mobile> mobileList = new ArrayList<Mobile>();
		
		Mobile m1 = new Mobile(1, "Apple", "XS", 256, 350000.00f);
		mobileList.add(m1);
		Mobile m2 = new Mobile(2, "Samsung", "s7", 64, 66000.40f);
		mobileList.add(m2);
		Mobile m3 = new Mobile(3, "HTC", "One", 32, 50000.00f);
		mobileList.add(m3);
		
		return mobileList;
	}
*/
}
