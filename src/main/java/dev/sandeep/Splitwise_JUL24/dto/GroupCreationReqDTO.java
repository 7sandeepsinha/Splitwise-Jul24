package dev.sandeep.Splitwise_JUL24.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupCreationReqDTO {
    private String groupName;
    private List<Integer> memberIds;
}