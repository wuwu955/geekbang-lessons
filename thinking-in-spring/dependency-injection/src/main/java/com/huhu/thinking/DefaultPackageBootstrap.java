package com.huhu.thinking;

import com.huhu.thinking.cenerics.UserService;
import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.stream.Stream;

/**
 * {@link ComponentScan @ComponentScan} 默认包引导类
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0 see page 295 扫描默认包下所有 component 和 configuration的注解及派生注解 e: service
 * error  @EnableAsync annotation metadata was not injected 没有自动配置进去
 *
 */
@ComponentScan(basePackageClasses = DefaultPackageBootstrap.class)
public class DefaultPackageBootstrap {

    public static void main(String[] args) {
        // 注册当前引导类作为配置 Class，并启动当前上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DefaultPackageBootstrap.class);
        // 输出当前 Spring 应用上下文中所有注册的 Bean 名称
        System.out.println("当前 Spring 应用上下文中所有注册的 Bean 名称：");

        Stream.of(context.getBeanDefinitionNames())
                // 增加格式缩进
                .map(name -> "\t" + name)
                .forEach(System.out::println);
        //获取注册的bean
        UserService bean = context.getBean(UserService.class);
        bean.save(User.createUser());

        // 关闭上下文
        context.close();
    }
}
