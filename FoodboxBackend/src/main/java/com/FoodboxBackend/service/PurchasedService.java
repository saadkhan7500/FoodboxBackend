package com.FoodboxBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodboxBackend.entities.Purchased;
import com.FoodboxBackend.repo.PurchasedRepo;

@Service
public class PurchasedService {
	
	@Autowired
	private PurchasedRepo purchasedRepo;
	
	public Purchased addPurchased(Purchased purchased)
	{
		purchased.setStatus("Pending");
		return purchasedRepo.save(purchased);
	}
	
	public List<Purchased> getAllPurchasedService()
	{
		List<Purchased> pur= (List<Purchased>) purchasedRepo.findAll();
		return pur;
	}
	
	public List<Purchased> getPurchasedByUserEmailService(String email)
	{
		List<Purchased> pur = (List<Purchased>) purchasedRepo.findByUserEmail(email);
		return pur;
	}
	
}
