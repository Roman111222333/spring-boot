//package com.testsystem.service.imp;
//
//import com.testsystem.helper.UserMapper;
//import com.testsystem.model.User;
//import com.testsystem.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//
//        @Transactional
//        @Service
//        public class UserDetailsServiceImpl implements UserDetailsService {
//            @Autowired
//            private UserRepository userRepository;
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                User user = userRepository.findByUsername(username)
//                    .orElseThrow(() -> new UsernameNotFoundException("User NOT Found"));
//                return UserMapper.userToPrincipal(user);
//            }
//        }