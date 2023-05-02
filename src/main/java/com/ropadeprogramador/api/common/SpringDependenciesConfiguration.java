package com.ropadeprogramador.api.common;

import com.ropadeprogramador.api.scraper.application.getOwnProducts.adapter.GetOwnProductsAdapterRepository;
import com.ropadeprogramador.api.scraper.application.getOwnProducts.delivery.GetOwnProductsDelivery;
import com.ropadeprogramador.api.scraper.application.getOwnProducts.service.GetOwnProductsService;
import com.ropadeprogramador.api.scraper.infrastructure.repository.dao.CartDao;
import com.ropadeprogramador.api.scraper.infrastructure.repository.dao.CustomerTransactionDao;
import com.ropadeprogramador.api.scraper.infrastructure.repository.dao.ProductCategoryDao;
import com.ropadeprogramador.api.scraper.infrastructure.repository.dao.ProductDao;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.ropadeprogramador.*")
@EntityScan(basePackages = "com.ropadeprogramador.*")
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(basePackages = {"com.ropadeprogramador.*"})
public class SpringDependenciesConfiguration {
    private final CartDao cartDao;
    private final CustomerTransactionDao customerTransactionDao;
    private final ProductDao productDao;
    private final ProductCategoryDao productCategoryDao;

    public SpringDependenciesConfiguration(CartDao cartDao, CustomerTransactionDao customerTransactionDao, ProductDao productDao, ProductCategoryDao productCategoryDao) {
        this.cartDao = cartDao;
        this.customerTransactionDao = customerTransactionDao;
        this.productDao = productDao;
        this.productCategoryDao = productCategoryDao;
    }


    /**
     * ===========================================================
     * =======================application======================
     * ===========================================================
     */

    /**
     * modelMapper


    @Bean
    StudentCertificateModelMapper studentCertificateModelMapper(){
        return new StudentCertificateModelMapper();
    }
     */
    /**
     * getOwnProducts
     */
    @Bean
    public GetOwnProductsAdapterRepository getOwnProductsAdapterRepository(){
        return new GetOwnProductsAdapterRepository();
    }

    @Bean
    public GetOwnProductsService getOwnProductsService(){
        return new GetOwnProductsService(getOwnProductsAdapterRepository());
    }

    @Bean
    public GetOwnProductsDelivery getOwnProductsDelivery(){
        return new GetOwnProductsDelivery();
    }
    /**
     * generateCertificate
     */


}
