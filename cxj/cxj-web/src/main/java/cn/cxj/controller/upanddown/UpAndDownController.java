package cn.cxj.controller.upanddown;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 文件上传下载
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="fileOperate")
public class UpAndDownController {
	private final String url ="/file/";
	
   @RequestMapping("/init")	
   public String initFileOperate(){
	   return url +"init";
   }
}
