package payroll;
/* When an EmployeeNotFoundException is thrown, this extra tidbit of Spring MVC configuration is used to render an HTTP 404 */
class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}
