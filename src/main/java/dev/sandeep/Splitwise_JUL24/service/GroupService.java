package dev.sandeep.Splitwise_JUL24.service;

import dev.sandeep.Splitwise_JUL24.dto.GroupCreationReqDTO;
import dev.sandeep.Splitwise_JUL24.exception.GroupNotFoundException;
import dev.sandeep.Splitwise_JUL24.model.Group;
import dev.sandeep.Splitwise_JUL24.model.User;
import dev.sandeep.Splitwise_JUL24.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserService userService;

    public Group createGroup(GroupCreationReqDTO groupCreationReqDTO) {
        Group group = new Group();
        group.setName(groupCreationReqDTO.getGroupName());
        List<User> users = new ArrayList<>();
        for(Integer userId : groupCreationReqDTO.getMemberIds()){
            users.add(userService.getUserById(userId));
        }
        group.setUsers(users);
        return groupRepository.save(group);
    }

    public Group getGroupById(Integer id) {
        return groupRepository.findById(id).orElseThrow(
                () -> new GroupNotFoundException("Group with id " + id + " not found")
        );
    }

}
