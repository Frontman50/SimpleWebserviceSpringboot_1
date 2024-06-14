package leo.com;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Controller {

  @GetMapping("/api/test")
  public String getString() {
    return "Here is the string";
  }

  @GetMapping("/helloworld")
  public String getMethodName() throws Exception {

    SomeObject someObject = new SomeObject(6, "hi");

    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    String json = ow.writeValueAsString(someObject);

    return json;
  }

}
