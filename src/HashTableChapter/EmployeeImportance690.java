package HashTableChapter;

import java.util.*;

/**
 * created by Hannah Li on 18/12/15
 * Project name: LeetcodeProject
 * LeetCode NO.: 690
 */
public class EmployeeImportance690 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        List<Integer> subordinates1 = new ArrayList<>();
        subordinates1.add(2);
        subordinates1.add(3);

        Employee em1 = new Employee();
        em1.id = 1;
        em1.importance = 5;
        em1.subordinates = subordinates1;
        employees.add(em1);

        List<Integer> subordinates2 = new ArrayList<>();
        subordinates2.add(0);
        subordinates2.add(0);
        Employee em2 = new Employee();
        em2.id = 2;
        em2.importance = 3;
        em2.subordinates = subordinates2;
        employees.add(em2);

        List<Integer> subordinates3 = new ArrayList<>();
        subordinates3.add(0);
        subordinates3.add(0);
        Employee em3 = new Employee();
        em3.id = 3;
        em3.importance = 3;
        em3.subordinates = subordinates3;
        employees.add(em3);


        System.out.print(getImportance(employees,1));
    }

    /**
     * You are given a data structure of employee information, which includes the employee's unique id,
     * his importance value and his direct subordinates' id.
     *
     * For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3.
     * They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]],
     * and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []].
     *
     * Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.
     * Now given the employee information of a company, and an employee id, you need to return the total importance
     * value of this employee and all his subordinates.
     *
     * Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
     * Output: 11
     * Explanation:
     * Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3.
     * They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.
     * 找到员工下属数量
     * 思路：首先需要以id找到value和下属，所以需要一个Map结构来索引；其次下属可能也有他自己的下属，并且没有一个确定的层级，所以只能用到递归。
     */
    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees){
            map.put(e.id, e);
        }
        return getSum(map, id);
    }

    private static int getSum(Map<Integer, Employee> map, int id) {
        Employee e = map.get(id);
        int total = e.importance;
        for(int n : e.subordinates){
            total += getSum(map,n);
        }
        return total;
    }


   static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

}
