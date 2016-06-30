package com.github.sonofflyingpig.trylaunch4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class OhHello {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OhHello.class);
	
	private OhHello() {}

	public static void main(final String... args) {
		LOGGER.info("Oh, hello");
	}

}
