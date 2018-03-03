package jdk.tools.jimage.resources;

import java.util.ListResourceBundle;

public final class jimage extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "err.cannot.create.dir", "cannot create directory: {0}" },
            { "err.cannot.read.file", "cannot read file: {0}" },
            { "err.cannot.update.file", "cannot update file: {0}" },
            { "err.file.error", "cannot access file: {0}" },
            { "err.file.not.found", "cannot find file: {0}" },
            { "err.flags.not.int", "--flags value not integer: {0}" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "invalid argument for option: {0}" },
            { "err.invalid.task", "task must be extract|recreate|info|list|verify: {0}" },
            { "err.jimage.already.exists", "jimage already exists: {0}" },
            { "err.jimage.not.specified", "no jimage specified" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.not.a.dir", "not a directory: {0}" },
            { "err.not.a.jimage", "not a jimage file: {0}" },
            { "err.only.one.jimage", "only one jimage should be specified" },
            { "err.option.unsupported", "{0} not supported: {1}" },
            { "err.unknown.option", "unknown option: {0}" },
            { "error.prefix", "Error:" },
            { "main.command.files", "  @<filename>                          Read options from file" },
            { "main.extended.help", "jimage recreate is extensible by the main of plugins. Following plugins have been discovered thanks to ServiceLoader and can be used when re-creating a jimage." },
            { "main.opt.configuration", "  --configuration <path>               Path to properties file containing defaults options for recreate" },
            { "main.opt.dir", "  --dir                                Target directory for extract/recreate" },
            { "main.opt.flags", "  --flags=value                        Set the jimage flags to value" },
            { "main.opt.help", "  --help                               Print this usage message" },
            { "main.opt.verbose", "  --verbose                            Verbose listing" },
            { "main.opt.version", "  --version                            Version information" },
            { "main.usage", "Usage: {0} <extract|info|list|recreate|set|verify> <options> jimage...\n\n  extract  - Extract all jimage entries into separate files into the directory\n             specified by --dir=<directory> (default='.')\n  info     - Prints information specified in the jimage header.\n  list     - Prints the names of all the entries in the jimage.  When used with\n             --verbose will also print entry attributes ex. size and offset.\n  recreate - Reconstructs a jimage from an extracted directory (--dir)\n  set      - sets the value of specific jimage header entries\n  verify   - Reports errors on any .class entries that don't verify as classes.\n\nPossible options include:" },
            { "main.usage.summary", "Usage: {0} <extract|info|list|recreate|set|verify> <options> jimage...\nuse --help for a list of possible options" },
            { "warn.prefix", "Warning:" },
        };
    }
}
