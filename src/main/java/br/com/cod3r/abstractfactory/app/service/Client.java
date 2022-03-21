package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new RestAbstractFactory();

		UserService userService = factory.getUserService();
		userService.save("Andre");
		userService.delete(5);

		CarService carService = factory.getCarService();
		carService.save("Tesla P85D");
		carService.update("Tesla X");
	}
}
