/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {

    HashMap<Integer,Employee> map = new HashMap();
    public int getImportance(List<Employee> employees, int id) {

        for(Employee e : employees)
            map.put(e.id,e);

        return dfs(id);

    }

    public int dfs(int id_)
    {
        Employee x = map.get(id_);

        int value=0;

        value = x.importance;

        for(int s : x.subordinates)
            value += dfs(s);

        return value;
    }
}
