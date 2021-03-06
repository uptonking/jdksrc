package jdk.tools.jmod.resources;

import java.util.ListResourceBundle;

public final class jmod extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.bad.pattern", "bad pattern {0}" },
            { "err.classpath.must.be.specified", "--class-path must be specified" },
            { "err.file.already.exists", "file already exists: {0}" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.class.path.entry", "invalid class path entry: {0}" },
            { "err.invalid.main-class", "invalid main-class name: {0}" },
            { "err.invalid.mode", "mode must be one of create, list, or describe: {0}" },
            { "err.invalid.version", "invalid module version {0}" },
            { "err.jmod.must.be.specified", "jmod-file must be specified" },
            { "err.jmod.not.found", "no jmod file found: {0}" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.missing.mode", "one of create, list, or describe must be specified" },
            { "err.mods.must.be.specified", "--mods must be specified" },
            { "err.module.descriptor.not.found", "Module descriptor not found" },
            { "err.modulepath.must.be.specified", "--module-path must be specified when hashing dependencies" },
            { "err.output.must.be.specified", "--output must be specified" },
            { "err.path.not.a.dir", "path must be a directory: {0}" },
            { "err.path.not.found", "path not found: {0}" },
            { "err.path.not.valid", "invalid path: {0}" },
            { "err.unknown.option", "unknown option(s): {0}" },
            { "error.prefix", "Error:" },
            { "main.opt.class-path", "Application jar files|dir containing classes" },
            { "main.opt.cmdfile", "Read options from the specified file" },
            { "main.opt.cmds", "Location of native commands" },
            { "main.opt.config", "Location of user-editable config files" },
            { "main.opt.exclude", "Exclude files, given as a PATTERN" },
            { "main.opt.hash-dependencies", "Compute and record hashes of dependencies matched by the pattern" },
            { "main.opt.help", "Print this usage message" },
            { "main.opt.libs", "Location of native libraries" },
            { "main.opt.main-class", "Main class" },
            { "main.opt.main-class.arg", "class-name" },
            { "main.opt.mode.create", "create    - Creates a new jmod archive" },
            { "main.opt.mode.describe", "describe  - Prints the module details" },
            { "main.opt.mode.list", "list      - Prints the names of all the entries" },
            { "main.opt.module-version", "Module version" },
            { "main.opt.modulepath", "Module path" },
            { "main.opt.os-arch", "Operating system architecture" },
            { "main.opt.os-arch.arg", "os-arch" },
            { "main.opt.os-name", "Operating system name" },
            { "main.opt.os-name.arg", "os-name" },
            { "main.opt.os-version", "Operating system version" },
            { "main.opt.os-version.arg", "os-version" },
            { "main.opt.version", "Version information" },
            { "main.usage", "Usage: {0} (create|list|describe) <OPTIONS> <jmod-file>" },
            { "main.usage.summary", "Usage: {0} (create|list|describe) <OPTIONS> <jmod-file>\nuse --help for a list of possible options" },
            { "warn.invalid.arg", "Invalid classname or pathname not exist: {0}" },
            { "warn.prefix", "Warning:" },
        };
    }
}
