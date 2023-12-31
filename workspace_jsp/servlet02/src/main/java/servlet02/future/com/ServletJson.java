package servlet02.future.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
@WebServlet("/users")
public class ServletJson extends HttpServlet{
    @SuppressWarnings("unchecked")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Access-Control-Allow-Origin", "*");// 클라이언트 요청에서 허용해줌
//        JSONObject json = new JSONObject();
//        json.put("name", "nick");
//        json.put("age", 20);
        String qString = req.getParameter("q");
        ApiExamSearchBlog api = new ApiExamSearchBlog();
        String result = api.naverSearch(qString);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write(result);
//        resp.getWriter().write(json.toJSONString());

    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        super.doPost(req, resp);
    }

}