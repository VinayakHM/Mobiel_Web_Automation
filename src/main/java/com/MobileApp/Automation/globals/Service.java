package com.MobileApp.Automation.globals;

import java.net.ServerSocket;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Service {

	/*
	 * Code to start and stop the Appium Server using AppiumDriverLocalService
	 */
	public void appium() {

		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		System.out.println("Appium Server is started with Default");
		service.stop();
		System.out.println("Stoping the Appium Server");
	}

	/*
	 * below Declaration belong to startServer function
	 */
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	private DesiredCapabilities cap;

	/*
	 * Code to start appium with more checks like Appium server is already
	 * running or not Not Run if the Appium server is already running
	 */

	public void startServer() {
		cap = new DesiredCapabilities();
		cap.setCapability("noReset", "false");

		builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4723);
		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");

		service = AppiumDriverLocalService.buildService(builder);
		service.start();

	}

	public void stopServer() {
		service.stop();
	}

	public boolean checkIfServerIsRunning(int port) {
		boolean isServerRunning = false;

		ServerSocket serverSocket;

		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (Exception e) {
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}

		return isServerRunning;
	}

	public static void main(String[] args) {

		Service serv = new Service();
		int port = 4723;
		if (!serv.checkIfServerIsRunning(port)) {
			System.out.println("**********");
			serv.startServer();
			System.out.println("**********");
			serv.stopServer();
		} else {
			System.out.println("Appium is already Running into the Posrt : " + port);
		}

	}
}
