package org.example.ownIOC.container;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import org.example.ownIOC.anotation.Component;

import java.util.HashMap;
import java.util.Map;

public class OwnDIContainer {
    private Map<String, Object> beans = new HashMap<>();

    public OwnDIContainer(String basePackage) {
        try (ScanResult scanResult = new ClassGraph()
                .enableAllInfo()
                .whitelistPackages(basePackage)
                .scan()) {

            scanResult.getClassesWithAnnotation(Component.class.getName())
                    .loadClasses()
                    .forEach(clazz -> createBeanInstance(clazz, clazz.getAnnotation(Component.class).name()));
        }
    }

    private void createBeanInstance(Class<?> clazz, String name) {
        try {
            Object beanInstance = clazz.getDeclaredConstructor().newInstance();
            beans.put(name, beanInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String name) {
        return beans.get(name);
    }
}

