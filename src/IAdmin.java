/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Данил
 */
public interface IAdmin {
    void addTask(String task, String username, int tm);
    void deleteTask(String username, int number);
    String editTask(int number, String username, String newTask);
}
