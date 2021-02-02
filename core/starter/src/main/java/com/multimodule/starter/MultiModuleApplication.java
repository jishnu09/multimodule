package com.multimodule.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication()
@ComponentScan("com.multimodule")
public class MultiModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleApplication.class, args);
        System.out.println();
        System.out.println("::'##'##:::::'##'##:::::'##'##:::::'##'##:::'########::'########::::'###::::'########::'##:::'##:::'##'##:::::'##'##:::::'##'##:::::'##'##:::\n" +
                ":: ## ##::::: ## ##::::: ## ##::::: ## ##::: ##.... ##: ##.....::::'## ##::: ##.... ##:. ##:'##:::: ## ##::::: ## ##::::: ## ##::::: ## ##:::\n" +
                "'#########:'#########:'#########:'#########: ##:::: ##: ##::::::::'##:. ##:: ##:::: ##::. ####:::'#########:'#########:'#########:'#########:\n" +
                ".. ## ##.::.. ## ##.::.. ## ##.::.. ## ##.:: ########:: ######:::'##:::. ##: ##:::: ##:::. ##::::.. ## ##.::.. ## ##.::.. ## ##.::.. ## ##.::\n" +
                "'#########:'#########:'#########:'#########: ##.. ##::: ##...:::: #########: ##:::: ##:::: ##::::'#########:'#########:'#########:'#########:\n" +
                ".. ## ##.::.. ## ##.::.. ## ##.::.. ## ##.:: ##::. ##:: ##::::::: ##.... ##: ##:::: ##:::: ##::::.. ## ##.::.. ## ##.::.. ## ##.::.. ## ##.::\n" +
                ":: ## ##::::: ## ##::::: ## ##::::: ## ##::: ##:::. ##: ########: ##:::: ##: ########::::: ##:::::: ## ##::::: ## ##::::: ## ##::::: ## ##:::\n" +
                "::..:..::::::..:..::::::..:..::::::..:..::::..:::::..::........::..:::::..::........::::::..:::::::..:..::::::..:..::::::..:..::::::..:..::::");
        System.out.println();
    }

}
