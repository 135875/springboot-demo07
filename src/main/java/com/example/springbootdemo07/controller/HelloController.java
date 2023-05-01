package com.example.springbootdemo07.controller;

import com.example.springbootdemo07.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: HelloController
 * Package: com.example.springbootdemo07.controller
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
@Api(tags = {"用户接口"})
@RestController
//@Validated
public class HelloController {
    /**
     *
     */
//    @ModelAttribute
//    public String hello(@PathVariable("i") int i){
//        return "hellwefjwoefjoi"+i;
//    }
//
//    @RequestMapping(value = "/user/{i}")
//    public User getUser(User user, Model model){
//
//        Object hello = model.getAttribute("string");
//        System.out.println(hello);
//        return user;
//    }


//    @RequestMapping(value = "/user",params = {"id=23","username=save"})
//    public User getID(User user, int id){
//        user.setAge(id);
//        return user;
//    }
//    @RequestMapping("/user/{username}/blog/{blogId}")
//    public String getUerBlog(@PathVariable String username , @PathVariable int blogId) {
//        return "user: " + username + "blog：" + blogId;
//    }

//    @RequestMapping("/user/{username:[a-zA-Z0-9_]+}/blog/{blogId}")
//    public String getUerBlog2(@PathVariable String username , @PathVariable int blogId) {
//        return "user: " + username + "blog：" + blogId;
//    }
//    @ModelAttribute
//    public void findUserById(@PathVariable("userId") Long userId, Model model) {
//        model.addAttribute("user",new User(1,"danfucao"+userId));
//    }

//    @GetMapping("/user/{userId}")
////    public String findUser(Model model) {
////        System.out.println(model.containsAttribute("user"));
////        System.out.println(model.getAttribute("user"));
////        return "success !";
////    }

//    @PostMapping(path = "/save2")
//    public String save2(@RequestBody User user ) {
//        String name = user.getName();
//        String lastName = user.getAddress();
//        return name+" "+lastName;
//    }

//    @PostMapping(path = "/check")
//    public String check(@RequestBody @Valid User user, BindingResult result) {
//        String name = user.getName();
//        if(result.hasErrors()) {
//            List<ObjectError> list = result.getAllErrors();
//            for (ObjectError error : list) {
//                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
//            }
//        }
//        return name;
//    }
//    @GetMapping(path = "/check")
//    public String check2(@Valid User user, BindingResult result) {
//        String name = user.getName();
//        if(result.hasErrors()) {
//            List<ObjectError> list = result.getAllErrors();
//            for (ObjectError error : list) {
//                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
//            }
//        }
//        return name;
//    }
//
//    @RequestMapping("/query")
//    public String query(@Length(min = 2, max = 10, message = "姓名长度错误，姓名长度2-10！")
//                        @RequestParam(name = "name", required = true) String name,
//                        @Min(value = 1, message = "年龄最小只能1")
//                        @Max(value = 99, message = "年龄最大只能99")
//                        @RequestParam(name = "age", required = true) int age){
//        System.out.println(name + "," + age);
//        return name + "," + age;
//    }

    /**
     * 测试session
     */
//    @GetMapping("/set")
//    public void set(HttpServletRequest request){
//        HttpSession session = request.getSession();
//        session.setAttribute("name","单福操");
//    }
//
//    @GetMapping("/session/get")
//    public void get(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session = request.getSession();
//        String name = (String) session.getAttribute("name");
//        System.out.println(name+":"+request.getContextPath());
//
//    }
//    @GetMapping("/in")
//    public void in(HttpServletRequest request){
//        HttpSession session = request.getSession();
//        session.invalidate();
//
//    }

//    /**
//     * 测试cookie
//     */
//    @RequestMapping("/set")
//    public void setCookie(HttpServletResponse response) throws IOException {
//        Cookie cookie = new Cookie("username", "danfucao");
//        response.addCookie(cookie);
//        response.getWriter().write("<h1>good</h1>");
//    }
//    @RequestMapping("/get")
//    public void getCookie(HttpServletRequest request){
//        Cookie[] cookies = request.getCookies();
//         if(cookies!=null &&cookies.length>0){
//             for(Cookie cookie:cookies){
//                if(cookie.getName().equals("username")){
//                    System.out.println("hello"+cookie.getValue());
//                }
//             }
//         }
//
//    }

    /**
     * 拦截器
     */
//    @GetMapping("/hello")
//    public String hello(){
//        return "hello";
//    }
//    @GetMapping("/set")
//    public void set(HttpServletRequest request){
//        request.getSession().setAttribute("user","danfucao");
//
//    }
/**
 * swagger测试
 */
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @PostMapping(value = "user")
    public String save(@RequestBody User user){
        System.out.println("用户创建成功："+user.getName());
        return "用户创建成功";
    }

    @ApiOperation(value="更新用户详细信息", notes="根据id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @PutMapping(value = "user")
    public String update(@RequestBody User user) {
        System.out.println("用户修改成功："+user.getName());
        return "用户修改成功";
    }
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true, dataType = "Long", paramType = "query")
    @DeleteMapping("user/{userId}")
    public String delete(@PathVariable String userId) {
        System.out.println("用户删除成功："+userId);
        return "用户删除成功";
    }
}

