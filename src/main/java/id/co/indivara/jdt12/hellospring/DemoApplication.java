package id.co.indivara.jdt12.hellospring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	public static void main(String[] args) {
		//Semua kode diatas baris ini, akan jalan pertama
		System.out.println("Baris ini pasti akan jalan pertama...");
		SpringApplication.run(DemoApplication.class, args);
		//Semua kode dibawah baris ini, akan selalu jalan paling akhir
		System.out.println("Baris ini akan jalan terakhir");
	}
	@Override
	public void run(String... args)throws Exception{
		System.out.println("Method Run ini akan otomatis running...");
	}
	@Bean
	public CommandLineRunner ContohRunDenganAnnonymousInnerClass(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Ini contoh run dari annonymous inner class");
			}
		};
	}
	@Bean
	public CommandLineRunner contohRunDenganLambdaExpression(){
		return (args)->{
			System.out.println("Ini contoh Run dari Lambda Expression");
		};
	}
	@Bean
	public CommandLineRunner contohRunDenganClassBiasa(){
		return new ClassBiasa();
	}
}
