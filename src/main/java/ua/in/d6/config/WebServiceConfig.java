package ua.in.d6.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "person")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema personSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PersonPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://d6.in.ua");
        wsdl11Definition.setSchema(personSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema personSchema() {
        return new SimpleXsdSchema(new ClassPathResource("person.xsd"));
    }

//    @Bean(name = "company")
//    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema companySchema) {
//        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//        wsdl11Definition.setPortTypeName("CompanyPort");
//        wsdl11Definition.setLocationUri("/ws");
//        wsdl11Definition.setTargetNamespace("http://d6.in.ua");
//        wsdl11Definition.setSchema(companySchema);
//        return wsdl11Definition;
//    }
//
//    @Bean
//    public XsdSchema companySchema() {
//        return new SimpleXsdSchema(new ClassPathResource("company.xsd"));
//    }
}