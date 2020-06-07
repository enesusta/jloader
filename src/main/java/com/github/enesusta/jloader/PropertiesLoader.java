package com.github.enesusta.jloader;

import java.io.IOException;
import java.util.Properties;

public interface PropertiesLoader extends Loader{
    Properties load() throws IOException;
}
