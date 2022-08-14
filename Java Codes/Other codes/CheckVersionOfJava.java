public class CheckVersionOfJava {
    // basic system property commands to get a view of how to apply
    public static void main(String[] args) {
        System.out.println("Java Version: "+System.getProperty("java.version"));//JRE version number
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));//Installation directory for Java Runtime Environment
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));//JRE vendor name
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));//JRE vendor URL
        System.out.println("User Name: "+System.getProperty("user.name"));//account name 
        System.out.println("User Home: "+System.getProperty("user.home"));// home directory
        System.out.println("User Directory : "+System.getProperty("user.dir"));// Working directory
        System.out.println("Os Version: "+System.getProperty("os.version"));// OS version
        System.out.println("Os Architecture: "+System.getProperty("os.arch"));// OS architecture
        System.out.println("Java Jav Architecture: "+System.getProperty("java.arch"));
        System.out.println("Line Seperator: "+System.getProperty("line.separator"));//Sequence used by operating system to separate lines in text files
        System.out.println("File Seperator: "+System.getProperty("file.separator"));//Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n"); //Path used to find directories and JAR archives containing class files. Elements of the class path are separated by  a platform-specific character specified in the path.separator property.
    }
}

