package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_es extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\nLas siguientes opciones son espec\u00EDficas para Mac OS X:\n    -XstartOnFirstThread\n                      ejecuta el m\u00E9todo main() del primer thread (AppKit)\n    -Xdock:name=<nombre de aplicaci\u00F3n>\"\n                      sustituye al nombre por defecto de la aplicaci\u00F3n que se muestra en el Dock\n    -Xdock:icon=<ruta de acceso a archivo de icono>\n                      sustituye al icono por defecto que se muestra en el Dock\n\n" },
            { "java.launcher.X.usage", "    -Xmixed           ejecuci\u00F3n de modo mixto (por defecto)\n    -Xint             s\u00F3lo ejecuci\u00F3n de modo interpretado\n    -Xbootclasspath:<directorios y archivos zip/jar separados por {0}>\n                      definir la ruta de acceso de b\u00FAsqueda para los recursos y clases de inicializaci\u00F3n de datos\n    -Xbootclasspath/a:<directorios y archivos zip/jar separados por {0}>\n                      agregar al final de la ruta de acceso de la clase de inicializaci\u00F3n de datos\n    -Xbootclasspath/p:<directorios y archivos zip/jar separados por {0}>\n                      anteponer a la ruta de acceso de la clase de inicializaci\u00F3n de datos\n    -Xdiag            mostrar mensajes de diagn\u00F3stico adicionales\n    -Xnoclassgc       desactivar la recolecci\u00F3n de basura de clases\n    -Xincgc           activar la recolecci\u00F3n de basura de clases\n    -Xloggc:<archivo> registrar el estado de GC en un archivo con registros de hora\n    -Xbatch           desactivar compilaci\u00F3n en segundo plano\n    -Xms<tama\u00F1o>      definir tama\u00F1o de pila Java inicial\n    -Xmx<tama\u00F1o>      definir tama\u00F1o de pila Java m\u00E1ximo\n    -Xss<tama\u00F1o>      definir tama\u00F1o de la pila del thread de Java\n    -Xprof            datos de salida de creaci\u00F3n de perfil de CPU\n    -Xfuture          activar las comprobaciones m\u00E1s estrictas, anticip\u00E1ndose al futuro valor por defecto\n    -Xrs              reducir el uso de se\u00F1ales de sistema operativo por parte de Java/VM (consulte la documentaci\u00F3n)\n    -Xcheck:jni       realizar comprobaciones adicionales para las funciones de JNI\n    -Xshare:off       no intentar usar datos de clase compartidos\n    -Xshare:auto      usar datos de clase compartidos si es posible (valor por defecto)\n    -Xshare:on        es obligatorio el uso de datos de clase compartidos, de lo contrario se emitir\u00E1 un fallo.\n    -XshowSettings    mostrar todos los valores y continuar\n    -XshowSettings:all\n                      mostrar todos los valores y continuar\n    -XshowSettings:vm mostrar todos los valores de la VM y continuar\n    -XshowSettings:properties\n                      mostrar todos los valores de las propiedades y continuar\n    -XshowSettings:locale\n                      mostrar todos los valores relacionados con la configuraci\u00F3n regional y continuar\n\nLas opciones -X no son est\u00E1ndar, por lo que podr\u00EDan cambiarse sin previo aviso.\n" },
            { "java.launcher.cls.error1", "Error: no se ha encontrado o cargado la clase principal {0}" },
            { "java.launcher.cls.error2", "Error: el m\u00E9todo principal no es {0} en la clase {1}, defina el m\u00E9todo principal del siguiente modo:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "Error: el m\u00E9todo principal debe devolver un valor del tipo void en la clase {0}, \ndefina el m\u00E9todo principal del siguiente modo:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "Error: no se ha encontrado el m\u00E9todo principal en la clase {0}, defina el m\u00E9todo principal del siguiente modo:\n   public static void main(String[] args)" },
            { "java.launcher.ergo.message1", "                  La VM por defecto es {0}" },
            { "java.launcher.ergo.message2", "                  porque la ejecuci\u00F3n se est\u00E1 llevando a cabo en una m\u00E1quina de clase de servidor.\n" },
            { "java.launcher.init.error", "error de inicializaci\u00F3n" },
            { "java.launcher.jar.error1", "Error: se ha producido un error inesperado al intentar abrir el archivo {0}" },
            { "java.launcher.jar.error2", "no se ha encontrado el manifiesto en {0}" },
            { "java.launcher.jar.error3", "no hay ning\u00FAn atributo de manifiesto principal en {0}" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  usar un modelo de datos de {0} bits, si est\u00E1 disponible\n" },
            { "java.launcher.opt.footer", "    -cp <ruta de acceso de b\u00FAsqueda de clases de los directorios y los archivos zip/jar>\n    -classpath <ruta de acceso de b\u00FAsqueda de clases de los directorios y los archivos zip/jar>\n                  Lista separada por {0} de directorios, archivos JAR\n                  y archivos ZIP para buscar archivos de clase.\n    -D<nombre>=<valor>\n                  definir una propiedad del sistema\n    -verbose:[class|gc|jni]\n                  activar la salida verbose\n    -version      imprimir la versi\u00F3n del producto y salir\n    -version:<valor>\n                  Advertencia: Esta funci\u00F3n est\u00E1 anticuada y se eliminar\u00E1\n                  en una versi\u00F3n futura.\n                  es necesario que se ejecute la versi\u00F3n especificada\n    -showversion  imprimir la versi\u00F3n del producto y continuar\n    -jre-restrict-search | -no-jre-restrict-search\n                  Advertencia: Esta funci\u00F3n est\u00E1 anticuada y se eliminar\u00E1\n                  en una versi\u00F3n futura.\n                  incluir/excluir JRE privados de usuario en la b\u00FAsqueda de versi\u00F3n\n    -? -help      imprimir este mensaje de ayuda\n    -X            imprimir la ayuda sobre las opciones que no sean est\u00E1ndar\n    -ea[:<nombre_paquete>...|:<nombre_clase>]\n    -enableassertions[:<nombre_paquete>...|:<nombre_clase>]\n                  activar afirmaciones con la granularidad especificada\n    -da[:<nombre_paquete>...|:<nombre_clase>]\n    -disableassertions[:<nombre_paquete>...|:<nombre_clase>]\n                  desactivar afirmaciones con la granularidad especificada\n    -esa | -enablesystemassertions\n                  activar afirmaciones del sistema\n    -dsa | -disablesystemassertions\n                  desactivar afirmaciones del sistema\n    -agentlib:<nombre_bib>[=<opciones>]\n                  cargar la biblioteca de agente nativa <nombre_bib>, como -agentlib:hprof\n                  v\u00E9ase tambi\u00E9n -agentlib:jdwp=help y -agentlib:hprof=help\n    -agentpath:<nombre_ruta_acceso>[=<opciones>]\n                  cargar biblioteca de agente nativa con el nombre de la ruta de acceso completa\n    -javaagent:<ruta_acceso_jar>[=<opciones>]\n                  cargar agente de lenguaje de programaci\u00F3n Java, v\u00E9ase java.lang.instrument\n    -splash:<ruta_acceso_imagen>\n                  mostrar una pantalla de presentaci\u00F3n con la imagen especificada\nConsulte http://www.oracle.com/technetwork/java/javase/documentation/index.html para obtener m\u00E1s informaci\u00F3n." },
            { "java.launcher.opt.header", "Sintaxis: {0} [-options] class [args...]\n           (para ejecutar una clase)\n   o  {0} [-options] -jar jarfile [args...]\n           (para ejecutar un archivo jar)\ndonde las opciones incluyen:\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  es un sin\u00F3nimo de la VM \"{1}\" [anticuada]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  para seleccionar la VM \"{1}\"\n" },
        };
    }
}
