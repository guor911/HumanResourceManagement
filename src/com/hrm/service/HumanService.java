package com.hrm.service;

import java.util.List;

import com.hrm.dao.HumanDao;
import com.hrm.dao.HumanDaoImpl;
import com.hrm.entity.Human;

public class HumanService {
	private HumanDao humanDao = new HumanDaoImpl();

	public List<Human> findAll() {
		return humanDao.findAll();
	}

	public void add(String humanName, String humanBirthday, Boolean humanGender, String humanCareer,
			String humanAddress, String humanMobile) {
		humanDao.add(humanName, humanBirthday, humanGender, humanCareer, humanAddress, humanMobile);
	}

	public void delete(String id) {
		humanDao.delete(id);
	}

	public Human findOne(String id) {
		return humanDao.findOne(id);
	}

	public void update(String id, String humanName, String humanBirthday, Boolean humanGender, String humanCareer,
			String humanAddress, String humanMobile) {
		humanDao.update(id, humanName, humanBirthday, humanGender, humanCareer, humanAddress, humanMobile);
	}

}
