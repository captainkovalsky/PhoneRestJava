package phone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class PhoneController {

    @RequestMapping("/phones")
    public List<Phone> phones() {
       List<Phone> phones = new ArrayList<Phone>();
       Phone phone1 = new Phone(1, "Nokia 630", true, false, true, 4545.55, "Microsoft");
       phones.add(phone1);
        return phones;
    }
}
