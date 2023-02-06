package com.klef.jfsd.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.model.Accountant;
import com.klef.jfsd.model.Application;
import com.klef.jfsd.model.Customer;
import com.klef.jfsd.model.Manager;
import com.klef.jfsd.service.AccountantService;
import com.klef.jfsd.service.ApplicationService;
import com.klef.jfsd.service.CustomerService;
import com.klef.jfsd.service.ManagerService;

@Controller
public class ClientController 
{
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ManagerService managerService;
	
	@Autowired
	private AccountantService accountantService;
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/customerlogin")
	public ModelAndView customerlogindemo()
	{
		ModelAndView mv = new ModelAndView("customerlogin");
		
		return mv;
				
	}
	@GetMapping("/customerregistration")
	public ModelAndView customerregistrationdemo()
	{
		ModelAndView mv = new ModelAndView("customerregistration", "cust", new Customer());
		
		return mv;
	}

	@PostMapping("/addcustomer")
	public String addcustomerdemo(@ModelAttribute("cust") Customer customer)
	{
		customerService.addcustomer(customer);
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("customerregistration");
//		mv.addObject("msg", "Customer Registered Successfully");
		
		return "redirect:customerlogin";
	}
	@PostMapping("/checkcustlogin")
	public ModelAndView checkcustlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		
		String custname=request.getParameter("custname");
		String custpwd=request.getParameter("custpwd");
		
		Customer customer = customerService.checkcustlogin(custname, custpwd);
		
		if(customer!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("custname", custname);
			
			mv.setViewName("customerhome");
		}
		else
		{
			mv.setViewName("customerlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		return mv;
		
	}
	@GetMapping("/viewcust")
	public ModelAndView viewcustomerdemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String custname = (String)session.getAttribute("custname");
		
		Customer cust = customerService.viewcustomer(custname);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewcustomer");
		mv.addObject("cust", cust);
		
		return mv;
	
	}
	@GetMapping("/customerhome")
	public ModelAndView customerhomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("custmerhome");
		
		HttpSession session = request.getSession();
		
		String custname = (String)session.getAttribute("custname");
		
		mv.addObject("custname", custname);
		
