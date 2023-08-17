package com.portoinfo.aula.services;

import org.springframework.stereotype.Service;
import com.portoinfo.aula.entities.Order;

@Service
public class ShippingService {

	private double limit1 		= 100.0;
	private double shipment1 	= 20.0;

	private double limit2 		= 200.0;
	private double shipment2 	= 12.0;

	private double shipment3 	= 0.0;

	
	public ShippingService() {
	}

	public double shipment(Order order) {

		if (order.getBasic() <= limit1) {
			return shipment1;
		} else if (order.getBasic() <= limit2) {
			return shipment2;
		} else {
			return shipment3;
		}
		
	}
}
