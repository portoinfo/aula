package com.portoinfo.aula;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.portoinfo.aula.entities.Order;
import com.portoinfo.aula.services.OrderService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	private double total;

	List<Order> listOrder = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order =  new Order(1034, 150.0, 20.0);
		listOrder.add(order);
		order =  new Order(2282, 800.0, 10.0);
		listOrder.add(order);
		order =  new Order(1309, 95.90, 0.0);
		listOrder.add(order);
		for(Order myorder : listOrder){
			total = orderService.total(myorder);
			System.out.println("Pedido código: " + myorder.getCode());
			System.out.printf("Valor Total: R$  %.2f%n", total);
		}
		
	}

}
