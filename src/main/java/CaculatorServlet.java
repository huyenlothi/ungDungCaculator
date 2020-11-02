import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorServlet",urlPatterns = "/caculator")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(request.getParameter("firstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        double result = 0;
        if(operator.equals("Addition")){
            result = Caculator.addition(firstOperand,secondOperand);
        }else if(operator.equals("Subtraction")){
            result = Caculator.subtraction(firstOperand,secondOperand);
        }else if(operator.equals("Multiplication")) {
            result = Caculator.multiplication(firstOperand, secondOperand);
        }else if(operator.equals("Division")) {
            result = Caculator.division(firstOperand, secondOperand);
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>Result: </h1> <br/>");
        printWriter.println(result);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
