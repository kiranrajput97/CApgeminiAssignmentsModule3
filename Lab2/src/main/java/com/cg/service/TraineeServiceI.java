package com.cg.service;

import java.util.List;

import com.cg.entity.Trainee;

public interface TraineeServiceI {

	public void add(Trainee t);

	public List<Trainee> reteriveAll();

	public Trainee retrieve(int id);

	public Boolean delete(int id);

	public void modify(Trainee trainee);
}
