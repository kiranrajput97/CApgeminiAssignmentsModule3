package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeDaoI;
import com.cg.entity.Trainee;


@Service
public class TraineeService implements TraineeServiceI{

	@Autowired
	TraineeDaoI traineeDao;
	
	@Override
	public void add(Trainee t)
	{
		traineeDao.add(t);
	}
	
	@Override
	public List<Trainee> reteriveAll()
	{
		return traineeDao.reteriveAll();
	}

	@Override
	public Trainee retrieve(int id)
	{
		return traineeDao.retrieve(id);
	}
	
	@Override
	public Boolean delete(int id)
	{
		return traineeDao.delete(id);
	}

	@Override
	public void modify(Trainee trainee)
	{
		traineeDao.modify(trainee);
	}
}
