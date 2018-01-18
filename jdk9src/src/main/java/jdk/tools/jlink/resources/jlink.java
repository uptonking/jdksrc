package jdk.tools.jlink.resources;

import java.util.ListResourceBundle;

public final class jlink extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.badpattern", "bad pattern {0}" },
            { "err.bom.generation", "bom file generation failed: {0}" },
            { "err.config.defaults", "property {0} is missing from configuration" },
            { "err.config.defaults.value", "wrong value in defaults property: {0}" },
            { "err.dir.exists", "{0} already exists" },
            { "err.existing.image.invalid", "existing image is not valid" },
            { "err.existing.image.must.exist", "existing image doesn't exists or is not a directory" },
            { "err.file.error", "cannot access file: {0}" },
            { "err.file.not.found", "cannot find file: {0}" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "invalid argument for option: {0}" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.mods.must.be.specified", "no modules specified to {0}" },
            { "err.modulepath.must.be.specified", "--modulepath must be specified" },
            { "err.option.after.class", "option must be specified before classes: {0}" },
            { "err.option.unsupported", "{0} not supported: {1}" },
            { "err.output.must.be.specified", "--output must be specified" },
            { "err.path.not.found", "path not found: {0}" },
            { "err.path.not.valid", "invalid path: {0}" },
            { "err.unknown.byte.order", "unknown byte order {0}" },
            { "err.unknown.option", "unknown option: {0}" },
            { "error.prefix", "Error:" },
            { "main.command.files", "  @<filename>                       Read options from file" },
            { "main.extended.help", "List of available plugins:" },
            { "main.msg.bug", "An exception has occurred in jlink. Please file a bug at the Java Bug Database (http://bugreport.java.com/bugreport/) after checking the database for duplicates. Include your program and the following diagnostic in your report.  Thank you." },
            { "main.opt.addmods", "  --addmods <mod>[,<mod>...]        Root modules to resolve" },
            { "main.opt.endian", "  --endian <little|big>             Byte order of generated jimage (default:native)" },
            { "main.opt.genbom", "  --genbom                          Generate a bom file containing jlink info" },
            { "main.opt.help", "  --help                            Print this help message" },
            { "main.opt.limitmods", "  --limitmods <mod>[,<mod>...]      Limit the universe of observable modules" },
            { "main.opt.modulepath", "  --modulepath <modulepath>         Module path" },
            { "main.opt.output", "  --output <path>                   Location of output path" },
            { "main.opt.saveopts", "  --saveopts <filename>             Save jlink options in the given file" },
            { "main.opt.version", "  --version                         Version information" },
            { "main.usage", "Usage: {0} <options> --modulepath <modulepath> --addmods <mods> --output <path>\nPossible options include:" },
            { "main.usage.summary", "Usage: {0} <options> --modulepath <modulepath> --addmods <mods> --output <path>\nuse --help for a list of possible options" },
            { "warn.invalid.arg", "Invalid classname or pathname not exist: {0}" },
            { "warn.prefix", "Warning:" },
            { "warn.split.package", "package {0} defined in {1} {2}" },
        };
    }
}
