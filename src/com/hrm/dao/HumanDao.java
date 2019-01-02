package com.hrm.dao;

import java.util.List;

import com.hrm.entity.Human;

public interface HumanDao {
	/**
	 * 查找所有人员信息
	 *
	 * @return 所有人员
	 */
	List<Human> findAll();

	/**
	 * 添加人员
	 *
	 * @param humanName			人名
	 * @param humanBirthday		生日
	 * @param humanGender		性别
	 * @param humanCareer		职业
	 * @param humanAddress		地址
	 * @param humanMobile		手机
	 */
	void add(String humanName, String humanBirthday, Boolean humanGender, String humanCareer, String humanAddress,
			String humanMobile);

	/**
	 * 删除人员
	 *
	 * @param id		编号
	 */
	void delete(String id);

	/**
	 * 查找某人员
	 *
	 * @param id		编号
	 * @return 某人员信息
	 */
	Human findOne(String id);

	/**
	 * 更新修改人员信息
	 *
	 * @param id				编号
	 * @param humanName			书名
	 * @param humanBirthday		生日
	 * @param humanGender		性别
	 * @param humanCareer		职业
	 * @param humanAddress		地址
	 * @param humanMobile		手机
	 */
	void update(String id, String humanName, String humanBirthday, Boolean humanGender, String humanCareer,
			String humanAddress, String humanMobile);

}
