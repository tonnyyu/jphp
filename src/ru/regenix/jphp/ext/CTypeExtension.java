package ru.regenix.jphp.ext;

import ru.regenix.jphp.compiler.common.Extension;

public class CTypeExtension extends Extension {
    @Override
    public String getName() {
        return "ctype";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }
}