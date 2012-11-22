package org.serverlabs.arcanium.webapp.dataproviders;

import org.serverlabs.arcanium.core.entity.Group;
import org.serverlabs.arcanium.core.service.GroupService;
import org.serverlabs.arcanium.webapp.dto.GroupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;


@Controller
public class HelloProvider {

    @Autowired
    private GroupService groupService;

    @Transactional
    public GroupDTO getGroup() {
        long groupId = 1;
        Group group = this.groupService.findGroup(groupId);
        System.err.println(group);
        return null;
    }

}
