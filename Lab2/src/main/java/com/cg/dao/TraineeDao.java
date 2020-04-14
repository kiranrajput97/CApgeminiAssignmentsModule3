package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.cg.entity.Trainee;

@Transactional
@Repository
public class TraineeDao implements TraineeDaoI{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void add(Trainee t)
	{		
		em.persist(t);
	}

	@Override
	public List<Trainee> reteriveAll()
	{
		String Qstr="SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query=em.createQuery(Qstr,Trainee.class);
		return query.getResultList();
	}
	
	@Override
	public Trainee retrieve(int id)
	{
		return em.find(Trainee.class, id);
	}
	
	@Override
	public Boolean delete(int id)
	{
		Trainee t=em.find(Trainee.class, id);//this method will which id to remove
		
		System.out.println(t.getTraineeId() +" "+t.getTraineeName()+" is removed");
		
		em.remove(t);//this is object from the database
		
		return true;
		
	}

	@Override
	public void modify(Trainee trainee)
	{
		Trainee traineeUpdate= em.find(Trainee.class, trainee.getTraineeId());		
		traineeUpdate.setTraineeName(trainee.getTraineeName());
		traineeUpdate.setTraineeDomain(trainee.getTraineeDomain());
		traineeUpdate.setTraineeLocation(trainee.getTraineeLocation());
	}
	
}
