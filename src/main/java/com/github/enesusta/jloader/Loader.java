package com.github.enesusta.jloader;

import java.io.InputStream;

public interface Loader {
    InputStream load(String resource);
}
