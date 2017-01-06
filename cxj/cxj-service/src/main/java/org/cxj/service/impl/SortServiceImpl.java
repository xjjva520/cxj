package org.cxj.service.impl;

import org.cxj.service.SortService;

import org.springframework.stereotype.Service;

@Service
public class SortServiceImpl implements SortService {
	

	@Override
	public int[] sort(int num,int[] a) throws Exception {
		
		int temp =0 ;
		for(int i =0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		if(num>a.length){
			throw new Exception("你输入的数字不能超过长度！");
		}
		int[] ra = new int[num];
		for(int k=0;k<ra.length;k++){
			ra[k]=a[k];
		}
		return ra;
	}
   
}
