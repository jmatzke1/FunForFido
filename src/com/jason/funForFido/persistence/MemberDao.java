package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.MemberEntity;

import java.util.List;

/**
 * @author jjjasonm
 *         Created on 3/29/16.
 */
public interface MemberDao {

    public List<MemberEntity> getAllMembers();

    public void updateMember(MemberEntity member);

    public void deleteMember(MemberEntity member);

    public int addMember(MemberEntity member);

}
