package com.lucas.fancycar.driverless;

public interface Car {

	   void move(String command) throws Exception;

	   void reportPosition();
	}
