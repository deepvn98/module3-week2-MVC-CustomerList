package controller;

import model.Customer;
import sevice.CustomerInterface;
import sevice.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private CustomerInterface customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action ="";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;

            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                break;

            default:
                displayAll(request, response);
                break;
        }

    }
//Hiển thị form sửa thông tin khách hàng
    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customerapp/edit.jsp");
        int index = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(index-1);
        request.setAttribute("customer",customer);
        dispatcher.forward(request,response);
    }
//    Sửa Thôgn tin khách hàng
    private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int index = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        Customer customer = new Customer(index,name,address,email);
        customerService.update(index-1,customer);
        response.sendRedirect("/CustomerServlet");
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customerapp/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Thêm Khách hàng mới vào danh sách
    private void createNewCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = (int) Math.random()*100;
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        Customer customer = new Customer(id,name,address,email);
        customerService.save(customer);
        try {
            response.sendRedirect("/CustomerServlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//Hiển thị danh sách khách hàng
    private void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customerapp/list.jsp");
        List<Customer> customerList = customerService.findAll();
        request.setAttribute("cay",customerList);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action ="";
        }
        switch (action){
            case "create":
                createNewCustomer(request,response);
                break;
            case "edit":
                    edit(request,response);
                break;

            case "delete":
                break;
            default:
                displayAll(request, response);
                break;
        }

    }
}
