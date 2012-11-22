package org.serverlabs.arcanium.core.service.impl;

import org.serverlabs.arcanium.core.dao.GroupDao;
import org.serverlabs.arcanium.core.entity.Group;
import org.serverlabs.arcanium.core.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao groupDao;

    @Transactional(readOnly = true)
    public Group findGroup(long groupId) {
        return groupDao.find(groupId);
    }
}
