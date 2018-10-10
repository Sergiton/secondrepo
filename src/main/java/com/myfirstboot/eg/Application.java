/* First Chnage in Assign */


package com.myfirstboot.eg.com.myfirstboot.eg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@Configuration
@ConfigurationProperties("message")
class MyConfiguration
{
	private String special1;
	private String special2;
	private String special3;
	
	MyConfiguration(){}
	
	
	@Override
	public String toString() {
		return "MyConfiguration [special1=" + special1 + ", special2=" + special2 + ", special3=" + special3
				+ ", getSpecial1()=" + getSpecial1() + ", getSpecial2()=" + getSpecial2() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getSpecial1() {
		return special1;
	}
	public void setSpecial1(String special1) {
		this.special1 = special1;
	}
	public String getSpecial2() {
		return special2;
	}
	public void setSpecial2(String special2) {
		this.special2 = special2;
	}

	public String getSpecial3() {
		return special3;
	}
	
	public void setSpecial3(String special3) {
		this.special3 = special3;
	}
	
	
	

}
