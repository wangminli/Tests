import java.io.IOException;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.node.ObjectNode; 
  
public class JacksonDemo02 {  
  
    public static void main(String[] args) throws ParseException, IOException {  
        User user = new User();  
        user.setName("小民");   
        user.setEmail("xiaomin@sina.com");  
        user.setAge(20);  
          
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");  
        user.setBirthday(dateformat.parse("1996-10-01"));         
          
        ObjectMapper mapper = new ObjectMapper();  
        String json = mapper.writeValueAsString(user);  
        System.out.println(json);  
        //输出结果：{"name":"小民","birthday":"1996年09月30日","mail":"xiaomin@sina.com"}  
    }  
}  