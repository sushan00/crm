package base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 日期相关值
 * 
 * @author lh
 */
public class ReadProperties {

    /**
     * 根据文件名称、属性名获取相应属性值
     * 
     * @throws IOException
     * @throws FileNotFoundException
     * 
     * 
     */
    public static String getprop(String filename, String propname) throws IOException {
        Properties props = new Properties();
        props.load(ReadProperties.class.getClassLoader().getResourceAsStream(filename));
        return props.getProperty(propname);
    }
    
    /**
     * 读取配置文件
     * @param filename
     * @return
     * @throws IOException
     */
    public static Properties getprops(String filename) throws IOException {
        Properties props = new Properties();
        props.load(ReadProperties.class.getClassLoader().getResourceAsStream(filename));
        return props;
    }
}