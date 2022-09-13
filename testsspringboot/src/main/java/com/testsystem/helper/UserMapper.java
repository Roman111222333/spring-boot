//package com.testsystem.helper;
//
//import com.testsystem.model.User;
//import com.testsystem.service.imp.UserPrincipal;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class UserMapper {
//            public static UserPrincipal userToPrincipal(User user) {
//                UserPrincipal userp = new UserPrincipal();
//                List<SimpleGrantedAuthority> authorities = user.getRoles().stream()
//                    .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName())).collect(Collectors.toList());
//
//                userp.setUsername(user.getUsername());
//                userp.setPassword(user.getPassword());
//                userp.setEnabled(user.isEnabled());
//                userp.setAuthorities(authorities);
//                return userp;
//            }
//
//
//
//        }
//