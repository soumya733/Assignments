package com.oehm5.hibernate;

import java.util.List;

public class App {
	public static void main( String[] args )
    {
    	
        UserRegistration registration = new UserRegistration();
        registration.setId(125L);
        registration.setUserName("amith");
        registration.setPassword("passwroed");
        registration.setEmail("amith@gmail.com");
        registration.setMobileNumber("134567");
        
        RegiserDa0 registerDao = new RegiserDa0();
        registerDao.saveUser(registration);
       
        UserRegistration userRegistration = registerDao.getUserById(125L);
        System.out.println(userRegistration);
        
        		/*UserDto userDto = new UserDto();
        		userDto.setUserName("ravi t");
        		userDto.setPassword("pwd@123");
        		userDto.setMobileNumber("1234567890");
        		userDto.setEmail("rt@outlook.com");
        		
        		registerDao.updateUserDetailsById(124L, userDto);
        	
        		
        		/*RegisterHqlDao registerHqlDao = new RegisterHqlDao();
        		 RegisterHqlDao hqlDao = new RegisterHqlDao();
        	        
        	        List<UserRegistration> list = hqlDao.getUsers();
        	        list.forEach( user ->{
        	        		System.out.println(user);
        	        });
        	        
        	        
        	        UserRegistration userReg= hqlDao.getUserByEmail("rt@outlook.com");
        	        System.out.println(userRegistration);
        	        
        	       hqlDao.updateMobileNumberById("8951606106", 124L);
        	        hqlDao.deleteUserById(125L);
        	    }*/

    }
}

