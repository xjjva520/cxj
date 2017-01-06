package cn.cxj.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cxj.dao.pojo.Pojo;
import org.cxj.service.PdfPrintService;
import org.cxj.service.impl.SortServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
	@Autowired
	private SortServiceImpl service;
	@Autowired
	private PdfPrintService pdfService;
	private String url = "/testView/";

	@RequestMapping("/test")
	public String test(Model model) throws Exception {
		Map<String, String> tt = new HashMap<String, String>();
		tt.put("1", "china");
		tt.put("2", "usa");
		tt.put("3", "sinple");
		return url + "test";
	}
	
	@RequestMapping("/print")
    public ModelAndView print(){
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	String url ="JR_test/JR_QueryGoldSwapApp";
    	Pojo oo = new Pojo();
		oo.setMax(new BigDecimal(555));
		oo.setMin(new BigDecimal(123));
		
		Pojo ooo = new Pojo();
		ooo.setMax(new BigDecimal(5555));
		ooo.setMin(new BigDecimal(1233));
		List<Pojo> olist = new ArrayList<Pojo>();
		olist.add(oo);
		olist.add(ooo);
		try {
			map =  pdfService.ireport(olist);
			ModelAndView view = new ModelAndView(url, map);
			return view;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return null;
  
    }
	@RequestMapping(value="/one.json", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, String> getMaps(String proID)  throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		if ("1".equals(proID)) {
			map.put("one", "56");
		} else if ("2".equals(proID)) {
			map.put("two", "52");
		} else {
			map.put("three", "50");
		}
		return map;
	}
	
	
    	
	@RequestMapping("/two")
	public void tow() throws Exception{
		
		
	}
}
