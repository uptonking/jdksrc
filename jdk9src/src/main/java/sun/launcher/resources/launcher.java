package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "See", "http://www.oracle.com/technetwork/java/javase/documentation/index.html for more details." },
            { "java.launcher.X.macosx.usage", "\nThe following options are Mac OS X specific:\n    -XstartOnFirstThread\n                      run the main() method on the first (AppKit) thread\n    -Xdock:name=<application name>\"\n                      override default application name displayed in dock\n    -Xdock:icon=<path to icon file>\n                      override default icon displayed in dock\n\n" },
            { "java.launcher.X.usage", "    -Xmixed           mixed mode execution (default)\n    -Xint             interpreted mode execution only\n    -Xbootclasspath/a:<directories and zip/jar files separated by {0}>\n                      append to end of bootstrap class path\n    -Xdiag            show additional diagnostic messages\n    -Xdiag:resolver   show resolver diagnostic messages\n    -Xnoclassgc       disable class garbage collection\n    -Xincgc           enable incremental garbage collection\n    -Xloggc:<file>    log GC status to a file with time stamps\n    -Xbatch           disable background compilation\n    -Xms<size>        set initial Java heap size\n    -Xmx<size>        set maximum Java heap size\n    -Xss<size>        set java thread stack size\n    -Xprof            output cpu profiling data\n    -Xfuture          enable strictest checks, anticipating future default\n    -Xrs              reduce use of OS signals by Java/VM (see documentation)\n    -Xcheck:jni       perform additional checks for JNI functions\n    -Xshare:off       do not attempt to use shared class data\n    -Xshare:auto      use shared class data if possible (default)\n    -Xshare:on        require using shared class data, otherwise fail.\n    -XshowSettings    show all settings and continue\n    -XshowSettings:all\n                      show all settings and continue\n    -XshowSettings:vm show all vm related settings and continue\n    -XshowSettings:properties\n                      show all property settings and continue\n    -XshowSettings:locale\n                      show all locale related settings and continue\n    -XaddReads:<module>=<other-module>(,<other-module>)*\n                      <module> reads other modules,\n                      regardless of module declaration\n    -XaddExports:<module>/<package>=<other-module>(,<other-module>)*\n                      <module> exports <package> to other modules,\n                      regardless of module declaration\n    -Xpatch:<module>=<file>({0}<file>)*\n                      Override or augment a module with classes and resources\n                      in JAR files or directories\n    -Xdisable-@files  disable further argument file expansion\n\nThe -X options are non-standard and subject to change without notice.\n" },
            { "java.launcher.cls.error1", "Error: Could not find or load main class {0}" },
            { "java.launcher.cls.error2", "Error: Main method is not {0} in class {1}, please define the main method as:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "Error: Main method must return a value of type void in class {0}, please \ndefine the main method as:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "Error: Main method not found in class {0}, please define the main method as:\n   public static void main(String[] args)\nor a JavaFX application class must extend {1}" },
            { "java.launcher.cls.error5", "Error: JavaFX runtime components are missing, and are required to run this application" },
            { "java.launcher.ergo.message1", "                  The default VM is {0}" },
            { "java.launcher.ergo.message2", "                  because you are running on a server-class machine.\n" },
            { "java.launcher.init.error", "initialization error" },
            { "java.launcher.jar.error1", "Error: An unexpected error occurred while trying to open file {0}" },
            { "java.launcher.jar.error2", "manifest not found in {0}" },
            { "java.launcher.jar.error3", "no main manifest attribute, in {0}" },
            { "java.launcher.javafx.error1", "Error: The JavaFX launchApplication method has the wrong signature, it\nmust be declared static and return a value of type void" },
            { "java.launcher.module.error1", "module {0} does not have a MainClass attribute, use -m <module>/<main-class>" },
            { "java.launcher.module.error2", "Error: Could not find or load main class {0} in module {1}" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  use a {0}-bit data model if available\n" },
            { "java.launcher.opt.footer", "    -cp <class search path of directories and zip/jar files>\n    -classpath <class search path of directories and zip/jar files>\n                  A {0} separated list of directories, JAR archives,\n                  and ZIP archives to search for class files.\n    -mp <module path>\n    -modulepath <module path>...\n                  A {0} separated list of directories, each directory\n                  is a directory of modules.\n    -upgrademodulepath <module path>...\n                  A {0} separated list of directories, each directory\n                  is a directory of modules that replace upgradeable\n                  modules in the runtime image\n    -m <modulename> | <modulename>/<mainclass>\n                  the initial or main module to resolve\n    -addmods <modulename>[,<modulename>...]\n                  root modules to resolve in addition to the initial module\n    -limitmods <modulename>[,<modulename>...]\n                  limit the universe of observable modules\n    -listmods[:<modulename>[,<modulename>...]]\n                  list the observable modules and exit\n    -D<name>=<value>\n                  set a system property\n    -verbose:[class|gc|jni]\n                  enable verbose output\n    -version      print product version and exit\n    -showversion  print product version and continue\n    -? -help      print this help message\n    -X            print help on non-standard options\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  enable assertions with specified granularity\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  disable assertions with specified granularity\n    -esa | -enablesystemassertions\n                  enable system assertions\n    -dsa | -disablesystemassertions\n                  disable system assertions\n    -agentlib:<libname>[=<options>]\n                  load native agent library <libname>, e.g. -agentlib:jdwp\n                  see also -agentlib:jdwp=help\n    -agentpath:<pathname>[=<options>]\n                  load native agent library by full pathname\n    -javaagent:<jarpath>[=<options>]\n                  load Java programming language agent, see java.lang.instrument\n    -splash:<imagepath>\n                  show splash screen with specified image\n    @<filepath>   read options from the specified file\n" },
            { "java.launcher.opt.header", "Usage: {0} [options] class [args...]\n           (to execute a class)\n   or  {0} [options] -jar jarfile [args...]\n           (to execute a jar file)\n   or  {0} [-options] -mp <modulepath> -m <modulename> | <modulename>/<mainclass>\n           (to execute the main class in a module)\nwhere options include:\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  is a synonym for the \"{1}\" VM  [deprecated]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  to select the \"{1}\" VM\n" },
        };
    }
}
