package com.agro.kavya.controller;

import static com.agro.kavya.utils.MyConstant.USER;
import static com.agro.kavya.utils.MyConstant.USERLIST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agro.kavya.dto.response.BasicResponse;
import com.agro.kavya.dto.response.UserResponse;
import com.agro.kavya.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
        @GetMapping(USERLIST)
        public ResponseEntity<BasicResponse<UserResponse>> create() {
            BasicResponse<UserResponse>response=new BasicResponse<>();
            try {
                response=userService.getAllUser();
                
                return new ResponseEntity<>(response,HttpStatus.OK);
            } catch (Exception e) {
                response.setMessage("Something went Wrong!");
                return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
            }
        }
    
    

}
