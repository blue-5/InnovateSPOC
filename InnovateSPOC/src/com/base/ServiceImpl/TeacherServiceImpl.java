package com.base.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.Dao.TeacherDao;
import com.base.Po.teacherList;
import com.base.Service.TeacherService;

@Service("TeacherService")
public class TeacherServiceImpl implements TeacherService {

	@Autowired
    private TeacherDao teacherdao;
	
	@Override
	public int addTeacher(String teacherId,String teacherName,String sex,String Areason,String password) {
		int flag = teacherdao.addTeacher(teacherId, teacherName, sex, Areason,password);
		return flag;
	}

	@Override
	public String deleteTeacher(String str) {
		String message= teacherdao.deleteTeacher(str);
		return message;
	}
	
	@Override
	public teacherList query_teacher(Integer size, Integer pageindex,
			int order, String orderDir, String searchValue) {
		// TODO Auto-generated method stub
		String columnName = "";
		if (order == 1) {
		    columnName = "id";
		} else if (order == 2) {
		    columnName = "name";
		} else if (order == 3) {
		    columnName = "sex";
		}
		teacherList list = teacherdao.query_teacher(size,
			pageindex, columnName, orderDir, searchValue);
		return list;
	}

	@Override
	public int CheckteacherId(int teacherId) {
		int flag = teacherdao.CheckteacherId(teacherId);
		return flag;
	}

	@Override
	public void updateteacher(String tid, String tintroduce) {
		teacherdao.updateteacher(tid, tintroduce);
	} 
	
	
}
