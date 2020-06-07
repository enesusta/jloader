package com.github.enesusta.jloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class DefaultPropertiesLoader implements PropertiesLoader {

    @Override
    public Properties load() throws IOException {
        final Reader reader = new BufferedReader(new InputStreamReader(load("application.properties")));
        Properties properties = new Properties();
        properties.load(reader);
        return properties;
    }

    @Override
    public InputStream load(String resource) {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        final InputStream inputStream = loader.getResourceAsStream(resource);
        return inputStream;
    }
}
