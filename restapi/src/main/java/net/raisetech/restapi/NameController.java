package net.raisetech.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    @GetMapping("/names")
    public List<NameResponse> getNames() {
        List<NameResponse> names = List.of(
                new NameResponse("haruto", "minazuki"),
                new NameResponse("hanako", "yamada"),
                new NameResponse("ichire", "suzuki")
        );
        return names;
    }

    @PostMapping("/names")
    public NameCreateResponse createName(@RequestBody NameCreateRequest Createrequest) {
        return new NameCreateResponse("Created a new name");
    }
}
