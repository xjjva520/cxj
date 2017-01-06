package org.cxj.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cxj.service.PdfPrintService;
import org.springframework.stereotype.Service;

@Service
public class PdfPrintServiceImpl implements PdfPrintService {

	@Override
	public Map<String, Object> ireport(List<?> list) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		JasreportImpl ji = new JasreportImpl();
		ji.setObjList(list);
		String viewType = "pdf";
		map.put("format", viewType);
		map.put("jas", ji);
		return map;
	}

	

	

}
