/*
 * author: mickypc@cuc.edu.cn
 * 2019-06-16
 */
package cn.edu.cuc.context;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public final class Constants implements EnvironmentAware {
	private static Constants myConstants = new Constants();

	//成员变量
	private Properties props = new Properties();

	Logger logger = LoggerFactory.getLogger("pagestatis");
	Logger admlogger = LoggerFactory.getLogger("adminlog");

	protected Constants() {
	}

	public void init() {
		checkSystem();
		getLogger().info("dataroot:{}", getProperty("dataroot"));
		File dataroot = new File(getProperty("dataroot"));
		if (dataroot.exists()) {
			dataroot.mkdirs();
		}
		getLogger().info("PageStatis Inited");
	}

	public Logger getLogger() {
    return logger;
  }

	public Logger getAdmLogger() {
		return admlogger;
	}

	public void checkSystem() {
		getLogger().info("===== Check System Env =====");
		getLogger().info("java.vm.version: {}", System.getProperty("java.vm.version"));
		getLogger().info("catalina.home: {}", System.getProperty("catalina.home"));
		getLogger().info("file.separator: {}", System.getProperty("file.separator"));
		getLogger().info("file.encoding: {}", System.getProperty("file.encoding"));
	}

	public static Constants getInstance() {
		return myConstants;
	}

	public String getUUID() {
		return java.util.UUID.randomUUID().toString().replaceAll("-", "");
	}

	private Environment env;

	@Override
	public void setEnvironment(Environment environment) {
		this.env = environment;
	}

	public String getProperty(String key) {
		return env.getProperty(key);
	}
	public String getStringValue(String key) {
		return env.getProperty(key);
	}
}
