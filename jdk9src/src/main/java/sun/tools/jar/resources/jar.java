package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { " ", "the hash" },
            { "error.bad.cflag", "'c' flag requires manifest or input files to be specified!" },
            { "error.bad.eflag", "'e' flag and manifest with the 'Main-Class' attribute cannot be specified \ntogether!" },
            { "error.bad.file.arg", "Error parsing file arguments" },
            { "error.bad.option", "One of options -{ctxu} must be specified." },
            { "error.bad.uflag", "'u' flag requires manifest, 'e' flag or input files to be specified!" },
            { "error.cant.open", "can''t open: {0}" },
            { "error.create.dir", "{0} : could not create directory" },
            { "error.create.tempfile", "Could not create a temporary file" },
            { "error.hash.dep", "Hashing module {0} dependences, unable to find module {1} on module path" },
            { "error.illegal.option", "Illegal option: {0}" },
            { "error.incorrect.length", "incorrect length while processing: {0}" },
            { "error.missing.arg", "option {0} requires an argument" },
            { "error.missing.provider", "Service provider not found: {0}" },
            { "error.module.descriptor.not.found", "Module descriptor not found" },
            { "error.module.options.without.info", "One of --module-version or --hash-dependencies without module-info.class" },
            { "error.multiple.main.operations", "You may not specify more than one '-cuxti' options" },
            { "error.nosuch.fileordir", "{0} : no such file or directory" },
            { "error.unexpected.module-info", "Unexpected module descriptor {0}" },
            { "error.unrecognized.option", "unrecognized option : {0}" },
            { "error.write.file", "Error in writing existing jar file" },
            { "main.help.opt.any", " Operation modifiers valid in any mode:\n\n  -C DIR                     Change to the specified directory and include the\n                             following file" },
            { "main.help.opt.any.file", "  -f, --file=FILE            The archive file name" },
            { "main.help.opt.any.verbose", "  -v, --verbose              Generate verbose output on standard output" },
            { "main.help.opt.create.update", " Operation modifiers valid only in create and update mode:\n" },
            { "main.help.opt.create.update.hash-dependencies", "      --hash-dependencies=PATTERN  Compute and record the hashes of module\n                             dependencies matched by the given pattern, when\n                             creating a modular jar, or updating a non-modular\n                             jar" },
            { "main.help.opt.create.update.index", " Operation modifiers valid only in create, update, and generate-index mode:\n" },
            { "main.help.opt.create.update.index.no-compress", "  -0, --no-compress          Store only; use no ZIP compression" },
            { "main.help.opt.create.update.main-class", "  -e, --main-class=CLASSNAME The application entry point for stand-alone\n                             applications bundled into a modular, or executable,\n                             jar archive" },
            { "main.help.opt.create.update.manifest", "  -m, --manifest=FILE        Include the manifest information from the given\n                             manifest file" },
            { "main.help.opt.create.update.module-version", "      --module-version=VERSION    The module version, when creating a modular\n                             jar, or updating a non-modular jar" },
            { "main.help.opt.create.update.modulepath", "      --modulepath           Location of module dependence for generating" },
            { "main.help.opt.create.update.no-manifest", "  -M, --no-manifest          Do not create a manifest file for the entries" },
            { "main.help.opt.main", " Main operation mode:\n" },
            { "main.help.opt.main.create", "  -c, --create               Create the archive" },
            { "main.help.opt.main.extract", "  -x, --extract              Extract named (or all) files from the archive" },
            { "main.help.opt.main.generate-index", "  -i, --generate-index=FILE  Generate index information for the specified jar\n                             archives" },
            { "main.help.opt.main.list", "  -t, --list                 List the table of contents for the archive" },
            { "main.help.opt.main.print-module-descriptor", "  -p, --print-module-descriptor  Print the module descriptor" },
            { "main.help.opt.main.update", "  -u, --update               Update an existing jar archive" },
            { "main.help.opt.other", " Other options:\n" },
            { "main.help.opt.other.help", "  -?, --help[:compat]        Give this, or optionally the compatibility, help" },
            { "main.help.opt.other.version", "      --version              Print program version" },
            { "main.help.postopt", " An archive is a modular jar if a module descriptor, 'module-info.class', is\n located in the root of the given directories, or the root of the jar archive\n itself. The following operations are only valid when creating a modular jar,\n or updating an existing non-modular jar: '--module-version',\n '--hash-dependencies', and '--modulepath'.\n\n Mandatory or optional arguments to long options are also mandatory or optional\n for any corresponding short options." },
            { "main.help.preopt", "Usage: jar [OPTION...] [-C dir] files ...\njar creates an archive for classes and resources, and can manipulate or\nrestore individual classes or resources from an archive.\n\n Examples:\n # Create an archive called classes.jar with two class files:\n jar --create --file classes.jar Foo.class Bar.class\n # Create an archive using an existing manifest, with all the files in foo/:\n jar --create --file classes.jar --manifest mymanifest -C foo/ .\n # Create a modular jar archive, where the module descriptor is located in\n # classes/module-info.class:\n jar --create --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ classes resources\n # Update an existing non-modular jar to a modular jar:\n jar --update --file foo.jar --main-class com.foo.Main --module-version 1.0\n     -C foo/ module-info.class" },
            { "main.usage.summary", "jar: You must specify one of -ctxui options." },
            { "main.usage.summary.try", "Try `jar --help' for more information." },
            { "out.added.manifest", "added manifest" },
            { "out.added.module-info", "added module-info.class" },
            { "out.adding", "adding: {0}" },
            { "out.create", "  created: {0}" },
            { "out.deflated", "(deflated {0}%)" },
            { "out.extracted", "extracted: {0}" },
            { "out.ignore.entry", "ignoring entry {0}" },
            { "out.inflated", " inflated: {0}" },
            { "out.size", "(in = {0}) (out= {1})" },
            { "out.stored", "(stored 0%)" },
            { "out.update.manifest", "updated manifest" },
            { "out.update.module-info", "updated module-info.class" },
            { "usage.compat", "Compatibility Interface:\nUsage: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files ...\nOptions:\n    -c  create new archive\n    -t  list table of contents for archive\n    -x  extract named (or all) files from archive\n    -u  update existing archive\n    -v  generate verbose output on standard output\n    -f  specify archive file name\n    -m  include manifest information from specified manifest file\n    -n  perform Pack200 normalization after creating a new archive\n    -e  specify application entry point for stand-alone application \n        bundled into an executable jar file\n    -0  store only; use no ZIP compression\n    -P  preserve leading '/' (absolute path) and \"..\" (parent directory) components from file names\n    -M  do not create a manifest file for the entries\n    -i  generate index information for the specified jar files\n    -C  change to the specified directory and include the following file\nIf any file is a directory then it is processed recursively.\nThe manifest file name, the archive file name and the entry point name are\nspecified in the same order as the 'm', 'f' and 'e' flags.\n\nExample 1: to archive two class files into an archive called classes.jar: \n       jar cvf classes.jar Foo.class Bar.class \nExample 2: use an existing manifest file 'mymanifest' and archive all the\n           files in the foo/ directory into 'classes.jar': \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
        };
    }
}
