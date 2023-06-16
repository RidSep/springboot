package id.co.indivara.jdt12.hellospring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class ClassBiasa implements CommandLineRunner {
    @Override
    public void run(String... args)throws Exception{
        System.out.println("Ini contoh Run dari Class Biasa...");
    }

}
