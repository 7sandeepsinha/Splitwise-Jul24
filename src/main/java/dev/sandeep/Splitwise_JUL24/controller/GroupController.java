package dev.sandeep.Splitwise_JUL24.controller;

import dev.sandeep.Splitwise_JUL24.dto.GroupCreationReqDTO;
import dev.sandeep.Splitwise_JUL24.model.Group;
import dev.sandeep.Splitwise_JUL24.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping("/group")
    public ResponseEntity createGroup(@RequestBody GroupCreationReqDTO groupCreationReqDTO) {
        // TODO : validations
        Group savedGroup = groupService.createGroup(groupCreationReqDTO);
        return ResponseEntity.ok(savedGroup);
    }
}
