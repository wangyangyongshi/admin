import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王二小
 * @date 2018/12/18 0:26
 */
@Configuration
public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("adfadf");
//            applicationConfig.set
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(8000);
        return protocolConfig;
    }

    public ServiceConfig<String> stringServiceConfig() {
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setVersion("0.0.1");
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getusername");
        methodConfig.setTimeout(3000);
        List<MethodConfig> list = new ArrayList<>();
        list.add(methodConfig);
        serviceConfig.setMethods(list);
        return serviceConfig;

    }
}
