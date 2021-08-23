package com.example.demo.dao;

import com.example.demo.entity.Inquiry;
import java.util.List;

public interface InquiryDao {
	void insertInquiry(InquiryDao inquiry);
	
	List<Inquiry> getAll();

	void insertInquiry(Inquiry inquiry);
}
