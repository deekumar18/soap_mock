package com.techprimers.springbootsoapexample.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.validation.XmlValidator;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/soapWS/*");
    }


   /* @Bean
    public XsdSchema userSchema() {
        return new SimpleXsdSchema(new ClassPathResource("users.xsd"));
    }
*/

    @Bean
    public XsdSchema testSchema() {
        return new SimpleXsdSchema(new ClassPathResource("CmecGetClientDetailsRequest.xsd"));
    }

 // A bean with both schemas
  /*  @Bean
    public XsdSchemaCollection schemaCollection() {
        return new XsdSchemaCollection() {

            @Override
            public XsdSchema[] getXsdSchemas() {
                return new XsdSchema[] {
                        new SimpleXsdSchema(new ClassPathResource("users.xsd")),
                        new SimpleXsdSchema(new ClassPathResource("UpdateExternalUser.xsd"))
                };
            }

            @Override
            public XmlValidator createValidator() {
                throw new UnsupportedOperationException();
            }
        };
    }*/
    
   
    /*@Bean(name = "soapWsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema, XsdSchemaCollection schemaCollection) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("/soapWS");
        wsdl11Definition.setLocationUri("UserServicePort");
        wsdl11Definition.setTargetNamespace("http://github.com/deekumar18/soap_mock");

        
        schemaCollection = schemaCollection();
        // At this point I use just one of the folliwing
        wsdl11Definition.setSchema(schema);
        wsdl11Definition.setSchemaCollection(schemaCollection);

        return wsdl11Definition;
    }*/
    
    @Bean
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema testSchema) {

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(testSchema);
        definition.setLocationUri("/soapWS");
        definition.setPortTypeName("UserServicePort");
        definition.setTargetNamespace("http://github.com/deekumar18/soap_mock");
        return definition;
    }
    
   /* @Bean
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userSchema) {

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(userSchema);
        definition.setLocationUri("/soapWS");
        definition.setPortTypeName("UserServicePort");
        definition.setTargetNamespace("http://github.com/deekumar18/soap_mock");
        return definition;
    }*/


}
