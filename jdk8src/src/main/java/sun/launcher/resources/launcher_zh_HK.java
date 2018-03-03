package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_zh_HK extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\n\u4E0B\u5217\u662F Mac OS X \u7279\u5B9A\u9078\u9805:\n    -XstartOnFirstThread\n                      \u5728\u7B2C\u4E00\u500B (AppKit) \u57F7\u884C\u7DD2\u57F7\u884C main() \u65B9\u6CD5\n    -Xdock:name=<application name>\"\n                      \u8986\u5BEB\u7D50\u5408\u8AAA\u660E\u756B\u9762\u4E2D\u986F\u793A\u7684\u9810\u8A2D\u61C9\u7528\u7A0B\u5F0F\u540D\u7A31\n    -Xdock:icon=<path to icon file>\n                      \u8986\u5BEB\u7D50\u5408\u8AAA\u660E\u756B\u9762\u4E2D\u986F\u793A\u7684\u9810\u8A2D\u5716\u793A\n\n" },
            { "java.launcher.X.usage", "    -Xmixed           \u6DF7\u5408\u6A21\u5F0F\u57F7\u884C (\u9810\u8A2D)\n    -Xint             \u50C5\u9650\u89E3\u8B6F\u6A21\u5F0F\u57F7\u884C\n    -Xbootclasspath:<\u4EE5 {0} \u5206\u9694\u7684\u76EE\u9304\u548C zip/jar \u6A94\u6848>\n                      \u8A2D\u5B9A\u555F\u52D5\u5B89\u88DD\u985E\u5225\u548C\u8CC7\u6E90\u7684\u641C\u5C0B\u8DEF\u5F91\n    -Xbootclasspath/a:<\u4EE5 {0} \u5206\u9694\u7684\u76EE\u9304\u548C zip/jar \u6A94\u6848>\n                      \u9644\u52A0\u5728\u555F\u52D5\u5B89\u88DD\u985E\u5225\u8DEF\u5F91\u7684\u7D50\u5C3E\n    -Xbootclasspath/p:<\u4EE5 {0} \u5206\u9694\u7684\u76EE\u9304\u548C zip/jar \u6A94\u6848>\n                      \u9644\u52A0\u5728\u555F\u52D5\u5B89\u88DD\u985E\u5225\u8DEF\u5F91\u7684\u524D\u9762\n    -Xdiag            \u986F\u793A\u5176\u4ED6\u7684\u8A3A\u65B7\u8A0A\u606F\n    -Xnoclassgc       \u505C\u7528\u985E\u5225\u8CC7\u6E90\u56DE\u6536\n    -Xincgc           \u555F\u7528\u6F38\u9032\u8CC7\u6E90\u56DE\u6536\n    -Xloggc:<file>    \u5229\u7528\u6642\u6233\u5C07 GC \u72C0\u614B\u8A18\u9304\u81F3\u6A94\u6848\u4E2D\n    -Xbatch           \u505C\u7528\u80CC\u666F\u7DE8\u8B6F\n    -Xms<size>        \u8A2D\u5B9A\u8D77\u59CB Java \u5806\u96C6\u5927\u5C0F\n    -Xmx<size>        \u8A2D\u5B9A Java \u5806\u96C6\u5927\u5C0F\u4E0A\u9650\n    -Xss<size>        \u8A2D\u5B9A Java \u57F7\u884C\u7DD2\u5806\u758A\u5927\u5C0F\n    -Xprof            \u8F38\u51FA CPU \u5206\u6790\u8CC7\u6599\n    -Xfuture          \u555F\u7528\u6700\u56B4\u683C\u7684\u6AA2\u67E5\uFF0C\u9810\u5148\u4F5C\u70BA\u5C07\u4F86\u7684\u9810\u8A2D\n    -Xrs              \u6E1B\u5C11 Java/VM \u4F7F\u7528\u4F5C\u696D\u7CFB\u7D71\u4FE1\u865F (\u8ACB\u53C3\u95B1\u6587\u4EF6)\n    -Xcheck:jni       \u57F7\u884C\u5176\u4ED6\u7684 JNI \u51FD\u6578\u6AA2\u67E5\n    -Xshare:off       \u4E0D\u5617\u8A66\u4F7F\u7528\u5171\u7528\u985E\u5225\u8CC7\u6599\n    -Xshare:auto      \u5118\u53EF\u80FD\u4F7F\u7528\u5171\u7528\u985E\u5225\u8CC7\u6599 (\u9810\u8A2D)\n    -Xshare:on        \u9700\u8981\u4F7F\u7528\u5171\u7528\u985E\u5225\u8CC7\u6599\uFF0C\u5426\u5247\u5931\u6557\u3002\n    -XshowSettings    \u986F\u793A\u6240\u6709\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\n    -XshowSettings:all\n                      \u986F\u793A\u6240\u6709\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\n    -XshowSettings:vm \u986F\u793A\u6240\u6709 VM \u76F8\u95DC\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\n    -XshowSettings:properties\n                      \u986F\u793A\u6240\u6709\u5C6C\u6027\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\n    -XshowSettings:locale\n                      \u986F\u793A\u6240\u6709\u5730\u5340\u8A2D\u5B9A\u76F8\u95DC\u8A2D\u5B9A\u503C\u4E26\u7E7C\u7E8C\n\n -X \u9078\u9805\u4E0D\u662F\u6A19\u6E96\u9078\u9805\uFF0C\u82E5\u6709\u8B8A\u66F4\u4E0D\u53E6\u884C\u901A\u77E5\u3002\n" },
            { "java.launcher.cls.error1", "\u932F\u8AA4: \u627E\u4E0D\u5230\u6216\u7121\u6CD5\u8F09\u5165\u4E3B\u8981\u985E\u5225 {0}" },
            { "java.launcher.cls.error2", "\u932F\u8AA4: \u4E3B\u8981\u65B9\u6CD5\u4E0D\u662F\u985E\u5225 {1} \u4E2D\u7684 {0}\uFF0C\u8ACB\u5B9A\u7FA9\u4E3B\u8981\u65B9\u6CD5\u70BA:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "\u932F\u8AA4: \u4E3B\u8981\u65B9\u6CD5\u5FC5\u9808\u50B3\u56DE\u985E\u5225 {0} \u4E2D void \u985E\u578B\u7684\u503C\uFF0C \n\u8ACB\u5B9A\u7FA9\u4E3B\u8981\u65B9\u6CD5\u70BA:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "\u932F\u8AA4: \u5728\u985E\u5225 {0} \u4E2D\u627E\u4E0D\u5230\u4E3B\u8981\u65B9\u6CD5\uFF0C\u8ACB\u5B9A\u7FA9\u4E3B\u8981\u65B9\u6CD5\u70BA:\n   public static void main(String[] args)\n\u6216\u8005 JavaFX \u61C9\u7528\u7A0B\u5F0F\u985E\u5225\u5FC5\u9808\u64F4\u5145 {1}" },
            { "java.launcher.cls.error5", "\u932F\u8AA4: \u907A\u6F0F\u57F7\u884C\u6B64\u61C9\u7528\u7A0B\u5F0F\u6240\u9700\u7684 JavaFX \u7A0B\u5F0F\u5BE6\u969B\u57F7\u884C\u5143\u4EF6" },
            { "java.launcher.ergo.message1", "                  \u9810\u8A2D\u7684 VM \u70BA {0}" },
            { "java.launcher.ergo.message2", "                  \u56E0\u70BA\u60A8\u6B63\u5728\u4F3A\u670D\u5668\u985E\u5225\u6A5F\u5668\u4E0A\u57F7\u884C\u3002\n" },
            { "java.launcher.init.error", "\u521D\u59CB\u5316\u932F\u8AA4" },
            { "java.launcher.jar.error1", "\u932F\u8AA4: \u5617\u8A66\u958B\u555F\u6A94\u6848 {0} \u6642\u767C\u751F\u672A\u9810\u671F\u7684\u932F\u8AA4" },
            { "java.launcher.jar.error2", "\u5728 {0} \u4E2D\u627E\u4E0D\u5230\u8CC7\u8A0A\u6E05\u55AE" },
            { "java.launcher.jar.error3", "{0} \u4E2D\u6C92\u6709\u4E3B\u8981\u8CC7\u8A0A\u6E05\u55AE\u5C6C\u6027" },
            { "java.launcher.javafx.error1", "\u932F\u8AA4: JavaFX launchApplication \u65B9\u6CD5\u7684\u7C3D\u7AE0\u932F\u8AA4\uFF0C\u5B83\n\u5FC5\u9808\u5BA3\u544A\u70BA\u975C\u614B\u4E26\u50B3\u56DE void \u985E\u578B\u7684\u503C" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  \u4F7F\u7528 {0} \u4F4D\u5143\u8CC7\u6599\u6A21\u578B (\u5982\u679C\u6709\u7684\u8A71)\n" },
            { "java.launcher.opt.footer", "    -cp <class search path of directories and zip/jar files>\n    -classpath <class search path of directories and zip/jar files>\n                  \u4F7F\u7528 {0} \u5340\u9694\u7684\u76EE\u9304\u3001JAR \u5B58\u6A94\u4EE5\u53CA\n                  ZIP \u5B58\u6A94\u6E05\u55AE\u4F86\u641C\u5C0B\u985E\u5225\u6A94\u6848\u3002\n    -D<name>=<value>\n                  \u8A2D\u5B9A\u7CFB\u7D71\u5C6C\u6027\n    -verbose:[class|gc|jni]\n                  \u555F\u7528\u8A73\u7D30\u8CC7\u8A0A\u8F38\u51FA\n    -version      \u5217\u5370\u7522\u54C1\u7248\u672C\u4E26\u7D50\u675F\n    -version:<value>\n                  \u8B66\u544A: \u6B64\u529F\u80FD\u5DF2\u4E0D\u518D\u4F7F\u7528\uFF0C\u5C07\u6703\u5F9E\n                  \u672A\u4F86\u7248\u672C\u4E2D\u79FB\u9664\u3002\n                  \u9700\u8981\u6307\u5B9A\u7684\u7248\u672C\u624D\u80FD\u57F7\u884C\n    -showversion  \u5217\u5370\u7522\u54C1\u7248\u672C\u4E26\u7E7C\u7E8C\n    -jre-restrict-search | -no-jre-restrict-search\n                  \u8B66\u544A: \u6B64\u529F\u80FD\u5DF2\u4E0D\u518D\u4F7F\u7528\uFF0C\u5C07\u6703\u5F9E\n                  \u672A\u4F86\u7248\u672C\u4E2D\u79FB\u9664\u3002\n                  \u5728\u7248\u672C\u641C\u5C0B\u4E2D\u5305\u62EC/\u6392\u9664\u4F7F\u7528\u8005\u5C08\u7528 JRE\n    -? -help      \u5217\u5370\u6B64\u8AAA\u660E\u8A0A\u606F\n    -X            \u5217\u5370\u975E\u6A19\u6E96\u9078\u9805\u7684\u8AAA\u660E\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  \u555F\u7528\u542B\u6307\u5B9A\u8A73\u7D30\u7A0B\u5EA6\u7684\u5BA3\u544A\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  \u505C\u7528\u542B\u6307\u5B9A\u8A73\u7D30\u7A0B\u5EA6\u7684\u5BA3\u544A\n    -esa | -enablesystemassertions\n                  \u555F\u7528\u7CFB\u7D71\u5BA3\u544A\n    -dsa | -disablesystemassertions\n                  \u505C\u7528\u7CFB\u7D71\u5BA3\u544A\n    -agentlib:<libname>[=<options>]\n                  \u8F09\u5165\u539F\u751F\u4EE3\u7406\u7A0B\u5F0F\u7A0B\u5F0F\u5EAB <libname>\uFF0C\u4F8B\u5982 -agentlib:hprof\n                  \u53E6\u8ACB\u53C3\u95B1 -agentlib:jdwp=help \u8207 -agentlib:hprof=help\n    -agentpath:<pathname>[=<options>]\n                  \u4F7F\u7528\u5B8C\u6574\u8DEF\u5F91\u540D\u7A31\u8F09\u5165\u539F\u751F\u4EE3\u7406\u7A0B\u5F0F\u7A0B\u5F0F\u5EAB\n    -javaagent:<jarpath>[=<options>]\n                  \u8F09\u5165 Java \u7A0B\u5F0F\u8A9E\u8A00\u4EE3\u7406\u7A0B\u5F0F\uFF0C\u8ACB\u53C3\u95B1 java.lang.instrument\n    -splash:<imagepath>\n                  \u986F\u793A\u6307\u5B9A\u5F71\u50CF\u7684\u8EDF\u9AD4\u8CC7\u8A0A\u756B\u9762\n\u8ACB\u53C3\u95B1 http://www.oracle.com/technetwork/java/javase/documentation/index.html \u66B8\u89E3\u8A73\u7D30\u8CC7\u8A0A\u3002" },
            { "java.launcher.opt.header", "\u7528\u6CD5: {0} [-options] class [args...]\n           (\u57F7\u884C\u985E\u5225)\n   \u6216  {0} [-options] -jar jarfile [args...]\n           (\u57F7\u884C jar \u6A94\u6848)\n\u9078\u9805\u5305\u62EC:\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  \u662F \"{1}\" VM \u7684\u540C\u7FA9\u5B57  [\u5DF2\u4E0D\u518D\u4F7F\u7528]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  \u9078\u53D6 \"{1}\" VM\n" },
        };
    }
}
