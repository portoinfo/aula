package com.portoinfo.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portoinfo.aula.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {

		return order.getBasic() - discount(order.getBasic(), order.getDiscount()) + shippingService.shipment(order);

	}

	private double discount(double basic, double discount) {

		return basic * discount / 100;

	}
}
