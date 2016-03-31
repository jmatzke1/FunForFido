package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.MemberEntity;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
/**
 * @author jjjasonm
 *         Created on 3/17/16.
 */
public class MemberDAOHibernate implements MemberDao {

    // TODO: do i have to use this.getclass?
    private final Logger log = Logger.getLogger(this.getClass());

    // TODO: Finish out these methods in MemberDao

    public List<MemberEntity> getAllMembers() {

      List<MemberEntity> members = new ArrayList<MemberEntity>();
        return members;
    }


    public void updateMember(MemberEntity member) {

    }

    @Override
    public void deleteMember(MemberEntity member) {

    }

    @Override
    public int addMember(MemberEntity member) {
        return 0;
    }


}


