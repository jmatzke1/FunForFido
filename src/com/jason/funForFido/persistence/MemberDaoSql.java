package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.MemberEntity;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jjjasonm
 *         Created on 4/5/16.
 */
public class MemberDaoSql implements MemberDao {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    public List<MemberEntity> getAllMembers() {
        List<MemberEntity> members = new ArrayList<MemberEntity>();

        Database database = Database.getInstance();

        Connection connection = null;

        String sql = "Select * from Member";
        try {

            database.connect();
            connection = database.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                MemberEntity memberEntity = createListFromDatabase(resultSet);
                members.add(memberEntity);
            }

        } catch (SQLException e) {
            log.error(e);
        } catch (Exception e) {
            log.error(e);
        }
        return members;
    }


    @Override
    public void updateMember(MemberEntity member) {

    }

    @Override
    public void deleteMember(MemberEntity member) {

    }

    @Override
    public int addMember(MemberEntity member) {
        return 0;
    }

    private MemberEntity createListFromDatabase(ResultSet resultSet) throws  SQLException {

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberID(resultSet.getInt("MemberID"));
        memberEntity.setLastName(resultSet.getString("LastName"));
        memberEntity.setFirstName(resultSet.getString("FirstName"));
        memberEntity.setAddress(resultSet.getString("Address"));
        memberEntity.setCity(resultSet.getString("City"));
        memberEntity.setState(resultSet.getString("State"));
        memberEntity.setZipCode(resultSet.getString("ZipCode"));
        memberEntity.setEmailAddress(resultSet.getString("EmailAddress"));

        return memberEntity;

    }
}
