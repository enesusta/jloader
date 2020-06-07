package com.github.enesusta.jloader;

import java.io.InputStream;

public final class DefaultLoader implements Loader {

    @Override
    public final InputStream load(final String resource) {
        final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        final InputStream inputStream = loader.getResourceAsStream(resource);
        return inputStream;
    }
}
