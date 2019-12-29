package org.geekbang.thinking.in.spring.bean.definition;

import org.geekbang.thinking.in.spring.ioc.overview.domain.User;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;

/**
 * @author zhou.wu
 * @version v1.0
 * @package org.geekbang.thinking.in.spring.bean.definition
 * @description: Introspector 和类型转换定义
 * @date 2019/12/29 3:44 PM
 */
public class BeanInfoDemo {

    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);

        Stream.of(beanInfo.getPropertyDescriptors()).forEach(propertyDescriptor -> {
            Class<?> propertyType = propertyDescriptor.getPropertyType();
            String name = propertyType.getName();
            //类型判断
            if ("id".equals(name)) {
                propertyDescriptor.setPropertyEditorClass(StringToLongConverter.class);
                propertyDescriptor.createPropertyEditor(propertyDescriptor);
            }
            System.out.println(propertyDescriptor);

        });


    }

    /**
     * 类型转换
     */
    static class StringToLongConverter extends PropertyEditorSupport {

        @Override
        public void setAsText(String text) throws java.lang.IllegalArgumentException {
            Long aLong = Long.valueOf(text);
            setValue(aLong);
        }
    }
}