		return mv;
	}
	@GetMapping("/cchangepwd")
	public ModelAndView cchangepwddemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		
		String custname = (String)session.getAttribute("custname");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("custchangepwd");
		mv.addObject("custname", custname);
		
		return mv;
	}
	@PostMapping("/updatecustpwd")
	public ModelAndView updatecustdemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		HttpSession session = request.getSession();
		
		String custname = (String)session.getAttribute("custname");
		
		String coldpwd = request.getParameter("copwd");
		String cnewpwd = request.getParameter("cnpwd");
		
		int n =  customerService.changecustomerpassword(coldpwd, cnewpwd, custname);
		
		if(n>0)
		{
			mv.setViewName("custchangepwd");
			mv.addObject("msg", "password updated successfully");
		}
		else
		{
			mv.setViewName("custchangepwd");
			mv.addObject("msg", "Old Password is Incorrect");
		}
		return mv;
	}
	@GetMapping("/managerlogin")
	public ModelAndView managerlogindemo()
	{
		ModelAndView mv = new ModelAndView("managerlogin");
		
		return mv;
				
	}
	
	@PostMapping("/checkmanlogin")
	public ModelAndView checkmanlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		
		String manname=request.getParameter("manname");
		String manpwd=request.getParameter("manpwd");
		
		Manager manager = managerService.checkmanlogin(manname, manpwd);
		
		if(manager!=null)
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("manname", manname);
			
			mv.setViewName("managerhome");
		}
		else
		{
			mv.setViewName("managerlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		return mv;
		
	}
	@GetMapping("/managerhome")
	public ModelAndView managerhomedemo()
	{
		ModelAndView mv = new ModelAndView("managerhome");
		
		return mv;
				
	}
	@GetMapping("/viewallcusts")
	public ModelAndView viewallcustsdemo()
	{
		ModelAndView mv = new ModelAndView("viewallcusts");
		
		List<Customer> custlist =  managerService.viewallcustomers();
		
		mv.addObject("custlist", custlist);
		
		return mv;
				
	}
	@GetMapping("/deletecust")
	public String deletecustdemo(@RequestParam("id") int cid)
	{
		managerService.deletecustomer(cid);
		
		return "redirect:viewallcusts";
	}
	@GetMapping("/viewcustbyid")
	public ModelAndView viewcustbyiddemo(@RequestParam("id") int cid)
	{
		Customer cust = managerService.viewcustomerbyid(cid);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewcustbyid");
		mv.addObject("cust", cust);
		
		return mv;
	}
	@GetMapping("/accountantlogin")
	public ModelAndView accountantlogindemo()
	{
		ModelAndView mv = new ModelAndView("accountantlogin");
		
		return mv;
				
	}
	@PostMapping("/checkaccountantlogin")
	public ModelAndView checkaccountantlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		 
		
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		
		Accountant accountant = accountantService.checkaccountantlogin(auname, apwd);
		
		if(accountant!=null)
		{
			mv.setViewName("accountanthome");
		}
		else
		{
			mv.setViewName("accountantlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		return mv;
		
	}
	@GetMapping("/accountanthome")
	public ModelAndView accountanthomedemo()
	{
		ModelAndView mv = new ModelAndView("accountanthome");
		
		return mv;
	}
	@GetMapping("/viewallmans")
	public ModelAndView viewallmansdemo()
	{
		ModelAndView mv = new ModelAndView("viewallmans");
		
		List<Manager> manlist =  accountantService.viewallmanagers();
		
		mv.addObject("manlist", manlist);
		
		return mv;
}
	@GetMapping("/deleteman")
	public String deletemandemo(@RequestParam("username") String cusername)
	{
		accountantService.deletemanager(cusername);
		
		return "redirect:viewallmans";
	}
	@GetMapping("/viewmanbyid")
	public ModelAndView viewmanbyiddemo(@RequestParam("username") String cusername)
	{
		Manager man = accountantService.viewmanagerbyuname(cusername);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("viewmanbyid");
		mv.addObject("man", man);
		
		return mv;
	}
	
	@GetMapping("/addmanager")
	public ModelAndView addmanagerdemo()
	{
		
		
	ModelAndView mv = new ModelAndView("addmanager", "man", new Manager());
		
		return mv;		
	}
	@PostMapping("/addman")
	public String addmandemo(@ModelAttribute("man") Manager manager)
	{
		managerService.addman(manager);
		
		return "redirect:addmanager";

	}
	@RequestMapping("/visaapp")
	  public ModelAndView visaappdemo()
	  {
	    ModelAndView mv = new ModelAndView("visaapp");  
	      return mv;
	  }
	  @PostMapping("/addapplication")
	  public String addapplicationdemo(HttpServletRequest request,@RequestParam("Proofs")MultipartFile file)throws IOException, SerialException, SQLException
	  {
	    
	    
	    String name = request.getParameter("name");
	    String gender = request.getParameter("gender");
	    String dob = request.getParameter("dob");
	    String email = request.getParameter("email");
	    String passporttype = request.getParameter("passporttype");
	    String passportnumber = request.getParameter("passportnumber");
	    String nationality = request.getParameter("nationality");
	    String visaservice = request.getParameter("visaservice");
	    String destination = request.getParameter("destination");
	    String portofarrival = request.getParameter("portofarrival");
	    String status = "applied";
	    
	    byte[] bytes = file.getBytes();
	    Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
	    
	    Application app = new Application();
	    
	    app.setName(name);
	    app.setGender(gender);
	    app.setDateofbirth(dob);
	    app.setEmail(email);
	    app.setPassporttype(passporttype);
	    app.setPassportnumber(passportnumber);
	    app.setNationality(nationality);
	    app.setVisaservice(visaservice);
	    app.setDestination(destination);
	    app.setPortofarrival(portofarrival);
	    app.setProofs(blob);
	    app.setStatus(status);
	    
	    applicationService.addapplication(app);
	    
	    return "redirect:visaapp";
	  }
	  @GetMapping("/viewallapps")
		public ModelAndView viewallappsdemo()
		{
			ModelAndView mv = new ModelAndView("viewallapps");
			
			List<Application> applist =  managerService.viewallapplications();
			
			mv.addObject("applist", applist);
			
			return mv;
	}
	  @GetMapping("/viewappbyid")
		public ModelAndView viewappbyiddemo(@RequestParam("id") int mid)
		{
			Application app = managerService.viewapplicationbyid(mid);
			
			ModelAndView mv = new ModelAndView();
			
			mv.setViewName("viewappbyid");
			mv.addObject("app", app);
			
			return mv;
		}
	  @GetMapping("/updateapp")
		public String updateappdemo(@RequestParam("id") Integer id)
		{
			applicationService.changestatus(id);
			
			return "redirect:viewallapps";
		}
	  @GetMapping("/updateappdec")
		public String updateappdecdemo(@RequestParam("id") Integer id)
		{
			applicationService.changestatusdec(id);
			
			return "redirect:viewallapps";
		}
	  @GetMapping("/visaapplication")
		public ModelAndView visaapplicationdemo(HttpServletRequest request)
		{
			HttpSession session = request.getSession();
			
			String appname = (String)session.getAttribute("appname");
			
			Application app = applicationService.visaapplication(appname);
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("visaapplication");
			mv.addObject("app",app);
			
			return mv;
		
		}
}
