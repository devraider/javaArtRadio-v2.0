package artradio.link.radio.config;

import artradio.link.radio.entity.Radio;
import artradio.link.radio.entity.RadioSong;
import artradio.link.radio.entity.RadioType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Value("${allowed.origins}")
    private String[] allowedOrigins;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] unsupportedMethods = {HttpMethod.DELETE, HttpMethod.PATCH, HttpMethod.PUT, HttpMethod.POST};

        disableHttpMethods(Radio.class, config, unsupportedMethods);
        disableHttpMethods(RadioType.class, config, unsupportedMethods);


        config.exposeIdsFor(RadioSong.class);

        cors.addMapping(config.getBasePath() + "/**").allowedOrigins(allowedOrigins);

    }

    private void disableHttpMethods(Class theClass, RepositoryRestConfiguration config, HttpMethod[] theUnsupportedActions) {
        config.getExposureConfiguration()
                .forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
