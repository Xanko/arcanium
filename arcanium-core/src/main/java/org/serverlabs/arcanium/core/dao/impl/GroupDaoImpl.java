package org.serverlabs.arcanium.core.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.serverlabs.arcanium.core.dao.GroupDao;
import org.serverlabs.arcanium.core.entity.Group;
import org.springframework.stereotype.Repository;


@Repository
public class GroupDaoImpl implements GroupDao {

    @PersistenceContext(unitName = "ArcaniumPU")
    private EntityManager em;

    @Override
    public Group find(long id) {
        return em.find(Group.class, id);
    }
}
