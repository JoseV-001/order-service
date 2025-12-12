package com.josev.order_service;

import com.josev.order_service.entities.Order;
import com.josev.order_service.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class OrderServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Autowired
    private OrderService orderService = new OrderService();

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Order code: ");
        int code = sc.nextInt();
        System.out.print("Order basic value: ");
        double basic = sc.nextDouble();
        System.out.print("Order discount percentage: ");
        double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println();
        System.out.println("Order code: " + code);
        System.out.printf("Order total value R$: %.2f", orderService.total(order));
    }
}
