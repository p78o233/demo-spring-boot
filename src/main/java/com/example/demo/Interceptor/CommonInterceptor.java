package com.example.demo.Interceptor;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.mapper.InterceptorMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@Component
public class CommonInterceptor implements HandlerInterceptor {
//    @Autowired
//    private InterceptorService interceptorService;

    public InterceptorMapper interceptorMapper;

    private List<String> excludedUrls;

    public List<String> getExcludedUrls() {
        return excludedUrls;
    }


    public void setExcludedUrls(List<String> excludedUrls) {
        this.excludedUrls = excludedUrls;
    }

    public CommonInterceptor(InterceptorMapper interceptorMapper) {
        super();
        this.interceptorMapper = interceptorMapper;
    }

    /**
     *
     * 在业务处理器处理请求之前被调用 如果返回false
     * 从当前的拦截器往回执行所有拦截器的afterCompletion(),
     * 再退出拦截器链, 如果返回true 执行下一个拦截器,
     * 直到所有的拦截器都执行完毕 再执行被拦截的Controller
     * 然后进入拦截器链,
     * 从最后一个拦截器往回执行所有的postHandle()
     * 接着再从最后一个拦截器往回执行所有的afterCompletion()
     *
     * @param  request
     *
     * @param  response
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept,token");
//        拦截请求路径
        String path = request.getServletPath();
        if(path.split("/")[1].equals("demo")){
            //不拦截TestController
            return true;
        }
        else if (path.matches(Const.NO_INTERCEPTOR_PATH)) {
            //不需要的拦截直接过
            return true;
        } else {
            // 这写你拦截需要干的事儿，比如取缓存，SESSION，权限判断等
            String token = request.getHeader("token");
            if(!"".equals(token)&&token!=null) {
                String url = request.getRequestURI();
//            判断是哪个项目的
                String projectName = url.substring(0, url.indexOf("/", url.indexOf("/") + 1));
                switch (projectName) {
                    case "/pt": {
                        String role = url.split("/")[2];
                        if (role.equals("pt-user")) {
//                        兼职用户操作
                        }else if(role.equals("pt-admin")){
//                            系统管理员操作
//                            检查token是否有效
//                            if(interceptorService==null) {
//                                BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
//                                interceptorService = (InterceptorService) factory.getBean("interceptorServiceImpl");
//                            }
                            if(checkPtAdmin(token)){
//                                检查是否有权限操作
                                int adminId = getPtAdminIdByToken(token);
//                                测试打开这个东西
                                if(true){
//                                if(checkPermission(adminId,"/"+url.split("/")[1]+"/"+url.split("/")[2]+"/"+url.split("/")[3]+"/"+url.split("/")[4])){
                                    HttpSession session = request.getSession();
                                    session.setAttribute("adminId",adminId);
                                    return true;
                                }else{
//                                    无权限
                                    JSONObject json = new JSONObject();
                                    json.put("ret",false);
                                    json.put("code",505);
                                    json.put("data",null);
                                    json.put("message","您无权进行本操作，请联系管理员");
                                    returnJson(response,String.valueOf(json));
                                    return false;
                                }
                            }else{
//                                token无效
                                JSONObject json = new JSONObject();
                                json.put("ret",false);
                                json.put("code",504);
                                json.put("data",null);
                                json.put("message","登陆失效，请重新登陆");
                                returnJson(response,String.valueOf(json));
                                return false;
                            }
                        }
                    }
                    break;
                    default:
                        return true;
                }
            }else{
//                没有传token
                JSONObject json = new JSONObject();
                json.put("ret",false);
                json.put("code",504);
                json.put("data",null);
                json.put("message","登陆失效，请重新登陆");
                returnJson(response,String.valueOf(json));
                return false;
            }
            return true;
        }
//        return true;
    }

    // 在业务处理器处理请求执行完成后,生成视图之前执行的动作
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    /**
     *
     * 在DispatcherServlet完全处理完请求后被调用
     * 当有拦截器抛出异常时,
     * 会从当前拦截器往回执行所有的拦截器的afterCompletion()
     *
     * @param request
     *
     * @param response
     *
     * @param handler
     *
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {

    }

    private void returnJson(HttpServletResponse response, String json) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(json);

        } catch (IOException e) {

        } finally {
            if (writer != null)
                writer.close();
        }
    }


    //    兼职系统开始
    public boolean checkPtAdmin(String token) {
        if(interceptorMapper.checkToken(token)>0)
            return true;
        return false;
    }

    public int getPtAdminIdByToken(String token) {
        return interceptorMapper.getPtAdminId(token);
    }

    public boolean checkPermission(int userId, String permissionUrl) {
        if(interceptorMapper.checkAdminPermission(userId,permissionUrl)>0)
            return true;
        return false;
    }

    //    兼职系统结束

}

