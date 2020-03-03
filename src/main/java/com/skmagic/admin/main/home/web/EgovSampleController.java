/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.skmagic.admin.main.home.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmodules.validation.commons.DefaultBeanValidator;

import com.skmagic.admin.main.home.service.EgovSampleService;

import egovframework.rte.fdl.property.EgovPropertyService;

/**
 * 
 * @패키지명 : egovframework.skmagic.admin.main.web
 * @클래스명 : EgovSampleController.class
 * @작성자 : K.S.B
 * @작성일 : 2020. 3. 3.
 * @설명 : 메인 컨트롤러
 * @ 소스 변경 내역
 * @  날짜            수정자        수정내용
 * @ -------------------------------------------------
 * @ 2020. 3. 3.   K.S.B   최초생성
 */
@Controller
public class EgovSampleController {

	/**
	 * @ 내용 : 메인 페이지
	 * @ 작성자 : K.S.B
	 * @ Method : adminMainView
	 * @ @return
	 * 
	 */
	@RequestMapping(value = "/adminSampleMainView.do")
	public String adminMainView() {
		return "home/main";
	}
}
