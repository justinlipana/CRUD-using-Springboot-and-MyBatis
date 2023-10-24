package com.uap.it1311l.registrationapi.repository;

import com.uap.it1311l.registrationapi.model.Attendee;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;

@Mapper
public interface RegistrationMybatisRepository 
{
	@Select("select * from attendees")
	public List<Attendee> findAll();
	
	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age})")
	public int insert(Attendee attendee);
	
	@Update("UPDATE attendees SET surveyEligibilityTag = true WHERE course = 'BSIT' OR course = 'bsit'")
    int checkBSITSurveryEligibilityTag();

    @Delete("DELETE FROM attendees WHERE attendeeId = #{id}")
    int deleteById(String id); 
}
