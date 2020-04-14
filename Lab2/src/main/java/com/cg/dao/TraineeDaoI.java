package com.cg.dao;

import java.util.List;
import com.cg.entity.Trainee;

public interface TraineeDaoI {

	public void add(Trainee t);

	public List<Trainee> reteriveAll();

	public Trainee retrieve(int id);

	public Boolean delete(int id);

	public void modify(Trainee trainee);
}
