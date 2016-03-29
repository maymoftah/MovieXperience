package com.moviexperience.config;
import org.springframework.web.WebApplicationInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletException;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.context.ContextLoaderListener;

public class WebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootAppConfigContext = new AnnotationConfigWebApplicationContext();

        rootAppConfigContext.register(RootConfigs.class);

        servletContext.addListener(new ContextLoaderListener(rootAppConfigContext));

        AnnotationConfigWebApplicationContext configDispatcherContext = new AnnotationConfigWebApplicationContext();

        configDispatcherContext.register(WebMVConfig.class);

        ServletRegistration.Dynamic dispatchServlet = servletContext.addServlet("dispatch", new DispatcherServlet(configDispatcherContext));
        dispatchServlet.setLoadOnStartup(1);
        dispatchServlet.addMapping("/");
    }

}


