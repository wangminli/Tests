import java.io.IOException;  
import java.text.ParseException;  
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.node.ObjectNode;

/**
 * JSON转Java类[JSON反序列化]
 * */
public class JacksonDemo01 {  
    public static void main(String[] args) throws ParseException, IOException {  
        String json = "{\"name\":\"小民\",\"age\":20,\"birthday\":844099200000,\"email\":\"xiaomin@sina.com\"}";  
          
        /** 
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。 
         */  
        ObjectMapper mapper = new ObjectMapper();  
        User user = mapper.readValue(json, User.class);  
        System.out.println(user);  
    }  
}  