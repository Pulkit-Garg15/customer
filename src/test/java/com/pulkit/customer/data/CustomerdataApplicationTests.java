package com.pulkit.customer.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pulkit.customer.data.entity.Customer;
import com.pulkit.customer.data.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {
	
	@Autowired
	CustomerRepository customerRepo;

	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Pulkit");
		customer.setEmail("pulkitgarg360@gmail.com");
		customerRepo.save(customer);
		
		Customer customer1 = new Customer();
		customer1.setName("Swapnil");
		customer1.setEmail("swapi.garg@gmail.com");
		customerRepo.save(customer1);
		
	}
	
	@Test
	void testFindById() {
		System.out.println(customerRepo.findById(2l).get());
	}
	
	@Test
	void testUpdateCustomer() {
		Customer customer = customerRepo.findById(1l).get();
		customer.setEmail("pulkitgarg360@yahoo.com");
		customerRepo.save(customer);
	}
	
	@Test
	void testDeleteCustomer() {
		customerRepo.delete(customerRepo.findById(4l).get());
	}

}
