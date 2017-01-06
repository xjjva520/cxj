package cn.cxj.controller;

import java.util.HashMap;
import java.util.Map;

import org.cxj.service.SortService;
import org.cxj.service.impl.SortServiceImpl;
import org.cxj.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SortController {
	@Autowired
	private SortService service;
	private final static Logger logger = LoggerFactory.getLogger(SortController.class); 
	
    @RequestMapping(value="/sort.json" , produces = "application/json;charset=UTF-8")
    @ResponseBody
	public Map<String ,Object> sort(String num,String array){
    	Integer rnum = CommonUtil.praseInt(num);
		Map<String,Object> obj = new HashMap<String, Object>();
		String[] split = array.split(",");
		int [] a = new int[split.length];
		String reg="^\\d+$";
		for(int i=0;i<split.length;i++){
		System.out.println(split[i].matches(reg));
		 if(split[i].matches(reg)){
		  a[i]=CommonUtil.praseInt(split[i]);
		 }
		}
		if(!array.contains("0")){
		 for(int j=0;j<a.length;j++){
			 if(a[j]==0){
				 a[j]=100000;
			 }
		 }	
		}
		try {
		int[] ra =service.sort(rnum,a);
		obj.put("result", ra);
		obj.put("sucess", "true");
		logger.info("11111111111111----------2222222222--info");
		logger.error("11111111111111----------2222222222--error");
		logger.debug("11111111111111----------2222222222--debug");
		logger.warn("11111111111111----------2222222222--warn");
		} catch (Exception e) {
			obj.put("sucess", "false");
			obj.put("errMsg", e.getMessage());
		}
		return obj;
	}
	
    @RequestMapping(value="/replace.json" , produces = "application/json;charset=UTF-8")
    @ResponseBody
	public Map<String ,Object> replace(String str,String replce){
		Map<String,Object> obj = new HashMap<String, Object>();
		try {
		String replaceStr = CommonUtil.replaceStr(str, replce);
		obj.put("result", replaceStr);
		obj.put("sucess", "true");
		} catch (Exception e) {
			obj.put("sucess", "false");
			obj.put("errMsg", e.getMessage());
		}
		return obj;
	}
}
