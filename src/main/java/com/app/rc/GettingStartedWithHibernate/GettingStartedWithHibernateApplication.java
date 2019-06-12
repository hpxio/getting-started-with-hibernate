
package com.app.rc.GettingStartedWithHibernate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.app.rc.GettingStartedWithHibernate.usingXmlConfiguration.configuration.DatabaseConfigurations;


@SpringBootApplication
public class GettingStartedWithHibernateApplication {

    public static void main ( String[] args ) {

        SpringApplication.run (
                GettingStartedWithHibernateApplication.class,
                args );


        DatabaseConfigurations dbConfig = new DatabaseConfigurations ( );
        System.out.println ( dbConfig );

    }

}
