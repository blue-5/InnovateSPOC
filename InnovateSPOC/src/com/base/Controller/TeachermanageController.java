package com.base.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.base.Po.teacherList;
import com.base.Po.teachers;
import com.base.Service.TeacherService;

@Controller("TeachermanageController")
@RequestMapping("/jsp")
public class TeachermanageController {

	@Autowired
    private TeacherService teacherService;
	
	//增加教师信息
	@RequestMapping("/addteacher.do")
	public String addTeacher(HttpServletRequest request,
		    HttpServletResponse response, HttpSession session){
		String teacherId = request.getParameter("teacherId");
		String teacherName = request.getParameter("teacherName");
		String sex = request.getParameter("sex");
		String Areason = request.getParameter("Areason");
		String password = request.getParameter("password");
//		String photo = request.getParameter("file");
		int flag = teacherService.addTeacher(teacherId,teacherName,sex,Areason,password);
		request.setAttribute("flag", flag);
		return "teacherManage";
	}
	
	// 展示教师信息
    @RequestMapping("/query_teacher.do")
    public String query_teacher(HttpServletRequest request,
	    HttpServletResponse response) {
	String searchValue = request.getParameter("search[value]");
	if (searchValue.equals("")) {
	    searchValue = null;
	}
	// 获取当前页面的传输几条记录
	Integer size = Integer.parseInt(request.getParameter("length"));
	// 数据起始位置
	Integer startIndex = Integer.parseInt(request.getParameter("start"));
	Integer draw = Integer.parseInt(request.getParameter("draw"));
//	int order = Integer.valueOf(request.getParameter("order[0][column]"));// 排序的列号
	int order = 1;
	// String orderDir = request.getParameter("order[0][dir]");//
	// 排序的顺序asc or
	String orderDir = "desc"; // // desc
	// 通过计算求出当前页面为第几页
	Integer pageindex = (startIndex / size + 1);
	int recordsTotal = 0;
	List<teachers> list = new ArrayList<teachers>();
	teacherList pr = null;
	pr = teacherService.query_teacher(size, pageindex, order,
		orderDir, searchValue);
	list = pr.getData();
	recordsTotal = pr.getRecordsTotal();
	JSONObject getObj = new JSONObject();
	getObj.put("draw", draw);
	getObj.put("recordsFiltered", recordsTotal);
	getObj.put("recordsTotal", recordsTotal);
	getObj.put("data", list);
	response.setContentType("text/html;charset=UTF-8");
	try {
	    response.getWriter().print(getObj.toString());
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }
	
    //删除教师
    @RequestMapping("/delteacher.do")
    public String deleteTeacher(HttpServletRequest request,
    	    HttpServletResponse response) {
    	String str = request.getParameter("deletstr");
    	String message = teacherService.deleteTeacher(str);
    	if (message.equals("success")) {
    	    message = "操作成功";
    	} else if (message.equals("fail")) {
    	    message = "操作失败";
    	}
    	JSONObject getObj = new JSONObject();
    	getObj.put("str", message);
    	response.setContentType("text/html;charset=UTF-8");
    	try {
    	    response.getWriter().print(getObj.toString());
    	} catch (IOException e) {
    	    // TODO Auto-generated catch block
    	    e.printStackTrace();
    	}
    	return null;
        }
    
    //修改操作
    @RequestMapping("/updateteacher.do")
    public String updateteacher(HttpServletRequest request,
    	    HttpServletResponse response) {
    	String tid = request.getParameter("tid");
    	String Tintroduce = request.getParameter("Tintroduce");
    	teacherService.updateteacher(tid, Tintroduce);
    	return "teacherManage";
    	
    }
    
    // 检查id是否已存在
    @RequestMapping("/CheckteacherId.do")
    public String CheckmName(HttpServletRequest request,
	    HttpServletResponse response, ModelMap map) {
	boolean flag = false;
	// 获得用户输入的基地名称
	int teacherId = Integer.parseInt(request.getParameter("teacherId"));
	// 获得是否存在
	int a = teacherService.CheckteacherId(teacherId);
	if (a == 0) {
	    flag = false;
	} else {
	    flag = true;
	}
	response.setContentType("text/html;charset=UTF-8");
	try {
	    // JSONObject json=new JSONObject();
	    response.getWriter().print(flag);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }
}
