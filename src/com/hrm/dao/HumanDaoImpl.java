package com.hrm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hrm.entity.Human;
import com.hrm.util.DBUtils;

public class HumanDaoImpl implements HumanDao {
	@Override
	public List<Human> findAll() {
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		List<Human> list = new ArrayList<>();
		Human human;
		try {
			conn = DBUtils.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery("select * from profile");
			while (rs.next()) {
				human = new Human();
				human.setId(rs.getString("id"));
				human.setName(rs.getString("name"));
				human.setBirthday(rs.getString("birthday"));
				human.setGender(rs.getBoolean("gender"));
				human.setCareer(rs.getString("career"));
				human.setAddress(rs.getString("address"));
				human.setMobile(rs.getString("mobile"));

				list.add(human);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(rs);
			DBUtils.close(statement);
			DBUtils.close(conn);
		}
		return list;
	}

	@Override
	public void add(String humanName, String humanBirthday, Boolean humanGender, String humanCareer,
			String humanAddress, String humanMobile) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(
					"insert into profile(name, birthday, gender, career, address, mobile) values (? ,?, ?,?,?,?)");
			ps.setString(1, humanName);
			ps.setString(2, humanBirthday);
			ps.setBoolean(3, humanGender);
			ps.setString(4, humanCareer);
			ps.setString(5, humanAddress);
			ps.setString(6, humanMobile);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(ps);
			DBUtils.close(conn);
		}
	}

	@Override
	public void delete(String id) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("delete from profile where id = ?");
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(ps);
			DBUtils.close(conn);
		}
	}

	@Override
	public Human findOne(String id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Human human = new Human();
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("select * from profile where id = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				human.setId(rs.getString("id"));
				human.setName(rs.getString("name"));
				human.setBirthday(rs.getString("birthday"));
				human.setGender(rs.getBoolean("gender"));
				human.setCareer(rs.getString("career"));
				human.setAddress(rs.getString("address"));
				human.setMobile(rs.getString("mobile"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(rs);
			DBUtils.close(ps);
			DBUtils.close(conn);
		}
		return human;
	}

	@Override
	public void update(String id, String humanName, String humanBirthday, Boolean humanGender, String humanCareer,
			String humanAddress, String humanMobile) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement(
					"update profile set name = ?, birthday = ?, gender = ?, career = ?, address=?,mobile=? where id = ?");
			ps.setString(1, humanName);
			ps.setString(2, humanBirthday);
			ps.setBoolean(3, humanGender);
			ps.setString(4, humanCareer);
			ps.setString(5, humanAddress);
			ps.setString(6, humanMobile);
			ps.setString(7, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(ps);
			DBUtils.close(conn);
		}
	}

}
