package com.xworkz.spring.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.repository.HotelRepo;
import com.xworkz.spring.repository.PartyRepo;
import com.xworkz.spring.service.BookService;
import com.xworkz.spring.service.BusService;
import com.xworkz.spring.service.FactoryService;
import com.xworkz.spring.service.FanService;
import com.xworkz.spring.service.HotelService;
import com.xworkz.spring.service.MobileService;
import com.xworkz.spring.service.PartyService;
import com.xworkz.spring.service.PhonePayService;
import com.xworkz.spring.service.TvService;
import com.xworkz.spring.service.WashingMachineService;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		BookService bean = context.getBean(BookService.class);
		System.out.println(bean.validateAndSave(null));

		System.out.println("===============================================");
		BusService bean2 = context.getBean(BusService.class);
		System.out.println(bean2.validateAndSave(null));
		System.out.println("===============================================");

		FactoryService bean3 = context.getBean(FactoryService.class);
		System.out.println(bean3.validateAndSave(null));
		System.out.println("===============================================");

		FanService bean4 = context.getBean(FanService.class);
		System.out.println(bean4.validateAndSave(null));
		System.out.println("===============================================");

		HotelService bean5 = context.getBean(HotelService.class);
		System.out.println(bean5.validateAndSave(null));
		System.out.println("===============================================");

		MobileService bean6 = context.getBean(MobileService.class);
		System.out.println(bean6.validateAndSave(null));
		System.out.println("===============================================");

		PartyService bean7 = context.getBean(PartyService.class);
		System.out.println(bean7.validateAndSave(null));
		System.out.println("===============================================");

		PhonePayService bean8 = context.getBean(PhonePayService.class);
		System.out.println(bean8.validateAndSave(null));
		System.out.println("===============================================");

		TvService bean9 = context.getBean(TvService.class);
		System.out.println(bean9.validateAndSave(null));
		System.out.println("===============================================");

		WashingMachineService bean10 = context.getBean(WashingMachineService.class);
		System.out.println(bean10.validateAndSave(null));
		System.out.println("===============================================");

	}

}
