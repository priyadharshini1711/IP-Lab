/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package newpackage;


/**
 *
 * @author LENOVO
 */
@WebService(serviceName = "NewService")
public class NewService {

  /**
   * This is a sample web service operation
     * @param i
     * @param j
     * @return 
   */
  @WebMethod(operationName = "add")
  public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
    int k = i + j;
    return k;
  }
}
