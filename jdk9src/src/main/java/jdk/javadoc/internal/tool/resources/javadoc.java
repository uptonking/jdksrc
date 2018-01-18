package jdk.javadoc.internal.tool.resources;

public final class javadoc extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "javadoc.class_not_found", "Class {0} not found." },
            { "javadoc.error", "error" },
            { "javadoc.error.msg", "{0}: error - {1}" },
            { "javadoc.note.msg", "{1}" },
            { "javadoc.note.pos.msg", "{0}: {1}" },
            { "javadoc.warning", "warning" },
            { "javadoc.warning.msg", "{0}: warning - {1}" },
            { "main.Building_tree", "Constructing Javadoc information..." },
            { "main.Loading_source_file", "Loading source file {0}..." },
            { "main.Loading_source_files_for_package", "Loading source files for package {0}..." },
            { "main.No_packages_or_classes_specified", "No packages or classes specified." },
            { "main.Xusage", "  -Xmaxerrs <number>               Set the maximum number of errors to print\n  -Xmaxwarns <number>              Set the maximum number of warnings to print\n" },
            { "main.Xusage.foot", "These options are non-standard and subject to change without notice." },
            { "main.cant.read", "cannot read {0}" },
            { "main.could_not_instantiate_class", "Could not instantiate class {0}" },
            { "main.doclet.usage.header", "Provided by the {0} doclet:" },
            { "main.doclet_class_not_found", "Cannot find doclet class {0}" },
            { "main.doclet_no_classloader_found", "Could not obtain classloader to load {0}" },
            { "main.done_in", "[done in {0} ms]" },
            { "main.error", "{0} error" },
            { "main.errors", "{0} errors" },
            { "main.fatal.error", "fatal error" },
            { "main.fatal.exception", "fatal exception" },
            { "main.file_ignored", "File ignored: \"{0}\" (not yet supported)" },
            { "main.file_not_found", "File not found: \"{0}\"" },
            { "main.illegal_class_name", "Illegal class name: \"{0}\"" },
            { "main.illegal_locale_name", "Locale not available: {0}" },
            { "main.illegal_package_name", "Illegal package name: \"{0}\"" },
            { "main.incompatible.access.flags", "More than one of -public, -private, -package, or -protected specified." },
            { "main.invalid_flag", "invalid flag: {0}" },
            { "main.malformed_locale_name", "Malformed locale name: {0}" },
            { "main.more_than_one_doclet_specified_0_and_1", "More than one doclet specified ({0} and {1})." },
            { "main.no_source_files_for_package", "No source files for package {0}" },
            { "main.option.already.seen", "The {0} option may be specified no more than once." },
            { "main.out.of.memory", "java.lang.OutOfMemoryError: Please increase memory.\nFor example, on the JDK Classic or HotSpot VMs, add the option -J-Xmx\nsuch as -J-Xmx32m." },
            { "main.release.bootclasspath.conflict", "option {0} cannot be used together with -release" },
            { "main.release.not.standard.file.manager", "-release option specified, but the provided JavaFileManager is not a StandardJavaFileManager." },
            { "main.requires_argument", "option {0} requires an argument." },
            { "main.unknown.error", "an unknown error has occurred" },
            { "main.unsupported.release.version", "release version {0} not supported" },
            { "main.usage", "Usage: javadoc [options] [packagenames] [sourcefiles] [@files]\n  -overview <file>                 Read overview documentation from HTML file\n  -public                          Show only public classes and members\n  -protected                       Show protected/public classes and members (default)\n  -package                         Show package/protected/public classes and members\n  -private                         Show all classes and members\n  -help                            Display command line options and exit\n  -doclet <class>                  Generate output via alternate doclet\n  -docletpath <path>               Specify where to find doclet class files\n  -sourcepath <pathlist>           Specify where to find source files\n  -classpath <pathlist>            Specify where to find user class files\n  -cp <pathlist>                   Specify where to find user class files\n  -exclude <pkglist>               Specify a list of packages to exclude\n  -subpackages <subpkglist>        Specify subpackages to recursively load\n  -breakiterator                   Compute first sentence with BreakIterator\n  -bootclasspath <pathlist>        Override location of class files loaded\n                                   by the bootstrap class loader\n  -source <release>                Provide source compatibility with specified release\n  -extdirs <dirlist>               Override location of installed extensions\n  -verbose                         Output messages about what Javadoc is doing\n  -locale <name>                   Locale to be used, e.g. en_US or en_US_WIN\n  -encoding <name>                 Source file encoding name\n  -quiet                           Do not display status messages\n  -J<flag>                         Pass <flag> directly to the runtime system\n  -X                               Print a synopsis of nonstandard options and exit\n" },
            { "main.warning", "{0} warning" },
            { "main.warnings", "{0} warnings" },
        };
    }
}