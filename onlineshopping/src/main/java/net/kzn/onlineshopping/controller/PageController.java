package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index" })
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring");
		return mv;
	}
	
	//mokled es node.js GET da POST requestebis pontia ra
	
	// anu karoche @ReqParam migebul parametrs daarqvems "greeting"s
	//da sheinaxavs String variable greeting shi
	//mere kide model and view ti davbewdavt ekranze
	//da mokled es yleoba savaldebulos xdis ro sheyvanil linkshi eweros "greeting"
	//da ekranze dagiwers imas rasac ?greeting=
	//magalitad //localhost.../test?greeting=welcome sxva shemtxvevashi error 400s agdebs 
	//mara axla required = false davuwere da agar agebs error 400s
	
//	@RequestMapping(value="test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
//		if(greeting==null){
//			greeting="parametri dagaviwyda yvero";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
	//axla path variable imis pontia linkidan ro ginda ragacis amogeba
	//magalitad userma sheiyvana ?greeting="gamarjoba" da ginda eg gamarjoba amoigo
	
		
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		if(greeting==null){
			greeting="parametri dagaviwyda yvero(isev)";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
}








