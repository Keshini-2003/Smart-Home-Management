import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SmartHomeServlet")
public class SmartHomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private SmartHome smartHome = new SmartHome();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String device = request.getParameter("device");
        String deviceName = request.getParameter("deviceName");
        String action = request.getParameter("action");

        if (device != null) {  // Add new device
            if (device.equals("light")) {
                smartHome.addDevice(new Light("Living Room Light"));
            } else if (device.equals("thermostat")) {
                smartHome.addDevice(new Thermostat("Bedroom Thermostat"));
            } else if (device.equals("securitySystem")) {
                smartHome.addDevice(new SecuritySystem("Main Door Security"));
            }
        } else if (deviceName != null && action != null) {  // Control device
            boolean turnOn = action.equals("on");
            smartHome.controlDevice(deviceName, turnOn);
        }

        response.sendRedirect("index.html");
    }
}
